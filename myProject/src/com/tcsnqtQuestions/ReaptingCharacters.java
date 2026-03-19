package com.tcsnqtQuestions;

public class ReaptingCharacters {

	public static void main(String[] args) {
		String s = "swissmississippi";
		if (s == null || s.isEmpty()) {
			System.out.println("Invalid Input");
			return;
		}
		char firstNonRepeating = 0;
		char mostRepeating = 0;
		int maxCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// Count occurrences using indexOf + lastIndexOf
			int count = s.lastIndexOf(ch) - s.indexOf(ch) + 1;

			// First non-repeating character
			if (count == 1 && firstNonRepeating == 0) {
				firstNonRepeating = ch;
			}

			// Most repeated character
			if (count > maxCount) {
				maxCount = count;
				mostRepeating = ch;
			}

		}
		if (firstNonRepeating == 0) {
			System.out.println("First Non-Repeating Character: None");
		} else {
			System.out.println("First Non-Repeating Character: " + firstNonRepeating);
		}

		System.out.println("Most Repeated Character: " + mostRepeating + " (appears " + maxCount + " times)");

	}

}
