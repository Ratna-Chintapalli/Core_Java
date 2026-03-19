package com.tcsnqtQuestions;

import java.util.*;

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalIncome = 0;
        double totalExpenditure = 0;

        ArrayList<String> materials = new ArrayList<>();
        ArrayList<Double> expenses = new ArrayList<>();

        while (true) {

            System.out.print("Enter income (or 'done' to finish): ");
            String incomeInput = sc.nextLine();

            if (incomeInput.equalsIgnoreCase("done")) {
                break;
            }

            double income = Double.parseDouble(incomeInput);
            totalIncome += income;

            System.out.print("Enter type of material: ");
            String material = sc.nextLine();

            System.out.print("Enter expenditure on " + material + ": ");
            double expense = Double.parseDouble(sc.nextLine());

            totalExpenditure += expense;

            // Check if material already exists
            int index = materials.indexOf(material);

            if (index != -1) {
                expenses.set(index, expenses.get(index) + expense);
            } else {
                materials.add(material);
                expenses.add(expense);
            }
        }

        // Output
        System.out.println("\n----- Summary -----");
        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expenditure: " + totalExpenditure);
        System.out.println("Total Savings: " + (totalIncome - totalExpenditure));

        System.out.println("\nMoney spent on:");
        for (int i = 0; i < materials.size(); i++) {
            System.out.println(materials.get(i) + " : " + expenses.get(i));
        }

        sc.close();
    }
}