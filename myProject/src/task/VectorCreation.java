package task;

import java.util.*;
public class VectorCreation {

	public static void main(String[] args) {
		Vector v1=new Vector();
		// To add the elements 
		v1.add("ratna");
		v1.add("raj");
		// to add the elements in a specific position, we have feature--> specifying the position 
		// Here we can add duplicate and null values also 
		// Size-->  No of Elements present in the list 
/* Capacity --> Internal size of the array 
 * means actual size of the array here if the array size is full then it increase the 100% of the array size.
 */
		
		v1.add(0,"jeeva");
		
		v1.add("ramu");
		v1.add("ramesh");
		v1.add("suresh");
		v1.add("rajesh");
		v1.add("y1");
		v1.add("y2");
		v1.add("y3");
		v1.add("y4");
		v1.add("y3");
		Vector v2=new Vector();
		v2.add("x1");
		v2.add("x2");
		System.out.println(v1);
		
		Vector v3=new Vector();
		v2.add("x2");
		v2.add("x1");
		//v2.add("x1");
		
		//v1.addAll(v2);
		v1.addAll(0,v2); // To specify the position 
		System.out.println(v1);
		/*
		// adding the v2  elements to v1 
		for(int i=0;i<v2.size();i++) {
			// to retrieve the elements we have get() method
			v1.add(v2.get(i));
		}
		**/ 
		// By using this for loop it is taking extra space ,In java we have addAll(); so we can use that method here 
		System.out.println(v1.size());
		//System.out.println(v1.capacity());
		
		
		//TO remove the elements we have remove method it is expecting the index position or we can pass object also 
		v1.remove(0);
		v1.remove("jeeva");
		v1.removeAll(v2);  // to remove collection of elements we use removeAll() method
		//v1.clear(); // To remove or clear the entire list we use clear() method 
		System.out.println(v1.contains("raja")); // to know the if the element is present in the list or not we use contains() method
		// it returns true if present or false means it is returning the boolean values 
		
		System.out.println(v1.containsAll(v3)); // order is doesn't matter here it only checks the values only
		
		System.out.println(v1.get(1));
		v1.set(1, "santhosh"); // to upade the data we must need to place the index position 
		
		System.out.println(v1.indexOf("y3")); // if the element is duplicate it give the first index 
		//System.out.println(v1.lastIndexOf("y3")); // if the element is duplicate and you want last index we use lastIndexOf() 
		System.out.println(v1.firstElement()); // to get the first element
		System.out.println(v1.lastElement()); // to get last element is the vector
		
		Object[] arr=v1.toArray(); // to convert the vector to array 
		System.out.println(Arrays.toString(arr));
		
		//System.out.println(v1);
	}

}
