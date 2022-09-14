package bridgelabz.com;

import java.util.Random;

public class EmpWageCondition {
	
	 int random;
	    int Wage_per_Hour;
	    int Hour;
	    double totalEmployeeWage;
	    double EmployeeWage;
	    int max_number_of_day;
	    int max_number_of_hour;
	    int total_number_day=0;
	    int total_number_hour=0;
	    EmpWageCondition(int  Wage_per_Hour,int max_number_of_day,int max_number_of_hour){
	        this.Wage_per_Hour= Wage_per_Hour;
	        this.max_number_of_hour=max_number_of_hour;
	        this.max_number_of_day=max_number_of_day;
	    }
	    public int randomNumber(){
	        Random r = new Random();
	        random = r.nextInt(3);
	        return random;
	    }
	    public  void calculate(){
	        while (total_number_day<=max_number_of_day && total_number_hour<=max_number_of_hour){
	            random=randomNumber();
	            total_number_day++;
	            switch (random){
	                case 1:
	                    Hour=8;
	                    break;
	                case 2:
	                    Hour=4;
	                    break;
	                default:
	                    Hour=0;
	            }
	            EmployeeWage=Wage_per_Hour*Hour;
	            totalEmployeeWage=totalEmployeeWage+EmployeeWage;
	            System.out.println("Employee wage  is  -> "+EmployeeWage);
	        }
	        System.out.println("................................");
	        System.out.println(" Total Employee Wage  is "+ totalEmployeeWage);
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	        EmpWageCondition month = new EmpWageCondition(20, 20, 100);
	        month.calculate();
	    }

}
