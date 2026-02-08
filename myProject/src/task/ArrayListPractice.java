package task;
import java.util.*;

// in vetcor the default size is 10 but in arraylist when the element is added then only it will assaigh the default size to array.
// So there is no memory wastage is there in vector -- if we wanna work with mutli-theading we use vector 
// and also in vector there is concept called  synchronized it won't accept multiple elements at a time
// but in arraylist here there is no concept called  synchronized , and it will accept multiple threads at a time , and perfomance is high but here is 
// a problem with multiple threads so we need to create a synchronized threads  , and 

//*********************************
// ArrayList size increases "50% only" , if the array is full with elements 
// Default Capacity(capacity when the elements are not added to the list ) of an arrayList is 0 
//Initial Capacity of (after creation of an object ) -- arrayList is 10

// ArrayList supports only size it not supports capacity , Arraylist allows null,duplicate values also ,it will also follw insertion order
// by default arrylist is not synchronized nut we can make al  as synchronize by using collections 
public class ArrayListPractice {

	public static void main(String[] args) {
		Integer [] arr={1,4,6,7,8};
		ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(arr));//Generic way 
		arr1.add(5);
		arr1.add(0,10);
		System.out.println(arr1);
		System.out.println(arr1.get(2)); // To retrieve th elements
		System.out.println(arr1.remove(4));// to remove --> remove(),clear()
		System.out.println(arr1.contains(5)); // to check whether the element is present in the list or not
		arr1.set(0, 12);// Updation
		System.out.println(arr1);
		for(int i:arr1) { // To retrieve multiple elements
			System.out.print(i+" ");
		}

	}

}
