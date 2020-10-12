import java.util.Scanner;

public class Volume {
	double x;
	public void Rad() {
		
		Scanner scan = new Scanner(System.in);
				
		x = scan.nextDouble();
		
		scan.close();
	}
	    
		
	
	void vol() {
		System.out.print("Voulume Of Spher is = ");
		System.out.println((1.33)*Math.PI*x*x*x);
				
	}
	void Sarea () {
	System.out.print("Surface Area Is : ");
	System.out.println(4*Math.PI*x*x);
		}
	
		
	

}
