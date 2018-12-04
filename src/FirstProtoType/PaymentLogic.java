package FirstProtoType;

import FirstProtoType.Products;
import FirstProtoType.ShoppingCart;





public class PaymentLogic {
private double paidCash;


    public double getPaidCash() {
        return paidCash;
    }

    public void setPaidCash(double paidCash) {
        this.paidCash = paidCash;
    }










    public static double calculateTotalPrice(ShoppingCart shoppingCart){

        double total = 0;
        for(Products products: shoppingCart.getProducts()){

            total = total + products.pricePerquantatiy();





        }





        return total;




    }




}
