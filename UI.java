package ConstructorEX;

public class UI {
	public static void main(String[] args) {
		
		Student st1=new Student(1,"tamil","C.S.E");
		Student st2=new Student(2,"jorvies","C.S.E");
		Student st3=new Student(3,"pavi","C.S.E");
		
		st1.display();
		System.out.println();
		st2.display();
		System.out.println();
		st3.display();
	}

}
