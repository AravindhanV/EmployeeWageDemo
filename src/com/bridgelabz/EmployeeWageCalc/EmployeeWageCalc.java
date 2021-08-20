package com.bridgelabz.EmployeeWageCalc;

public class EmployeeWageCalc {
	public static final int fullTimeHrs = 8;
	public static final int wagePerHour = 20;
	public static final int fullTime = 2;
	public static final int partTime = 1;
	public static final int absent = 0;
	
	public static void main(String[] args) {
		
		int totalHrs = 0,i=0;
		int noOfDays = 20, maxHrs = 100;		
		while(totalHrs < 100 && i < noOfDays) {
			int hours=0;
			double empCheck = Math.floor(Math.random()*10)%3;
			switch((int)empCheck) {
			case fullTime: hours = fullTimeHrs;
			break;
			
			case partTime: hours = fullTimeHrs/2;
			break;
			
			case absent: hours = 0;
			}
			totalHrs += hours;
			i++;
			System.out.println("Day "+i+": "+hours+" hours");
		}
		totalHrs = totalHrs>100 ? 100 : totalHrs;
		System.out.println(i+" "+totalHrs+" Monthly Wage = "+(totalHrs*wagePerHour));		
	}
}
