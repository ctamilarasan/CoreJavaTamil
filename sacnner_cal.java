package ScannerEX;

import java.util.Scanner;

public class sacnner_cal {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		
		System.out.println("addition: "+(a+b));
		System.out.println("subration: "+(a-b));
		System.out.println("multipulation: "+(a*b));
		System.out.println("division: "+(a/b));
		System.out.println("modules: "+(a%b));
	}

}
