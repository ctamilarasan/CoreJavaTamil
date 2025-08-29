package Opps_EncapsulationEx;

public class library {
	
	public static void main(String[] args) {
		book book1 =new book();
		book book2 =new book();
		
		book1.setId(1);
		System.out.println("book1 id: "+book1.getId());
		
		book1.setName("java");
		System.out.println("book1 name :"+book1.getName());
		
		book1.setPrice(1000);
		System.out.println("book1 price: "+book1.getPrice());
		System.out.println();
		
		book2.setId(2);
		System.out.println("book2 id: "+book2.getId());
		
		book2.setName("python");
		System.out.println("book2 name: "+book2.getName());
		
		book2.setPrice(2000);
		System.out.println("book2 price"+book2.getPrice());
		
		
		
	}

}
class book
{
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
