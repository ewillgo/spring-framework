package org.springframework.sourceview;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@Test
	public void testInitSpringFramework() {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
//		ac.setAllowCircularReferences(false);
		ac.register(AppConfig.class);
		ac.refresh();

		System.out.println("hello");
	}
}
