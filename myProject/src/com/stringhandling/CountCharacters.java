package com.stringhandling;

public class CountCharacters {

	public static void main(String[] args) {
		String[] s= {"Tommy","James","Praveen","Ramesh","Harry Potter"};
		for(String name:s) {
			String unique="";
			for(int i=0;i<name.length();i++) {			
				if(!unique.contains(String.valueOf(name.charAt(i)))) {
					unique+=name.charAt(i);
					
				}
				
			}
			System.out.println(name + " --> " + unique+ " - "+unique.length());
		}
		

	}

}
