package com.bridgelabz.EmployeeWageCalc;

public class EmployeeWageCalc {
	public static final int fullTimeHrs = 8;
	public static final int wagePerHour = 20;
	public static final int fullTime = 2;
	public static final int partTime = 1;
	public static final int absent = 0;
	
	public static void main(String[] args) {
		
		double empCheck = Math.floor(Math.random()*10)%3;
		int hours=0;
		switch((int)empCheck) {
		case fullTime: hours = fullTimeHrs;
		break;
		
		case partTime: hours = fullTimeHrs/2;
		break;
		
		case absent: hours = 0;
		}
		System.out.println("Daily Wage = "+(hours*wagePerHour));		
	}
}
