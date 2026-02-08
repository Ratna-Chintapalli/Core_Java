package com.constructors;

public class School_Management {

		int id;
		String name;
		String section;
		School_Management(int id, String name, String section) {
			this.id = id;
			this.name = name;
			this.section = section;
		}
		School_Management(School_Management s, String section) {
			this.id = s.id;
			this.name = s.name;
			this.section = section;
		}

		void PrintDetails() {
			System.out.println("ID:" + id +", NAME: "+ name+  ", SECTION:" + section);
		}
		
		
		
		public static void main(String[] args) {
			School_Management s=new School_Management(262, "saikumar", "B");
			System.out.println("Original Student Record");
			s.PrintDetails();
			School_Management s1=new School_Management(s,"A");
			System.out.println("New Student Record");
			s1.PrintDetails();
			System.out.println("History Records");
			s.PrintDetails();
		}



}
