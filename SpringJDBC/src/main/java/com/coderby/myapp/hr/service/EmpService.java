package com.coderby.myapp.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderby.myapp.hr.dao.IEmpRepository;
import com.coderby.myapp.hr.model.EmpVO;

@Service
public class EmpService implements IEmpService {

	@Autowired
	IEmpRepository er;
	
	@Override
	public int getEmpCount() {
		return er.getEmpCount();
	}

	@Override
	public int getEmpCount(int deptid) {
		return er.getEmpCount(deptid);
	}

	@Override
	public List<EmpVO> getEmpList() {
		return er.getEmpList();
	}

	@Override
	public EmpVO getEmpInfo(int empid) {
		return er.getEmpInfo(empid);
	}

	@Override
	public void updateEmp(EmpVO emp) {
		er.updateEmp(emp);
	}

	@Override
	public void insertEmp(EmpVO emp) {
		er.insertEmp(emp);
	}

	@Override
	public void deleteJobHistory(int empid) {
		er.deleteJobHistory(empid);
	}

	@Override
	public int deleteEmp(int empid, String email) {
		deleteJobHistory(empid);
		return er.deleteEmp(empid, email);
	}

	@Override
	public List<Map<String, Object>> getAllDeptId() {	
		return er.getAllDeptId();
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		return er.getAllJobId();
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		return er.getAllManagerId();
	}

}
