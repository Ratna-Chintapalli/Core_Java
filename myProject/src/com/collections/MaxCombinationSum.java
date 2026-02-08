package com.collections;

import java.util.*;

public class MaxCombinationSum {

    static List<List<List<Integer>>> result = new ArrayList<>();
    static Map<Integer, List<List<Integer>>> map = new TreeMap<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 6, 0, 8, 9, 0, 3, 4, 5, 7};
        int target = 11;
        // Step 1: Remove zero & duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr) {
            if (n != 0) {
                set.add(n);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println("Given list :- " + list);

        // Step 2: Find combinations
        findCombinations(list, target, 0, new ArrayList<>());

        // Step 3: Arrange by maximum size
        for (List<List<Integer>> combinations : map.values()) {
            result.add(combinations);
        }

        System.out.println("\nCombinations :-");
        System.out.println(result);
    }

    static void findCombinations(List<Integer> list, int target,
                                 int index, List<Integer> temp) {

        if (target == 0) {
            map.computeIfAbsent(temp.size(), k -> new ArrayList<>())
               .add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < list.size(); i++) {
            if (list.get(i) > target)
                break;

            temp.add(list.get(i));
            findCombinations(list, target - list.get(i), i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}