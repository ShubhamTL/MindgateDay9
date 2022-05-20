package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceIMP1 implements ApplicationService {

	@Override
	public void proccessApplication() {
	System.out.println("in ApplicationServiceIMP1");
	}

	@Override
	public String proccessApplicationWithAudit() {
		System.out.println("Proccess Applictionform in service");
		return "success";
	}
	
	

}
