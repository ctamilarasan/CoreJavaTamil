package Opps_polymorphismEX;

public class overridingEX {
	public static void main(String[] args) {
		
		Animals_overridingEX a;
		
		
		a= new dog_overrinding();
		a.sound();
		
		
		a= new cat_overriding();
		a.sound();
	}

}
