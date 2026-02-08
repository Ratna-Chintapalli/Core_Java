package comm.exceptionhandling;

import java.util.Scanner;

public class ArithmeticException1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main Method started");
		
		 
		try {
			System.out.println("Enter a value :");
			int a=sc.nextInt();
			System.out.println("Enter b value  : ");
			int b=sc.nextInt();
		    int c = a/b;
		    System.out.println(c);
		}
		
		catch (Throwable e) {
		System.out.println("from throwable  ");
		    System.err.println(e.getMessage());
		}
		// is not possible coz of exception is a parent to all exceptions,and throwable is a parent to all exceptions 
// throwable> Exception> Arithmetic,NullPointer,ArrayIndexOutofBounds,StringIndexOutOfBounds,InputMissMatchException......
//Unreachable catch block for ArithmeticException. It is already handled by the catch block for Throwable
//		catch (ArithmeticException e) {
//			System.out.println("from ae");
//		    System.err.println(e.getMessage());
//		}

	}

	
}
