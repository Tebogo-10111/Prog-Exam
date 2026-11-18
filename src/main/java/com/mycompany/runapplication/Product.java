/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author Student
 */

public class Product implements IProduct {
    private String[] productNames;
    private int[][] salesData; // 2D array: rows = products, cols = months

    // Constructor to initialize the product names and sales data
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int totalProducts = productNames.length;
        if (totalProducts == 0) return 0.0;
        // Average number of products sold per product (Total sales / number of products)
        return (double) GetTotalProductSold() / totalProducts;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int maxIndex = 0;

        for (int i = 0; i < salesData.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }
            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                maxIndex = i;
            }
        }
        return productNames[maxIndex] + " (" + maxSales + ")";
    }
}
