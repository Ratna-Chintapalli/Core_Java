package com.constructors;

public class Student {
		int id;
		String name;
		String section;

		Student(int id, String name, String section) {
			this.id = id;
			this.name = name;
			this.section = section;
		}

		Student(Student other) {
			this.id = other.id;
			this.name = other.name;
			this.section = other.section;

		}

		void updateSection(String newSection) {
			this.section = newSection;
		}

		void PrintDetails() {
			System.out.println("ID:" + id +", NAME: "+ name+  ", SECTION:" + section);
				//"ID: " + id + ", Name: " + name + ", Section: " + section);
		}



	class SchoolManagementSystem {

		public static void main(String[] args) {
			Student s1 = new Student(262, "saikumar", "b");
			System.out.println("student original record");
			s1.PrintDetails();

			Student historyRecord = new Student(s1);
			s1.updateSection("B");
			System.out.println("\nAfter Transfer:");
			System.out.println("Current Active Record:");
			s1.PrintDetails();

			System.out.println("Historical Record:");
			historyRecord.PrintDetails();

		}
	}
}