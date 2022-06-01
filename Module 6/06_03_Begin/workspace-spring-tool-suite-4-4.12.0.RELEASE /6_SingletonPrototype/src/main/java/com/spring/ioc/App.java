package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		try {
			// Get the "RiseShine" bean object and call getName() method
			RiseShine myObject1 = (RiseShine) context.getBean("rs");

			// Set the name
			myObject1.setName("myObject1");
			System.out.println("Rise object (Rise1) Your name is: " + myObject1.getName());

			// Get another "RiseShine" bean object and call getName() method
			RiseShine myObject2 = (RiseShine) context.getBean("rs");

			System.out.println("Rise object (Rise2) Your name is: " + myObject2.getName());

			// Now compare the references to see whether they are pointing to the
			// same object or different object
			System.out.println(
					"'myObject1' and 'myObject2' are referring to the same object: " + (myObject1 == myObject2));

			// Print the address of both object myObject1 and myObject2
			System.out.println("Address of object myObject1: " + myObject1);
			System.out.println("Address of object myObject2: " + myObject2);

		} finally {
			context.close();
		}

	}
}
