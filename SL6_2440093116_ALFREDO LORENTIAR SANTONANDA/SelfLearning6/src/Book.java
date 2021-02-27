
public class Book {

	
	String bookName;
	String author;
	int borrowDay;
	int borrowMonth;
	int borrowYear;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String author, int borrowDay, int borrowMonth, int borrowYear) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.borrowDay = borrowDay;
		this.borrowMonth = borrowMonth;
		this.borrowYear = borrowYear;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBorrowDay() {
		return borrowDay;
	}

	public void setBorrowDay(int borrowDay) {
		this.borrowDay = borrowDay;
	}

	public int getBorrowMonth() {
		return borrowMonth;
	}

	public void setBorrowMonth(int borrowMonth) {
		this.borrowMonth = borrowMonth;
	}

	public int getBorrowYear() {
		return borrowYear;
	}

	public void setBorrowYear(int borrowYear) {
		this.borrowYear = borrowYear;
	}

	public int calculateOverdue(int totalDays) {
		int hasil = 0;
		
		hasil = totalDays * 1000;
		
		return hasil;
	}
	
}
