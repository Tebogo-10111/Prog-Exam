/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.runapplication.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        // Arrange
        String[] names = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sampleSales = {
            {25, 18, 20}, // Total = 63
            {15, 10, 12}, // Total = 37
            {18, 15, 20}  // Total = 53
        }; // Grand Total = 153

        Product product = new Product(names, sampleSales);

        // Act
        int totalSales = product.GetTotalProductSold();

        // Assert
        assertEquals(153, totalSales);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Arrange
        String[] names = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sampleSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        }; // Total = 153, Number of products = 3, Average = 51.0

        Product product = new Product(names, sampleSales);

        // Act
        double averageSales = product.GetAverageProductSold();

        // Assert
        assertEquals(51.0, averageSales, 0.001);
    }
}