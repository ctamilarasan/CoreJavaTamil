package ConstructorEX;

public class Student {
	int id;
	String name;
	String department;
	
	Student ()
	{
		System.out.println("set the values");
	}
	
	Student(int i,String n,String d)
	{
		id=i;
		name=n;
		department=d;
	}
	void display() 
	{
		System.out.println("id "+id);
		System.out.println("Student name: "+name);
		System.out.println("department: "+department);
	}

}
