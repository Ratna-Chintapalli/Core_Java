package com.lab;
//Recursive call is not possible in constructors
public class Student1 {
	int Studentid;
	String name;
	String college;
	String branch;
	
	Student1(){
		//this(1);
	}
	Student1(int Studentid){
		//this(2,"FGH");
	}
	Student1(int Studentid,String name){
		//this(3,"dfgh","nbvf");
		
	}
	Student1(int studentid, String name, String college) {
		//this(4,"jnbhg","njhg","cse");
	}
	Student1(int studentid, String name, String college, String branch) {
		//this();
	}
	public static void main(String[] args) {
		//Student1 s=new Student1(); 

	}

}
