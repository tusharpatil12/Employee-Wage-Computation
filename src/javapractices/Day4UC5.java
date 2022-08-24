package javapractices;

public class Day4UC5 {
	
	public static final int IS_PART_TIME = 0;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS =2;
	
	
	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		
		for (int day = 1; day < NUM_OF_WORKING_DAYS; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
		 break;
			case IS_FULL_TIME:
				empHrs =4;
				break;
				default:
					empHrs = 0;
					
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage +=empWage;
			System.out.println("EmpWage: " + empWage);
		}
		System.out.println("Total Emp Wage: " +totalEmpWage);

			
	}
}