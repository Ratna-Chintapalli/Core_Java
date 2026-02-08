package com.constructors;
//Copy Constructor
public class Movie {
	
		String name;
		String hero;
		String heroin;
		String director;
		double budget;
		public Movie(String hero){
			this.hero=hero;
			
			
		}
		Movie(Movie m,String heroin,double budget){
			this.hero=m.hero;
			this.heroin=heroin;
			this.budget=budget;
			
		}
		Movie(Movie m,String name,String director){
			this.name=name;
			this.director=director;
			this.hero=m.hero;
			this.heroin=m.heroin;
			this.budget=m.budget;
			
		}

		
		public static void main(String[] args) {
			System.out.println("Main method from movie..");
			Movie m=new Movie("NTR");
			m.display();
			Movie m1=new Movie(m,"Alia",250000000.00);
			m1.display();
			Movie m2=new Movie(m1,"RRR","Rajamouli");
			m2.display();
			
			
		}
		void display() {
			System.out.println("*");
			System.out.println("Name of the movie :" +name);
			System.out.println("Hero of the movie :" +hero);
			System.out.println("Heroin of the movie :" +heroin);
			System.out.println("Director of the movie :" +director);
			System.out.println("budget of the movie :" +budget);
		}


}
