//3. Write a java program to calculate simple interest, get the required inputs 
//from Scanner ?
//   SI = (principal * rate * years)/100



import java.util.Scanner;
class SimpleInterest{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Principle Amount = ");
    double Pa = scan.nextDouble();
    System.out.print("Enter Rate of Interest = ");
    double Rate = scan.nextDouble();
    System.out.print("Enter Years = ");
    double Y = scan.nextDouble();
    double Si = (Pa*Rate*Y)/100;
    System.out.print("Simple Interest is =  " +Si );
  }
}
