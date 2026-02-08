package com.exam;

public class Demo2 {
		
	    int num = 5;

	    int getNumber() {
	        num += 5;
	        return num;
	    }

	    public static void main(String[] args) {
	    	//int a=10;
			//int b=20;
			//System.out.println(a==b);   //false
	        Demo2 d = new Demo2();
	        System.out.println(d.getNumber());//5+5=10
	        System.out.println(d.getNumber());//10+5=15
	    }

}
