package com.mutlithreading;

class BookMySeats{
	int totalTickets=15;
	synchronized void bookMySeat(int seats) {
		if(seats<=totalTickets) {
			System.out.println("Booked Tickets : " + seats);
			totalTickets=totalTickets-seats;
			System.out.println("Available tickets : "+ totalTickets);
		}else {
			System.out.println("Tickets sold out !!");
			System.out.println("THe available tickets are : "+totalTickets);
		}
	}
}

public class BookMyShowApp extends Thread{
	static BookMySeats bookMySeats;
	int seats;
	
	@Override
	public void run() {
		bookMySeats.bookMySeat(seats);
		
	}

	public static void main(String[] args) {
		// it won't create a new obj every time and it will use every time bookMySeats obj 
		bookMySeats = new BookMySeats();

		BookMyShowApp p1=new BookMyShowApp();
		p1.seats=5;
		p1.start();
		BookMyShowApp p2=new BookMyShowApp();
		p2.seats=8;
		p2.start();
		BookMyShowApp p3=new BookMyShowApp();
		p3.seats=5;
		p3.start();
	}

}
