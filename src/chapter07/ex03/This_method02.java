package chapter07.ex03;

class Book {
	// field
	String bookName;
	String bookAuthor;
	int bookPrice;
	int bookCount;
	
	//default Constructor
	Book() {
		bookName = "unknown" ;
		bookAuthor = "unknown" ;
		bookPrice = 0 ;
		bookCount = 0 ;
	}
	
	// 1 args Constructor
	Book(String bookName) {
		this();						// default Constructor
		this.bookName = bookName;
	}
	
	// 2 args Constructor
	Book(String bookName, String bookAuthor) {
		this(bookName);
		this.bookAuthor = bookAuthor;
	}
	// 3 args Constructor
	Book(String bookName, String bookAuthor, int bookPrice) {
		this(bookName,bookAuthor);
		this.bookPrice = bookPrice;
	}
	
	// 4 args Constructor
	Book(String bookName, String bookAuthor, int bookPrice,int bookCount){
		this(bookName,bookAuthor,bookPrice);
		this.bookCount = bookCount;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName
				+ ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice
				+ ", bookCount=" + bookCount + "]";
	}	
}

public class This_method02 {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("정보처리기사 필기");
		Book b3 = new Book("정보처리기사 실기","길벗알앤디");
		Book b4 = new Book("파이썬","귀도 반 로섬",35000);
		Book b5 = new Book("JAVA","coffee",35000,500);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}
