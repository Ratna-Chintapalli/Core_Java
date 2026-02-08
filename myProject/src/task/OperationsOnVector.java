package task;

import java.util.Arrays;
import java.util.Vector;

public class OperationsOnVector {
	//  and genericas to applicable to all the collections 

	public static void main(String[] args) {
		// capacity-Array capacity -10 
		
		//to specify the type of the values java introduced a concept called generics from java 1.5 onwards
		//like Vector<Integer> v1=new Vector<Integer>(); and generics is expecting only non premitive data types
		// because we cannot create an object for primitive data types so java introduced wrapper object datatypes 
		
		// Vector is introduced in java version 1.0
		// Collections are introduced  in java 1.2
		Object[] arr= {1,5,6,7,8,9};
		//Vector v1=new Vector(Arrays.asList(arr));
		Vector<Integer> v1=new Vector<>();
		
		v1.add(11);
		v1.add(null);// we may add null values here
		v1.add(null);
		// we may add duplicate values also , it allows duplicate and null values ;/
		v1.add(11);
		
//		v1.add(10.99);// Compile error
//		v1.add("ram"); // Compile Error
//		v1.add(0,"ratna");
//		v1.add("raj");
//		int sum=0;
//		for(int  i=0;i<v1.size();i++) {
//			/*Exception in thread "main"
//			 *  java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
//			 */
//			sum+=(Integer)v1.get(i);
//		}
//		
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());

	}

}
