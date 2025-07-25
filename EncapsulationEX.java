package day11;

public class EncapsulationEX {
	public static void main(String[] args) {
		 book book1 =new book();
		 
		 book1.setId(222);
		 System.out.println(book1.getId());
		 
		 book1.setBookName("Python");
		 System.out.println(book1.getBookName());
		 
		 book1.setPrice(1000.50);
		 System.out.println(book1.getPrice());
		 
		 book1.setAuthorname("tamil");
		 System.out.println(book1.getAuthorName());
		 
		
	}

}

class book{
	private int id;
	private String bookname;
	private String authorname;
	private double price;
	private String librarian;
	
	//book id
	public int getId() {
		return id;
	}
	
	public void setId(int bookId) {
		id=bookId;
	}
	// book name
	public String getBookName() {
		return bookname;
	}
	public void setBookName(String name) {
		bookname =name;
	}
	 //book author name
	
	public String getAuthorName() {
		return authorname;
	}
	public void setAuthorname(String name) {
		authorname=name;
	}
	 // book price
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double  d) {
		price=d;
	}
	
	// book librarian 
	
	public String  getLibrarina() {
		return librarian;
	}
	
	
	
}