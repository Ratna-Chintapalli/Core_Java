package com.arrays;

public class DayProfit {

    public static void main(String[] args) {
        int[] arr = { 13, 2, 1, 10, 11, 9, 5 };
        int maxProfit = 0;

        int bestBuyDay = 0;
        int bestSellDay = 0;

        int bestBuyPrice = 0;
        int bestSellPrice = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int buyPrice = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int sellPrice = arr[j];

                if (sellPrice > buyPrice) {
                    int profit = sellPrice - buyPrice;

                    if (profit > maxProfit) {
                        maxProfit = profit;

                        bestBuyDay = i + 1;
                        bestSellDay = j + 1;

                        bestBuyPrice = buyPrice;
                        bestSellPrice = sellPrice;
                    }
                }
            }
        }

        System.out.println("Buy Day      : " + bestBuyDay);
        System.out.println("Sell Day     : " + bestSellDay);
        System.out.println("Buy Price    : " + bestBuyPrice);
        System.out.println("Sell Price   : " + bestSellPrice);
        System.out.println("Max Profit   : " + maxProfit);
    }
}
