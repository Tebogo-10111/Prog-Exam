/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
   public class ProductCalculations implements IProductCalculations {
    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        return price * 0.15; // 15% of product price[span_1](start_span)[span_1](end_span)
    }

    @Override
    public double GetCommission() {
        return price * 0.05; // 5% of product price[span_2](start_span)[span_2](end_span)
    }

    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission(); // Price + VAT + Commission[span_3](start_span)[span_3](end_span)
    }
}
