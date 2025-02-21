package case02package;
import java.util.ArrayList;

public class Library {
	ArrayList<Book> books;
	
	public void addBook(Book book) {
		this.books= new ArrayList<>();
		this.books.add(book);
		System.out.println("Book added to library: " + book.title);
	}
	public void borrowBook(Borrower borrower, Book book) {
		
		borrower.borrowedBooks.add(book);
		books.remove(book);
		System.out.println(borrower.nama + " borrowed: " + book.title);
			
	}
	public void returnBook(Borrower borrower, Book book) {
		books.add(book);
		borrower.borrowedBooks.remove(book);
		System.out.println(borrower.nama + " returned: " + book.title);

	}
	public void displayLibraryBooks() {
		System.out.println("Books in library:");
		for(Book i : books) {
			System.out.println("Tittle:" + i.title);
			System.out.println("ISBN:" + i.ISBN);
			System.out.println("Author:" + i.author.nama);
			System.out.println("Biography:" + i.author.desc);
		}
		
	}
	
}
