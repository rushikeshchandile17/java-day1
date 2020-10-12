/*
Q2. Write a java program to check the equality of two integer arrays.
Notes :
     Create two integer array by taking input from user (using Scanner)
     Check if both array contains same values */



import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	System.out.print("Enter Length OF Array = ");
	int l = scan.nextInt();
	
	int a[] = new int[l];
	 System.out.println("Enter all the elements of 1st array :");
     for(int i = 0; i < l; i++)
     {
         a[i] = scan.nextInt();
         
         
     }
     System.out.println("1st array is = "+Arrays.toString(a));
         
	int b[]= new int[l];
	System.out.print("Enter all the elements of 2nd array :");
	for(int i = 0; i < l; i++)
    {
        b[i] = scan.nextInt();
    }
	System.out.println("2nd array is = "+Arrays.toString(b));
	
	boolean equalOrNot = true;
    
    if(a.length == b.length)
    {
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] != b[i])
            {
                equalOrNot = false;
            }
        }
    }
    else
    {
        equalOrNot = false;
    }
     
    if (equalOrNot)
    {
	System.out.println("***********************************");
        System.out.print(" Both Arrays Are Equal");
    }
    else
    {
    	System.out.println("***********************************");
        System.out.print("Both Arrays Are Not Equal");
    }

			
		

	}

}
