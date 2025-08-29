package Opps_inheritanceEx;


//===================== PARENT CLASS (OR) SUPER CLASS =================
class Animal1{
	void eat() {
		System.out.println("Animals are eat ");
	}
}
//===================CHILD CLASS (OR) DRIVE CLASS =============
class dog1 extends Animal1{
	void brak() 
	{
	System.out.println("dog make sound");	
	}
}

//==========================CHILD CLASS (OR) DRIVE CLASS =================
class cat1 extends Animal1{
	void sound () 
	{
		System.out.println("cat mke soound : mew moew");
	}
}
//=================================SUB CLASS (OR ) CHILD CLASS ============
class bubby extends dog1{
	void weep() 
	{
		System.out.println("bubby make sound : weep weep");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		bubby b1 = new bubby();
		cat1 c1 = new cat1();
		b1.eat();
		b1.brak();
		c1.sound();
		
	}

}
