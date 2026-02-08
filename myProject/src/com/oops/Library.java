package com.oops;

class Book {
	private int bookId;
	private boolean available;
	private String author;
	private String title;

	public Book(int bookId, boolean available, String author, String title) {
		super();
		this.bookId = bookId;
		this.available = available;
		this.author = author;
		this.title = title;
	}

	boolean isavailable() {
		return available;
	}

	void setAvaialable(boolean available) {
		this.available = available;

	}

	int getbookId() {
		return bookId;
	}

	void displayInfo() {
		System.out.println("Book ID is :" + bookId);
		System.out.println("Author of the book is :" + author);
		System.out.println("Book Title is :" + title);
		System.out.println("Is book Available :" + available);

	}

}

class Person {
	protected int personID;
	protected String name;

	public Person(int personID, String name) {
		this.personID = personID;
		this.name = name;
	}

	void displayInfo() {
		System.out.println("Book ID is :" + personID);
		System.out.println("Author of the book is :" + name);

	}

}

class Librarian extends Person {
	Librarian(int id, String name) {
		super(id, name);
	}

	void addBook(Book b, Librarian lib) {
		lib.addBook(b, lib);
	}

	void removeBook(int bookId, Librarian lib) {
		lib.removeBook(bookId, lib);
	}

}

class Member extends Person {
	Book[] borrowedBooks = new Book[3];
	int borrowedCount = 0;

	Member(int id, String name) {
		super(id, name);
	}

	void borrowedBook(Book b) {
		if (borrowedCount < borrowedBooks.length && b.isavailable()) {
			borrowedBooks[borrowedCount++] = b;
			b.setAvaialable(false);
			System.out.println(name + " Borrowed : " + b.getbookId());
		} else {
			System.out.println("Canot borrow this book : limit reached or book not available ");
		}
	}

	void returnBook(Book b) {
		for (int i = 0; i < borrowedCount; i++) {
			if (borrowedBooks[i] == b) {
				b.setAvaialable(true);
				borrowedBooks[i] = borrowedBooks[borrowedCount - 1];
				borrowedBooks[borrowedCount - 1] = null;
				borrowedCount--;
				System.out.println(name + "Returned Book id : " + b.getbookId());
			}
		}
		System.out.println("Book not foound in the borrowed list. ");
	}

	@Override
	void displayInfo() {
		System.out.println("Member : " + name + "(Borrowed books :" + borrowedCount + ")");
	}

}

public class Library {
	private Book[] books = new Book[10];
	private int bookCount = 0;

	public void addBook(Book b) {
			if(bookCount <books.length) {
				books[bookCount++]=b;
				System.out.println("Book Added :" +b.getbookId());
			}else {
				System.out.println("Library is full !!!! ");
		}
	}

	public void removeBook(int bookId) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getbookId() == bookId) {
				books[i] = books[bookCount - 1];
				books[bookCount - 1] = null;
				bookCount--;
				System.out.println("Book Removed: " + bookId);
				return;
			}
		}
		System.out.println("Book not Found. ");
	}

	Book searchBook(int bookId) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getbookId() == bookId) {
				return books[i];
			}
		}
		return null;
	}

	void displayAllBooks() {
		System.out.println("\n ------ Library Books -----");
		for (int i = 0; i < bookCount; i++) {
			books[i].displayInfo();
		}
	}

}
