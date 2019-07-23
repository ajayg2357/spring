package com.cg.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("user.xml");
		User user = (User)ctx.getBean("user");
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		

	}

}
