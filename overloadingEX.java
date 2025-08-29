package Opps_polymorphismEX;

class MathOpreator{
	// method with two parameters
	
	int add(int a,int b) 
	{
     	return a+b;	
	}
	
	// method with 3 parameters
	int add(int a,int b, int c) {
		return (a+b+c);
	}
}


public class overloadingEX {
	public static void main(String[] args) {
		
		MathOpreator obj = new MathOpreator();
		System.out.println("sum of 2 parametrs:"+obj.add(5, 10));
		System.out.println("sum of 3 parametres: "+obj.add(10, 20, 30));
	}

}
