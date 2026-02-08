package com.operators;

public class TestLiteralDemo1 extends Object{

	public static void main(String[] args) {
		
		TestLiteralDemo1 t=new TestLiteralDemo1();
		System.out.println(t);
		System.out.println(t.hashCode());
		int ab=0x372f7a8d;
		System.out.println(ab);
		
		// Decimal literals
		int a1=123;
		int a2=56789;
		int a3=789;
		
		//Any no start with 0 will  consider as octal
		
		int a4=0123;
		//0+ 1*8^2 +2*8^1 +3*8^0==64+16+3=83
		int a5=0345; //229
		int a6=0567;  //375
		//int a7= 0876; //574 //The literal 0875 of type int is out of range
					
		//Any no start with 0x/0X will consider as Hexa-decimal no
		//Base is 16 and we can represent 0-9 ,a-f/A-F
		//a=10,b=11,c=12,d=13,e=1
		//int a8=0x123; 
		// 1*16^2+2*16^1+3*16^0=256+32+3=291
		//
		
		//int a9=0x45a;//1114
		//int a10=0xabc ;2748
		//int a11=0xbee;//3054
		//int a12=0xDAD;//3501
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		

	}

}
