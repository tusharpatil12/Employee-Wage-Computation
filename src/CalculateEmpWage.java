
public class CalculateEmpWage {

	public static void main(String[] args) {
	    double empCheck = ((Math.random())*10%2);
	    System.out.println(empCheck);
	    double flag = Math.floor(empCheck);	    
	    		System.out.println(flag);
	    		if(flag == 1) {
	    			System.out.println("Employee is present");
	    		}else {
	    			System.out.println("Employee is absent");
	    		}
	    			
	    		
	}

}
