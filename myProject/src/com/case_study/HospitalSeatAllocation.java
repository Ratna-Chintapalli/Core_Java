package com.case_study;

public class HospitalSeatAllocation {
	public static void main(String[] args) {
	    int[][] arr = {
	        {0, 1, 0, 0, 1},
	        {1, 1, 1, 0, 0},
	        {0, 0, 0, 1, 0},
	        {1, 0, 1, 0, 0}};

	    int totalEmptyBeds = 0;
	    int maxEmptyBedsInRow = 0;
	    int rowWithMaxEmptyBeds = -1;

	    for (int i = 0; i < arr.length; i++) {
	        int emptyBedsInRow = 0;
	        for (int j = 0; j < arr[i].length; j++) {
	            if (arr[i][j] == 0) {
	                totalEmptyBeds++;
	                emptyBedsInRow++;
	            }
	        }
	        if (emptyBedsInRow > maxEmptyBedsInRow) {
	            maxEmptyBedsInRow = emptyBedsInRow;
	            rowWithMaxEmptyBeds = i;
	        }
	    }

	    System.out.println("Total empty beds: " + totalEmptyBeds);
	    
	    System.out.println("Row with maximum empty beds: " + (rowWithMaxEmptyBeds + 1));
	}
}
