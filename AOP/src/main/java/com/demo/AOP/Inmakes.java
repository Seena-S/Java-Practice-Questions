package com.demo.AOP;

import org.springframework.stereotype.Component;

@Component
public class Inmakes {
	
	public void displayCourses() {
		System.out.println("Displaying all courses..");
	}
	public void displayCourses(String course) {
		System.out.println("Displaying course = "+course);
	}
	
	public void displaySecurity() {
		System.out.println("Accessing secure");
	}
	public void transaction(String string) {
		System.out.println("Transaction started..");
		
	}
	public int amount(int amt) {
		System.out.println("Inside amount "+amt);
		return 2500;
	}

}
