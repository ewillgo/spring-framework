package com.sourceview;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sourceview.service.OrderService;

public class Main {

	public static void main(String[] args) {

//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
//		ac.setAllowCircularReferences(false);
//		ac.register(AppConfig.class);
//		ac.refresh();

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		OrderService orderService = ac.getBean("orderService", OrderService.class);
		System.out.println(orderService.getUserService());
	}
}
