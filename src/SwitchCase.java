
public class SwitchCase {

	public static void main(String[] args) {
		int wage_per_hour =20;
		int part_time_hour =4;
		int full_day_hour =8;
		int employeewage =0;
		int employeeCheck = (int) Math.floor(Math.random() * 10 % 3);
		switch(employeeCheck)
		{
			case 1 :
				System.out.println("employee is present");
				
				
				break;
				
			case 2 :
				employeewage = part_time_hour * wage_per_hour;
				System.out.println("employee daily wage");
				
				
				break; 
				
			case 3 :
				employeewage = full_day_hour * wage_per_hour;
				System.out.println("employee daily wage");
				
				break;
				default:
					System.out.println("employee is absent");
		}
		

	}

}
