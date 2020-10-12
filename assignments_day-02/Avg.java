
// Write a java program to take three numbers using Scanner and print the average ?
//> java Avg 5 6 4
//Average=5
import java.util.Scanner;
class Avg{
public static void main (String args[]){
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter three numbers =");
  int n1 = scan.nextInt();
  int n2 = scan.nextInt();
  int n3 = scan.nextInt();
  int Average = (n1+n2+n3)/3;
  System.out.println("Total Average = " + Average);

}

}
