//7. Write a program to enter the age of a person and check whether the person is eligible for voting or not ?[optional]



import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		//This is used to clear the scanner object.
		sc.nextLine();
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Please Verify Your name is  " + name +"  and your age is =" + age);
		if (age >= 18)
     		 System.out.println("You Are Eligible for Voting.");
   		 else
     		 System.out.println("You Are NOt Eligible for Voting.");
    

		
	}
	
	
}
