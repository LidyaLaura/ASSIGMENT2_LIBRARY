package case02package;

import java.util.ArrayList;

public class Borrower {
	String nama;
	
	ArrayList<Book> borrowedBooks;
	
	public Borrower(String nama) {
		this.nama= nama;
		this.borrowedBooks = new ArrayList<>();
	}

	public void displayBorrowedBooks() {
		System.out.println(this.nama + "'s borrowed Books:");
		for(Book i : borrowedBooks) {
			System.out.println("Tittle:" + i.title);
			System.out.println("ISBN:" + i.ISBN);
			System.out.println("Author:" + i.author.nama);
			System.out.println("Biography:" + i.author.desc);
			System.out.println("------------");
		}
	}
}
