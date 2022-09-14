package bridgelabz.com;

import java.util.Random;

public class EmployeeComputer {
	
	int random;
    int Wage_per_Hour;
    int Hour;
    double totalEmployeeWage;
    double EmployeeWage;
    private int totalDay=20;
    private  String name;
    EmployeeComputer(String name,int  Wage_per_Hour){
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
    }
    public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
            EmployeeComputer month =new EmployeeComputer("computer",20);
            month.calculate();
    }


}
