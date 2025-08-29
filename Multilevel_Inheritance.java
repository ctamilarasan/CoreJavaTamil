package Opps_inheritanceEx;

//===========================SUPER CLASS (OR ) PRAENT CLASS ========================
class dad1 {
	void money() 
	{
	System.out.println("dad money: 1000");	
	}
}
//================================ DRIVE CLASS (OR) CHILD CLASS ======================
class son1  extends dad1{
	void rupees() 
	{
	System.out.println("son money: 20000");	
	}
}
//===================================DRIVE CLASS (OR) CHILD CLASS ==========================
class grandeson extends son1{
	void cost() 
	{
		System.out.println("access to son and dad money");
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		 grandeson b1 = new grandeson();
		 b1.cost();
		 b1.rupees();
		 b1.money();
		
		
		
	}

}
