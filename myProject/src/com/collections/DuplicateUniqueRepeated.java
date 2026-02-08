package com.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class DuplicateUniqueRepeated {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		int[] arr= {1,2,2,3,3,3,3,4,5,3,6,7,2};		
		List<Integer> b = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(!l.contains(arr[i])){
				l.add(arr[i]);
			}else if(!b.contains(arr[i])){
				b.add(arr[i]);
			}
		}
		int maxCount=0;
		int repeat=arr[0];
		for(int i=0;i<l.size();i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(l.get(i)==arr[j]) {
					count++;
				}
			}
			if(count>=maxCount) {
				maxCount=count;
				repeat=l.get(i);
			}
		}
		System.out.println(l);
		System.out.println(b);
		System.out.println(repeat);
	}
}












//Set<Integer> h = new HashSet<>();
////h.add(arr[0]);
//int count=0;
//for(int i=0;i<arr.length;i++) {
//	h.add(arr[i]);
//	if(!l.contains(arr[i])) {
//		l.add(arr[i]);
//		System.out.print(arr[i]+ " ");
//		
//	}else {
//		l.add(arr[i]);
//		System.out.print(arr[i] +" ");
//	}
//}
