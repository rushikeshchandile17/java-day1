//5. Write a program to calculate the monthly salary of an employee : 
//	take input for basic salary,
//	HRA is 40% of basic salary,
//	PF amount to be deducted is 12% of basic,
//	Medical allowance is Rs 1200 per month, 
//	Traveling allowance is Rs 800 per month,
//	Professional tax to be deducted is Rs 300.



import java.util.Scanner;
class MonthlySalary{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Base Salary");
    double BaseSalary = scan.nextDouble();
    double Hra = BaseSalary*0.4;
    double Pf = BaseSalary*0.12;// Deduction
    double Med = 1200;
    double Ta = 800;
    double Pt = 300;//Deduction
    double Sal = BaseSalary+Hra-Pf+Med+Ta-300;
    System.out.print("MOnthly Salary Is:"+Sal );

  }
}
