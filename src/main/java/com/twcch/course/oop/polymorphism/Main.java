package com.twcch.course.oop.polymorphism;

public class Main {

	public static void main(String[] args) {

		Employee[] emp1 = { new Sales(1, "Alan", 50000), 
							new Secretary(2, "Amy", 45000) };

		System.out.println("id: " + emp1[0].getId() + 
				", name: " + emp1[0].getName() + 
				", salary: " + emp1[0].getSalary());

		System.out.println("id: " + emp1[1].getId() + 
				", name: " + emp1[1].getName() + 
				", salary: " + emp1[1].getSalary());
		
	}

}
