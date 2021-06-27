package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.MakePayment;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Main Method Start..." );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/aop/config.xml");
        
        MakePayment payment = context.getBean("payment", MakePayment.class);
        payment.makePayment();
        
        payment.donePayment(5000);
    }
}
