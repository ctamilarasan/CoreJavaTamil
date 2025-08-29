package Opps_AbstractionEX;

abstract class Animal{
	abstract void sound();
	
	
	void sleep() 
	{
		System.out.println("Sleeping.....");
	}
}

class dog extends Animal{
	void sound() {
		System.out.println("dog make sound : boew boew ");
	}
}

public class AbstractionEX {
	public static void main(String[] args) {
		dog d =new dog();
		
		d.sound();
		d.sleep();
	}

}
