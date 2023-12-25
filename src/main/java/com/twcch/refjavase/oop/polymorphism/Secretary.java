package com.twcch.refjavase.oop.polymorphism;

public class Secretary extends Employee {

	public Secretary(int id, String name, int salary) {
		super(id, name, salary);
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void setId(int id) {
		super.setId(id);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public int getSalary() {
		return super.getSalary();
	}

	@Override
	public void setSalary(int salary) {
		super.setSalary(salary);
	}

}
