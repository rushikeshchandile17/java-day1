import java.util.Scanner;
class Facto{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter The Number =");
    int x = scan.nextInt();
    int fact=1;
    int i;
    for(i=x; i>0; i--)
      fact = fact*i;
    System.out.println("Factorial Of Number = " +fact);

}
}
