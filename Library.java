package day9;

public class Library {
	int id;
	String bookname;
	String Authorname;
	double price;
	
	public static void main(String[] args) {
		  Library book1 = new Library();
		   book1.id=123;
		   book1.bookname="tamilbook";
		   book1.Authorname="raj";
		   book1.price=150;
		   
		   System.out.println(" book1 id "+book1.id);
		   System.out.println(" bookname :"+book1.bookname);
		   System.out.println(" Authorname :"+book1.Authorname);
		   System.out.println(" price :"+book1.price);
		   
		   Library book2 =new Library();
		   book2.id=456;
		   book2.bookname="english book";
		   book2.Authorname="anbu";
		   book2.price=160;
		   
		   System.out.println(" book2 id "+book2.id);
		   System.out.println(" bookname :"+book2.bookname);
		   System.out.println(" Authorname :"+book2.Authorname);
		   System.out.println(" price :"+book2.price);
		   
		   
		   Library book3 =new Library();
		   book3.id=789;
		   book3.bookname="python";
		   book3.Authorname="Tamil";
		   book3.price=200;
		   
		   
		   System.out.println(" book2 id "+book3.id);
		   System.out.println(" bookname :"+book3.bookname);
		   System.out.println(" Authorname :"+book3.Authorname);
		   System.out.println(" price :"+book3.price);
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
