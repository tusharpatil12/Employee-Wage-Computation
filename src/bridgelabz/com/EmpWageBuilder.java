package bridgelabz.com;

public class EmpWageBuilder {
	
	public  static  int is_full_time =1;
    public  static  int is_part_time =2;
    private  String company;
    private  double  empRatePerHour;
    private  int  numberOfWorkingDay;
    private  int  maxHourPerMonth;
    private double totalEmpWage=0;
    EmpWageBuilder(String company, int empRatePerHour, int numberOfWorkingDay, int maxHourPerMonth){
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDay = numberOfWorkingDay;
        this.maxHourPerMonth = maxHourPerMonth;
    }
    public  void calculateEmpWage(){
        int totalWorkingDay=0;
        int totalHoure=0;
        int empH=0;
        while (totalWorkingDay <= numberOfWorkingDay && totalHoure<maxHourPerMonth){
            totalWorkingDay++;
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case 1:
                    empH=8;
                    break;
                case 2:
                    empH=4;
                    break;
                default:
                    empH=0;
            }
            totalHoure+=empH;
            System.out.println("working day "+totalWorkingDay+" EmpHourse :"+empH);
        }
        totalEmpWage = totalHoure*empRatePerHour;
    }
    @Override
    public  String toString(){
        return "total Emp Wage for Company "+company+" "+totalEmpWage;
    }
    public static void main(String[] args) {
        EmpWageBuilder tcs = new EmpWageBuilder("TCS",20,20,100);
        EmpWageBuilder accenture = new EmpWageBuilder("accenture",20,20,100);
        System.out.println("......TCS........");
        tcs.calculateEmpWage();
        System.out.println(tcs);
        System.out.println("......Accenture........");
        accenture.calculateEmpWage();
        System.out.println(accenture);
    }

}
