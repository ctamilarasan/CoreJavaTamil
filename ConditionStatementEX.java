package day4;
import java.util.Scanner;

public class ConditionStatementEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark :");
		int mark=sc.nextInt();
		if(mark<35 && mark>=0) {
			System.out.println("your fail");
		}else if(mark>=35 && mark<=100) {
			System.out.println("your pass");
		}else {
			System.out.println("invalid mark");
		}
	}
}
	


