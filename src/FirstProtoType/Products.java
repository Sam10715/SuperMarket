package FirstProtoType;

public class Products {
  private String productName;
  private double productPrice;
private int quantity;



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public double pricePerquantatiy(){
        double totaltPrice= productPrice*quantity;

        return totaltPrice;





}

public double discount(){
double discount1=0;




     discount1 = productPrice * quantity * 0.31;
     return discount1;




}

public double discount1(){
        double discount1=productPrice;


        return discount1;

}

public double discount3(){
        double discount1 = productPrice -1;
        return discount1;




}

}







