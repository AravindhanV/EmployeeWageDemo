package com.bridgelabz.EmployeeWageCalc;

public class EmployeeWageCalculator {
	public static final int FULL_TIME_HRS = 8;
	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;
	public static final int ABSENT = 0;

	private int noOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageCalculator() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String companyName, int wagePerHour, int noOfDays, int maxHoursPerMonth) {

		companyEmpWageArray[noOfCompany] = new CompanyEmpWage(companyName, wagePerHour, noOfDays, maxHoursPerMonth);
		noOfCompany++;
	}
	
	public void calculateCompanyEmpWage() {
		for(int index=0;index<noOfCompany;index++) {
			companyEmpWageArray[index].setTotalEmpWage(calculateEmpWage(companyEmpWageArray[index]));
			System.out.println(companyEmpWageArray[index]);
		}
	}

	public int calculateEmpWage(CompanyEmpWage companyEmpWage) {
		int totalHrs = 0, day = 0;
		while (totalHrs < companyEmpWage.maxHoursPerMonth && day < companyEmpWage.noOfDays) {
			int hours = 0;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case FULL_TIME:
				hours = FULL_TIME_HRS;
				break;

			case PART_TIME:
				hours = FULL_TIME_HRS / 2;
				break;

			case ABSENT:
				hours = 0;
			}
			totalHrs += hours;
			day++;
			System.out.println("Day " + day + ": " + hours + " hours");
		}
		return totalHrs * companyEmpWage.wagePerHour;
	}

	public static void main(String[] args) {

		EmployeeWageCalculator empWageCalculator = new EmployeeWageCalculator();
		empWageCalculator.addCompanyEmpWage("DMart", 20, 6, 10);
		empWageCalculator.addCompanyEmpWage("Reliance", 10, 5, 20);
		empWageCalculator.calculateCompanyEmpWage();

	}
}
