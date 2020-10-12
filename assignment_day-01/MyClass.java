import java.util.Scanner;
class MyClass {
	public static void main (String args[])
{
	Scanner myObj = new Scanner (System.in);
	String userName;
	System.out.println("Enter Name :");
	userName = myObj.nextLine();

	System.out.println("Hello Dear," + userName );

	}
}