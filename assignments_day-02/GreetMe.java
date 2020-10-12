//1. Write a program to take "name" from user using Scanner and print "Hello "+<name> on the console?
//> java Hello Kaif
//Hello Kaif


import java.util.Scanner;

class GreetMe {
public static void main (String args[]){

Scanner scan = new Scanner(System.in);
System.out.print("Enter Your Name :");
String name = scan.next();
System.out.println("Hello, " + name);


}

}
