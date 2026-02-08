//Weekly Test codings 

package com.exam;
//Here it is shwoing the error coz here we pass the 5 as a argument to  method 
//means we pass the int and we call the void method,void return nothing 
//CE :Type mismatch: cannot convert from void to int

public class Demo3 {
	void display(int a) {
		System.out.println("Value :" +a);
	}

	public static void main(String[] args) {
		//Demo3 d=new Demo3();
		//int x=d.display(5);
		//System.out.println(x);

		
	//	int x,y=10; // CE :The local variable x may not have been initialized
	//	int sum=x+y;
	//	System.out.println(sum);
		
		
	//	char ch='A';
	//	System.out.println((int)ch); // char('A')=65 converted to int //65
	//	System.out.println(ch+1); // 65+1=66
		
		
	//	byte b=10,b1=80;
	//	byte b2=b+b1;  // CE: Type mismatch: cannot convert from int to byte
	//	System.out.println(b2);  // So Error 
		
		
		int i=130;
		byte b1=(byte)i;
		System.out.println(i);    //130
		//An int variable i is declared and initialized with the value 130.
     // int is a 32-bit signed integer, so it can easily hold the value 130.
		
		
		   
		//byte is an 8-bit signed integer in Java.
		//The range of byte is from -128 to 127.
		//Since 130 is outside this range, explicit casting is required. That’s what (byte) i does.
		// When you cast 130 to a byte, Java truncates the higher bits, 
		//essentially taking only the lowest 8 bits of the integer.
		
		System.out.println(b1);   //-126 
		
		
	}

}

