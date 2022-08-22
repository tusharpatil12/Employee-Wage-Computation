package javapractices;

public class Day4UC3 {

	public static void main(String[] args) {
		int IS_PART_TIME = 1;
		int IS_FULL_TIME =2;
		int EMP_RATE_PER_HOURS = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_PART_TIME)
		empHrs = 4;
		else
		if (empCheck == IS_FULL_TIME) 
			empHrs = 8;
			else
				empHrs = 0;
		  
	    empWage = empHrs * EMP_RATE_PER_HOURS;
		System.out.println("Emp wage: " + empWage);

		
	}
	
}
