
public class Books {

	private String book_title;
	private double book_price;
	
	public Books(String book_title, double book_price) {
		super();
		this.book_title = book_title;
		this.book_price = book_price;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	
	
}
