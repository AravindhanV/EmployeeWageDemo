package com.bridgelabz.EmployeeWageCalc;

public class EmployeeWageCalc {
	public static void main(String[] args) {
		int employeePresent = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		
		if(empCheck == employeePresent) {
			System.out.println("Employee Present");
		}
		else {
			System.out.println("Employee Absent");
		}
	}
}
