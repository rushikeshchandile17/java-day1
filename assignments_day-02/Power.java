
import java.util.Scanner;
class Power{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Base Number=");
		int x = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Power number=");
		int y = scan.nextInt();
		int i,t=1;
		
		for (i = 1; i <= y; i++) {
			
			t=t*x;
		}
		System.out.println(t);
	}

}