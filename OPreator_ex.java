package datatypesEX;

public class OPreator_ex {
	public static void main(String[] args) {
		
		int a =12;
		int b =25;
		int c =10;
		int d =50;
		int e =5;
		int f =100;
		
		System.out.println("Enter the number: "+a);
		System.out.println("Enter the number: "+b);
		System.out.println();
		
	    System.out.println("Aruthmatic opreator");
	    System.out.println();
		
		System.out.println("Addtion: "+(a+b));
		System.out.println("subration: "+(a-b));
		System.out.println("multiplication: "+(a*b));
		System.out.println("division: "+(a/b));
		System.out.println("Modules: "+(a%b));
		System.out.println();
		
		System.out.println("Relation Opreator");
		System.out.println();
		System.out.println(a+">"+b+(a>b));
		System.out.println(a+"<"+b+(a<b));
		System.out.println(a+">="+b+(a>=b));
		System.out.println(a+"<="+b+(a<=b));
		System.out.println(a+"=="+b+(a==b));
		System.out.println(a+"!="+b+(a!=b));
		System.out.println();
		
		System.out.println("Logical opreator ");
		System.out.println();
		System.out.println("("+a+" > "+c+" AND "+b+" < "+d+")"+":"+((a>c)&&(b<d)));
		System.out.println("("+a+" < "+e+" OR "+b+" > "+f+")"+":"+((a<e)||(b>f)));
		System.out.println();
		
		
		System.out.println("Assigment opreator");
		System.out.println();
		System.out.println("intial value "+c);
		System.out.println("After +=: "+(c+=12));
		System.out.println("After -=: "+(c-=12));
		System.out.println("After =: "+(c=12));
		System.out.println("After /=: "+(c/=12));
		System.out.println("After %=: "+(c%=12));
		System.out.println();
		
		
		System.out.println("Unary opreator: ");
		System.out.println("Intial value : "+a);
		System.out.println("After increment: "+(++a));
		System.out.println("After decrement: "+(--a));
		
		
		
		
	}

}
