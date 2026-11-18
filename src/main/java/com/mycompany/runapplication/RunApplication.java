/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Single-dimensional array for product names
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Two-dimensional array for sales: 3 products, 3 months
        int[][] salesData = new int[3][3];

        // Prompt user for sales data matching the sample screenshot format
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n");

        // Instantiate Product and PrintProduct classes
        Product productObj = new Product(productNames, salesData);
        PrintProduct printer = new PrintProduct(productObj);
        printer.printReport();
        
        scanner.close();
    }
}
