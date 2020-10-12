*Q1. Write a java program to find volume and surface area of a sphere using multiple classes?
Notes :
     Surface Area of Sphere = 4 * Math.PI * radius* radius
     Volume of Sphere = 4/3 * Math.PI * radius * radius * radius
     Use constructor to set radius
     User Scanner to take user input*/


public class Sphere {
	public static void main(String args[]) {
		
		System.out.print("Enter Radius Of Sphere = ");
			Volume boj = new Volume();
			boj.Rad();
			System.out.println("Radius Of Sphere is = "+boj.x);
			boj.vol();
			boj.Sarea();
			
			
			
			
			
		
	}

}
