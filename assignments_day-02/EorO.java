//6. Write a program to check whether a given number is EVEN or ODD ?

import java.util.Scanner;
class EorO{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter The Number =");
    int x = scan.nextInt();
    if (x % 2 == 0)
      System.out.println("The number is even.");
    else
      System.out.println("The number is odd.");
    }
    }
