package Opps_inheritanceEx;


//============================SUPER CLASS (OR) PARENT CALSS=================
class Animal{
	void eat() 
	{
		System.out.println("this animal can eat");
	}
}

//================================DRIVED CLASS (OR) CHILD CLASS====================
class dog extends Animal{
	void bark() 
	{
		System.out.println("bark");
	}
}

public class Single_Inheritanace {
	public static void main(String[] args) {
		 dog d1 = new dog();
		 d1.eat();
		 d1.bark();
	}

}
