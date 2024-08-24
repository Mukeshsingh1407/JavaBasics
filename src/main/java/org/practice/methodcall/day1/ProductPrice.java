package org.practice.methodcall.day1;

public class ProductPrice {
    public static void main(String[] args) {
        String[] productList = {"Laptop", "Mobile", "iPad"};
        int[] price = {20000, 50000, 7000};
        int[] discount = {5, 2, 8};

        calculatePrice(productList, price, discount);
    }

    public static void calculatePrice(String[] productList, int[] price, int[] discount) {
        for (int i = 0; i < productList.length; i++) {
            int discountedPrice = price[i] - (price[i] * discount[i] / 100);
            System.out.println(productList[i] + " price is " + discountedPrice);
        }
    }
    }

