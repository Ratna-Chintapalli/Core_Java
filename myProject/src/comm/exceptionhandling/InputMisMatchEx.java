package comm.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a=0;
		boolean flag=true;
		while(flag) {
			try{
				System.out.println("Enter age : ");
				int a=sc.nextInt();
				System.out.println("Correct Number");
				break;
				
			}catch(InputMismatchException e) {
				System.out.println("Input Not Matched ");
				sc.nextLine();
			}
			
		}
		 //System.out.println("You entered correct value: " + a);
	}
		

}


