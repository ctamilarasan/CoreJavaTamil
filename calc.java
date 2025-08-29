package Opps_AbstractionEX;

abstract class calculator{
	 public abstract void add(int a, int b);
	 public abstract void sub(int a, int b);
	 public  void mult(int a,int b){
		 System.err.println(a*b);
	 }
	 
}
       class Abstraction  extends calculator{
	  @Override
	  public void add(int a,int b) {
		  System.out.println("addtion"+(a+b));
	  }
	  public void sub (int a,int b) {
		  System.out.println("subration"+(a-b));
	  }
	  public void mult (int a,int b) {
		  System.out.println("multiplication"+(a*b));
	  }
	  
 }

public class calc {
	public static void main(String[] args) {
		 Abstraction calc = new Abstraction();
		 calc.add(10, 5);
		 calc.sub(20, 40);
		 calc.mult(20, 30);
	}

}
