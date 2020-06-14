//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.edwin;
public class EmployeeTest {
	public EmployeeTest() {
	}

	public static void main(String[] var0) {
		Employee var1 = new Employee("Bob", "Jones", 2875.0D);
		Employee var2 = new Employee("Susan", "Baker", 3150.75D);
		Employee var3 = new Employee("John", "Lin", -5000.0D);
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", var1.getFirstName(), var1.getLastName(), 12.0D * var1.getMonthlySalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n", var2.getFirstName(), var2.getLastName(), 12.0D * var2.getMonthlySalary());
		System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f%n", var3.getFirstName(), var3.getLastName(), 12.0D * var3.getMonthlySalary());
		System.out.printf("%nIncreasing employee salaries by 10%%%n");
		var1.setMonthlySalary(var1.getMonthlySalary() * 1.1D);
		var2.setMonthlySalary(var2.getMonthlySalary() * 1.1D);
		var3.setMonthlySalary(var3.getMonthlySalary() * 1.1D);
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n", var1.getFirstName(), var1.getLastName(), 12.0D * var1.getMonthlySalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n", var2.getFirstName(), var2.getLastName(), 12.0D * var2.getMonthlySalary());
		System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f%n", var3.getFirstName(), var3.getLastName(), 12.0D * var3.getMonthlySalary());
	}
}
