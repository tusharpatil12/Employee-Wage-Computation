
public class UC2 {

	public static void main(String[] args) {
		int wagePerHour =20;
		int fullDayHour =8;
		int dailyWage =0;
		int employeeCheck =(int) Math.floor(Math.random() * 10) % 2;
		if(employeeCheck == 1) {
			dailyWage = fullDayHour * wagePerHour;
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
		System.out.println("Employee total wage is: " + dailyWage);
			
	}

}
