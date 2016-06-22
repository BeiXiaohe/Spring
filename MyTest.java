package com.bjpowernode.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	@Test
	public void test01(){
		String resource = "com/bjpowernode/annotation/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("someService");
		
		service.doSome();
		System.out.println("-----------------------");
		service.doOther();
		System.out.println("-----------------------");
		service.doThird();
	}
	
}

























