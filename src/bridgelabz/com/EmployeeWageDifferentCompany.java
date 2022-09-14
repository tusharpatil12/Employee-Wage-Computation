package bridgelabz.com;

import java.util.Random;

public class EmployeeWageDifferentCompany {
	
	 int random;
	    int Wage_per_Hour;
	    int Hour;
	    double totalEmployeeWage;
	    double EmployeeWage;
	    private int totalDay=20;
	    private  String name;
	    EmployeeWageDifferentCompany(String name,int  Wage_per_Hour){
	        this.Wage_per_Hour= Wage_per_Hour;
	        this.name=name;
	    }
	    public int randomNumber(){
	        Random r = new Random();
	        random = r.nextInt(3);
	        return random;
	    }
	    public  void calculate(){
	        for ( int day = 1; day <=totalDay; day++){
	            random=randomNumber();
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
	            System.out.println("Employee wage per day is : " + day +" -> "+EmployeeWage);
	        }
	        System.out.println("................................");
	        System.out.println(" The "+ name+"  Employee  total Wage  one Month is "+ totalEmployeeWage);
	        System.out.println();
	        System.out.println("................................");
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	        EmployeeWageDifferentCompany month1 =new EmployeeWageDifferentCompany("TCS",20);
	        EmployeeWageDifferentCompany month2 =new EmployeeWageDifferentCompany("accunture",20);
	        EmployeeWageDifferentCompany month3 =new EmployeeWageDifferentCompany("Wipro",20);
	        month1.calculate();
	        month2.calculate();
	        month3.calculate();
	    }

}
