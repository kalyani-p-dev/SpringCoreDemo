package com.zensar;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext iocContainer = new
				ClassPathXmlApplicationContext("Beans_simple.xml");
		
		Item item = (Item)iocContainer.getBean("itemBean");
		Order order = (Order)iocContainer.getBean("orderBean");
		
		System.out.println("item: " + item);
		System.out.println("order: " + order);
		
		iocContainer.registerShutdownHook();
	}

}
