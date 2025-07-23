package day10;

public class MethodExample {
	int id;
	String name;
	long phoneno;
	
	public void display() {
		System.out.println("student ID : "+id);
		System.out.println("student name : "+name);
		System.out.println("student phone number: "+phoneno);
		
		
	}
	
	public static void main(String[] args) {
		MethodExample obj1 =new MethodExample();
		obj1.id=21;
		obj1.name="arun";
		obj1.phoneno=987654321l;
		obj1.display();
		
		MethodExample obj2 =new MethodExample();
		obj2.id=23;
		obj2.name="tamil";
		obj2.phoneno=87654321l;
		obj2.display();
		
		
		
		
	}
	

}
