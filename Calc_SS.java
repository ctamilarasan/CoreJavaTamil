package Switch_statement;
import java.util.*;

public class Calc_SS {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number: ");
		int a=sc.nextInt();
		
		System.out.println("enter the secound number: ");
		int b=sc.nextInt();
		
		char Opreator;
		System.out.println("enter the opretor:  + , - , * , / , % ");
		Opreator = sc.next().charAt(0);
		
		switch(Opreator) 
		{
		case '+':
		{
			System.out.println("add: "+(a+b));
		}break;
		
		case '-':
		{
			System.out.println("sub: "+(a-b) );
		}break;
		
		case '*':
		{
			System.out.println("mult: "+(a*b));
		}break;
		
		case '/':
		{
			System.out.println("divid: "+(a/b));
		}break;
		
		case '%':
		{
			System.out.println("mod: "+(a%b));
		}break;
		
		default:
		{
			System.out.println("enter the valid opreators: ");
		}
		}
		
	}

}
