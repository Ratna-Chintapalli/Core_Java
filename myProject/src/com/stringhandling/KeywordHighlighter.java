package com.stringhandling;

import java.util.*;
import java.util.regex.*;

public class KeywordHighlighter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input paragraph
        System.out.println("Enter paragraph:");
        String paragraph = sc.nextLine();

        // Input keywords
        System.out.println("Enter comma-separated keywords:");
        String[] keywords = sc.nextLine().split(",");

        for (String keyword : keywords) {
            keyword = keyword.trim();

            // Regex: word boundary + case-insensitive
            Pattern pattern = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(paragraph);

            StringBuffer sb = new StringBuffer();

            while (matcher.find()) {
                matcher.appendReplacement(sb, "[" + matcher.group() + "]");
            }
            matcher.appendTail(sb);
            paragraph = sb.toString();
        }

        System.out.println("Output:");
        System.out.println(paragraph);
        sc.close();
    }
}
