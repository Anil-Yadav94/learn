package com.aop.service;

public class MakePaymentImpl implements MakePayment {

	public void makePayment() {
		
		System.out.println("Payment Process Start...");
		
		//do Something
		
		
		
		System.out.println("Payment Process End.");
	}

	public void donePayment(int money) {
		
		System.out.println("Payment Completed for "+money+" Rs.");
		
	}

}
