package com.coderby.myapp.hr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.hr.service.IEmpService;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("spring/app-con.xml");
		IEmpService es = context.getBean("empService", IEmpService.class);
		
		System.out.println("사원 수 조회");
		System.out.println(es.getEmpCount());
		
		System.out.println("사원 정보 조회");
		System.out.println(es.getEmpInfo(101));
		context.close();
		
	}

}
