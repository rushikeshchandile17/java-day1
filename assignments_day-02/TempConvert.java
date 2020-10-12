//4. Write a java program to convert temperature from celsius to fahrenheit, 
//get input using Scanner ?
//(C-0)/100 = (F-32)/180
//C = (5/9)*(F-32)
//F = (9*C/5) + 32



import java.util.Scanner;
class TempConvert{
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter Temperature in Degree Celcius = ");
  double C = scan.nextDouble();
  System.out.print("Enter Temperature in Ferenite = ");
  double F = scan.nextDouble();
  double D = ((0.6)*(F-32));
  double Fe = (9*C/5) + 32;
  System.out.print("Temperature in Degree = " +D);
  System.out.print("Temperature in Ferenite = " +Fe);



}
}
