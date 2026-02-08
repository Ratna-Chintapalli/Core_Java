package com.oops;
// To avoid Number of object creations and to reuse the code we go for inheritance..
import java.util.Scanner;

//child class/cub class/derived class
public class HomeLoan extends LoanImplementation {
	void getDocumentInfo() {
		System.out.println("All the documents submitted successfully ");
	}
	void homeLoanBasicInfo() {
		System.out.println("House loan can reduce your tax benefit under 80C section ");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Home Loan Banking");
		//  1) By using child object child reference => we can access both child and parent class functionalities.
		HomeLoan hl = new HomeLoan();
		hl.getDocumentInfo();
		hl.homeLoanBasicInfo();
		
		 // 2) By using parent object and parent reference => we can access only parent class functionalities.
		LoanImplementation lp=new LoanImplementation();
		lp.getROI(); 
		//by using loanimpl we can access object class
		ex: System.out.println(lp.getClass());              
		
		
		// 3) By using child object with parent reference => we can access only parent class functionalities. 
		LoanImplementation l2=new HomeLoan();
		//This process is called Up-casting, means Storing child object into parent reference. 
	    //By using up-casting we will acheive abstraction in java 
		
		
		// 4) By using child object with child reference ,we can't create object directly and will get CE => Is not possible   also called as down-casting 
		//Down-casting is not possible in java directly but it is possible with explicit type casting .
		
		try {
			double salary = hl.getCustomerSal();
			int cibil = hl.getCibilScore();
			boolean valid = hl.isAadharAndPanValid();

			if (salary >= 600000 && cibil >= 750 && valid) {

				// Multi-threading
				LoanProcessThread t1 = new LoanProcessThread("Document Verification");
				LoanProcessThread t2 = new LoanProcessThread("Loan Approval");

				t1.start();
				t2.start();

				t1.join();
				t2.join();

				System.out.println("🎉 Home Loan Approved!");
				System.out.println("ROI: " + hl.getROI());
				System.out.println("Address:\n" + hl.getAddressDetails());

			} else {
				System.out.println("❌ Loan Rejected due to eligibility criteria");
			}

		} catch (InvalidSalaryException | InvalidCibilScoreException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Thread error occurred");
		}

	}

}
