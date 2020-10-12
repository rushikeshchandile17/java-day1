/*
 Q3. Write a java program to print the following patterns  -
	1 2 3 4 5 6 7
	1 2 3 4 5 6 
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1 
 */
public class Pattern {
	
	public static void main(String args[]) {
		
		
		for (int r=8; r>0; r--)
		{
			for(int s=1; s<r;s++)
			{
				System.out.print(s);
				System.out.print(" ");
				
			}
			System.out.println(" ");
			}
		}

}
