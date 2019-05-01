package com.coderby.myapp.hr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coderby.myapp.hr.model.EmpVO;
import com.coderby.myapp.hr.service.IEmpService;

@Controller
public class EMPController {

	@Autowired
	IEmpService es;

	@RequestMapping(value="/hr/count")
	public String empCount(@RequestParam(value="deptid", required=false, defaultValue="0") int deptid, Model model) {
		if(deptid==0) {
			model.addAttribute("count", es.getEmpCount());
		}else {
			model.addAttribute("count", es.getEmpCount(deptid));
		}
		return "hr/count";
	}

	@RequestMapping(value= {"/hr", "/hr/list"})
	public String getAllEmps(Model model) {
		List<EmpVO> empList = es.getEmpList();
		model.addAttribute("empList", empList);
		return "hr/list";
	}

	@RequestMapping(value="/hr/{empId}")
	public String getEmpInfo(@PathVariable int empId, Model model) {
		EmpVO emp = es.getEmpInfo(empId);
		model.addAttribute("emp", emp);
		return "hr/view";
	}

	@RequestMapping(value="/hr/insert", method=RequestMethod.GET)
	public String insertEmp(Model model) {
		model.addAttribute("emp",new EmpVO());
		model.addAttribute("deptList", es.getAllDeptId());
		model.addAttribute("jobList", es.getAllJobId());
		model.addAttribute("managerList", es.getAllManagerId());
		return "hr/form";
	}

	@RequestMapping(value="/hr/insert", method=RequestMethod.POST)
	public String insertEmp(@ModelAttribute("emp") @Valid EmpVO emp, BindingResult result, Model model, RedirectAttributes redirectAttrs) {
		if(result.hasErrors()) {
			model.addAttribute("deptList", es.getAllDeptId());
			model.addAttribute("jobList", es.getAllJobId());
			model.addAttribute("managerList", es.getAllManagerId());
			return "hr/form";
		}
		try {
			es.insertEmp(emp);
		}catch(RuntimeException e) {
			redirectAttrs.addFlashAttribute("message", e.getMessage());
		}
		return "redirect:/hr";
	}

	@RequestMapping(value="/hr/update", method=RequestMethod.GET)
	public String updateEmp(int empid, Model model) {
		model.addAttribute("emp", es.getEmpInfo(empid));
		model.addAttribute("deptList", es.getAllDeptId());
		model.addAttribute("jobList", es.getAllJobId());
		model.addAttribute("managerList", es.getAllManagerId());
		return "hr/updateform";
	}

	@RequestMapping(value="/hr/update", method=RequestMethod.POST)
	public String updateEmp(EmpVO emp, Model model) {
		es.updateEmp(emp);
		return "redirect:/hr/"+emp.getEmployeeId();
	}

	@RequestMapping(value="/hr/delete", method=RequestMethod.GET)
	public String deleteEmp(int empid, Model model) {
		model.addAttribute("emp", es.getEmpInfo(empid));
		return "hr/deleteform";
	}

	@RequestMapping(value="/hr/delete", method=RequestMethod.POST)
	public String deleteEmp(int empid, String email, Model model) {
		if(es.deleteEmp(empid, email)>0) {
			return "redirect:/hr";
		}else {
			throw new RuntimeException("해당 이메일이 없습니다.");
		}
	}

	@ExceptionHandler({RuntimeException.class})
	public ModelAndView runEx(HttpServletRequest request, Exception ex) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("url", request.getRequestURI());
		mav.addObject("exception", ex);
		mav.setViewName("error/runtime");
		return mav;
	}
}
