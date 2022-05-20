package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnoSecurityAspect {

	@Before("execution(* com.sky.aop.ApplicationService.*(. .))")
	public void verificationForm() {
		System.out.println("Ina Anno before call");
	}

	@After("execution(* com.sky.aop.ApplicationService.*(. .))")
	public void proccessResult() {
		System.out.println("Ina Anno After call proccessResult");
	}
	
	@Before("@annotation(auditable)")
    public void diAccessCheck4(Auditable auditable) {
		System.out.println("do access check 4"+" "+auditable.value());
	}
}
