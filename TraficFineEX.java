package day6;

import java.util.Scanner;

public class TraficFineEX {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle type (2 for 2-wheeler or 4 for 4-wheeler): ");
		int a = sc.nextInt();
		switch(a) {
		case 2:{
			System.out.println("enter the speed");
			int b=sc.nextInt();
			System.out.println("enter the speed limit");
			int c=sc.nextInt();
			int d=b-c;
			if(d>=1 && d<=10) {
				System.out.println("FINE AMOUNT : 500");
			}else if(d>=10 && d<=20){
				System.out.println("FINE AMOUNT :1000");
			}else if(d>=20) {
				System.out.println("FINE AMOUNT IS 2000");
				
			}else{
				System.out.println("no fine ,drive safely");
			}
			break;
		}
		case 4:{
			System.out.println("enter the speed");
			int e=sc.nextInt();
			System.out.println("enter the speed limit");
			int f=sc.nextInt();
			int g=e-f;
			if(g>=1 && g<=10) {
				System.out.println("FINE AMOUNT : 1000");
			}else if(g>=10 && g<=20){
				System.out.println("FINE AMOUNT :2000");
			}else if(g>=20) {
				System.out.println("FINE AMOUNT IS 3000");
			}
			else {
				System.out.println("no fine ,drive safely");
			}
			break;
	}

}
	}
}
