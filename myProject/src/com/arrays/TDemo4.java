package com.arrays;

public class TDemo4 {

	public static void main(String[] args) {
		String[] names= {"Hi","Hlo","wlc","GudMrng","Tq","GUDNyt"};
		for(String s:names) {
			//System.out.println(s.toLowerCase().contains("d"));	
			if(s.toUpperCase().startsWith("H")) {
				System.out.println(s);
			}
			
			
		}
		

	}

}
