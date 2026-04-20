package pack02_worksho05;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		
		double discountprice = bookPrice*(bookDiscountRate/100);
		double finalPrice = bookPrice - discountprice;
	
		return finalPrice;
	}
	
	// 한줄 계산 방법
//	public double getDiscountBookPrice() {
//		return this.bookPrice
//				- (this.bookPrice * (this.bookDiscountRate / 100));
//	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
	
}
