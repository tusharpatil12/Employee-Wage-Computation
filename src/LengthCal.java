
public class LengthCal {

	public static void main(String[] args) {
		int x1,x2,y1,y2;
		x1=2;x2=5;y1=4;y2=8;
		
		double distance=Math.sqrt(x2-x1)*2 +(y2-y1)*2;
		System.out.println("distance between = "+"("+x1+","+y1+"),"+"("+x2+","+y2+") "+distance);
	}

}
