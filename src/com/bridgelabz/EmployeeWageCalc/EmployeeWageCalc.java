package com.bridgelabz.EmployeeWageCalc;

public class EmployeeWageCalc {
	public static final int employeePresent = 1;
	public static final int fullTime = 8;
	public static final int wagePerHour = 20;
	
	public static void main(String[] args) {
		
		double empCheck = Math.floor(Math.random()*10)%2;
		int dailyWage = 0,hours=0;
		if(empCheck == employeePresent) {
			hours = fullTime;
		}
		System.out.println("Daily Wage = "+(hours*wagePerHour));		
	}
}
