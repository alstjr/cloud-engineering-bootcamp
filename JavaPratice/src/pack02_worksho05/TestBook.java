package pack02_worksho05;

public class TestBook {

	public static void main(String[] args) {

		Book book = new Book("SQL Plus", 50000, 5.0);
		Book book2 = new Book("Java 2.0", 40000, 3.0);
		Book book3 = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println(book.getBookName()
				+"\t "+ book.getBookPrice()
				+"원\t "+ book.getBookDiscountRate()
				+"%\t "+ book.getDiscountBookPrice()
				+"원");
				System.out.println(book2.getBookName()
				+"\t "+ book2.getBookPrice()
				+"원\t "+ book2.getBookDiscountRate()
				+"%\t "+ book2.getDiscountBookPrice()
				+"원");
				System.out.println(book3.getBookName()
				+"\t "+ book3.getBookPrice()
				+"원\t "+ book3.getBookDiscountRate()
				+"%\t "+ book3.getDiscountBookPrice()
				+"원");
				}
	}
	


	

