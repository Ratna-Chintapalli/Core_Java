package com.constructors;

public class College {
	final String collegeName;
	final int collegeId;
/*
 * A constructor is not a method.

The final keyword is used to prevent overriding.

Constructors are never overridden, they are only invoked when an object is created.

Therefore, Java does not allow final on constructors.
 
	public final College(String collegeName, int collegeId) {
		this.collegeName = collegeName;
		this.collegeId = collegeId;
	}

*/
	public College (String collegeName, int collegeId) {
		this.collegeName = collegeName;
		this.collegeId = collegeId;
	}
	void show() {
		System.out.println(collegeName);
		System.out.println(collegeId);
	}
	public static void main(String[] args) {
		 final College c=new College("BWEC",1234);
		 c.show();
		 
		 
		 //The final field College.collegeName cannot be assigned
		// c.collegeName = "NEW COLLEGE"; // ✅ allowed
		// c = new College("ABC", 111); ❌ not allowed


	}
	

}
