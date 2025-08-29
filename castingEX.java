package TypeofCasting;

public class castingEX {
	public static void main(String[] args) {
		
	System.out.println("================EMPLICIT CASTING============");
		
		
		byte b=100;
		short s =b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		
		
		char c='A';      // CHAR TO INT IMPLICITLY
		int ci=c;
		System.out.println();
		
		System.out.println("byte to short: "+s);
		System.out.println("short to int: "+i);
		System.out.println("int to long: "+l);
		System.out.println("long to float: "+f);
		System.out.println("float to double: "+d);
		System.out.println("char to int: "+ci);
		System.out.println();
		
		
		System.out.println("==============EXPLICIT CASTING===============");
	
		double d1=123.456;
		float f1=(float)d1;
		long l1=(long)f1;
		int i1=(int)l1;
		short s1=(short)i1;
		byte b1=(byte)s1;
		
		
		int ci1=66;
		char c1 =(char)ci1;   // Int to char explicitly
		System.out.println();
		
		System.out.println("double to float: "+f1);
		System.out.println("float to long: "+l1);
		System.out.println("long to int: "+i1);
		System.out.println("int to short: "+s1);
		System.out.println("short to byte: "+b1);
		System.out.println("int to char: "+ci1);
		System.out.println();
		
		
		
		System.out.println("=====BOOLEAN TYEP (no castng allowed)========");
		
		boolean bool =true;
		System.out.println("boolean value: "+bool);
		
		
		
		
		
		
		
		
		
		
		
	}

}
