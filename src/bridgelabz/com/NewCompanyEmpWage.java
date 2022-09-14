package bridgelabz.com;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
interface INewCompanyEmpWage{
    public void addCompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);
    public void computerWage();
    public int getTotalWage(String companyName);

public class NewCompanyEmpWage {
	
	 public   String companyName;
	    public  int wagePerHr;
	    public int maxWorkingDays;
	    public  int maxWorkingHrs;
	    public  int totalEmpWage;
	    public NewCompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
	        this.companyName = companyName;
	        this.wagePerHr = wagePerHr;
	        this.maxWorkingDays = maxWorkingDays;
	        this.maxWorkingHrs = maxWorkingHrs;
	        totalEmpWage = 0;
	    }
	    public void setTotalEmpWage(int totalEmpWage) {
	        this.totalEmpWage = totalEmpWage;
	    }

	    @Override
	    public String toString() {
	        String totalWage = "total EmpWage for company " + companyName + "is " + totalEmpWage;
	        return totalWage;
	    }
	}
	class NewEmpWage  implements INewCompanyEmpWage {
	    private final int is_full_time = 1;
	    private final int is_part_time = 2;
	    private int nomOfCompany = 0;
	    private LinkedList<NewCompanyEmpWage> newCompanyEmpWages;
	    private Map<String, NewCompanyEmpWage> newCompanyEmpWageMap;
	    NewEmpWage() {
	        newCompanyEmpWages = new LinkedList<>();
	        newCompanyEmpWageMap = new HashMap<>();
	    }
	    public void addCompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
	        NewCompanyEmpWage newCompanyEmpWage = new NewCompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
	        newCompanyEmpWages.add(newCompanyEmpWage);
	        newCompanyEmpWageMap.put(companyName, newCompanyEmpWage);
	    }
	    public void computerWage() {
	        for (int index = 0; index < newCompanyEmpWages.size(); index++) {
	            NewCompanyEmpWage newCompanyEmpWage = newCompanyEmpWages.get(index);
	            newCompanyEmpWage.setTotalEmpWage(this.computerWage(newCompanyEmpWage));
	        }
	    }
	    public int getTotalWage(String companyName) {
	        return newCompanyEmpWageMap.get(companyName).totalEmpWage;
	    }
	    public int computerWage(NewCompanyEmpWage newCompanyEmpWage){
	        int empHour = 0; int totalWorkingDay =0; int totalWorkingHour = 0;
	        int totalHoure = 0;
	        while (totalWorkingDay<= newCompanyEmpWage.maxWorkingDays && totalWorkingHour< newCompanyEmpWage.maxWorkingHrs){
	            totalWorkingDay++;
	            int empCheck = (int)Math.floor(Math.random()*10)%3;
	            switch (empCheck) {
	                case 1:
	                    empHour = 8;
	                    break;
	                case 2:
	                    empHour = 4;
	                    break;
	                default:
	                    empHour = 0;
	            }
	            totalHoure+=empHour;
	            System.out.println("Day  "+totalWorkingDay +" Emp Hour "+empHour);
	        }
	        newCompanyEmpWage.totalEmpWage = totalHoure*newCompanyEmpWage.wagePerHr;
	        return newCompanyEmpWage.totalEmpWage;
	    }
	    public static void main(String[] args) {
	        INewCompanyEmpWage empWage   = new NewEmpWage();
	        empWage.addCompanyEmpWage("TCS",20,20,100);
	        empWage.addCompanyEmpWage("Mahendra",20,20,100);
	        empWage.addCompanyEmpWage("Accenture",20,20,100);
	        empWage.addCompanyEmpWage("Hexaware",20,20,100);
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter Company name");
	        String name = sc.nextLine();
	        empWage.computerWage();
	        System.out.println("total Wage for "+name+" company "+empWage.getTotalWage(name));
	    }	        
	}
}
	    
