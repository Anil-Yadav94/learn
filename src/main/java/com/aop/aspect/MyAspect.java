package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	//@Befor(PointCut):== pointCut --> execution(<return type of method> * means all returnType 
	//<Method full name() with pakageClass) id you have argument then in method name add (..)
	@Before("execution(* com.aop.service.MakePaymentImpl.makePayment())")
	public void runBefore()
	{
		System.out.println("Before Process Start");
	}
	
	@After("execution(* com.aop.service.MakePaymentImpl.donePayment(..))")
	public void runAfter()
	{
		System.out.println("Payment Done! Have a nice Day.");
	}
}
