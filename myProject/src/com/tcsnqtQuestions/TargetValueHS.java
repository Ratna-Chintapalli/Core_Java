package com.tcsnqtQuestions;
import java.util.*;
public class TargetValueHS {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 7;
        HashSet<Integer> set=new HashSet<>();
        
        for(int i:arr) {
        	int c=target-i;
        	if(set.contains(c)) {
        		System.out.println(i + "+ " +c + "=" +target);
        	}
        	set.add(i);
        }
	}

}
