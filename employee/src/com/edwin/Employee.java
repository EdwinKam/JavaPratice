//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.edwin;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String var1, String var2, double var3) {
		this.setFirstName(var1);
		this.setLastName(var2);
		this.setMonthlySalary(var3);
	}

	public void setFirstName(String var1) {
		this.firstName = var1;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String var1) {
		this.lastName = var1;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setMonthlySalary(double var1) {
		if (var1 >= 0.0D) {
			this.monthlySalary = var1;
		} else {
			System.out.println("\n\n");
			System.out.printf("***The inputted salary: %.2f", var1);
			System.out.print(" for " + this.getFirstName() + " " + this.getLastName() + " is less than zero.");
			System.out.println("\nSet the salary to $1,000.00.***\n\n");
			this.monthlySalary = 1000.0D;
		}

	}

	public double getMonthlySalary() {
		return this.monthlySalary;
	}
}
