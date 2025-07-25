package day5;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1 : addition /n  2 : subtraction /n  3 : multiplication   4 : division  /n  5 : modulus");
		int num = sc.nextInt();
		switch(num) {
		case 1 :{
			System.out.println("enter the 1st number");
			int a =sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println("additon : " + (a+b));
			break;
		}
		case 2 :{
			System.out.println("enter the 1st number");
			int a =sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println("Subtraction : " + (a-b));
			break;
		}
		case 3 :{
			System.out.println("enter the 1st number");
			int a =sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println("Multiplication : " + (a*b));
			break;
		}
		case 4 :{
			System.out.println("enter the 1st number");
			int a =sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println("Division : " + (a/b));
			break;
		}
		case 5 :{
			System.out.println("enter the 1st number");
			int a =sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println("modulus : " + (a%b));
			break;
		}
		default :{
			System.out.println("enter correct choice");
		}
		}
	
		
	}

}
