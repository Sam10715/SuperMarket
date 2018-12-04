package FirstProtoType;

import FirstProtoType.Products;
import FirstProtoType.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
       PaymentLogic paymentLogic = new PaymentLogic();

        ShoppingCart shoppingCart = new ShoppingCart();
        Products products1= new Products();
        Products products2 = new Products();
        Products products3= new Products();
        Products products4 = new Products();
        Products products5 = new Products();
        PaymentLogic paymentLogic1 = new PaymentLogic();




        products1.setProductName("Robijn");
        products1.setProductPrice(3);
        products1.setQuantity(3);



        products2.setProductName("Brinta");
products2.setProductPrice(2.5);
products2.setQuantity(2);


        products3.setProductName("Chinese vegetables");
        products3.setProductPrice(5);
        products3.setQuantity(2);

        products4.setProductName("Yoghurt");
        products4.setProductPrice(2);
        products4.setQuantity(10);



        products5.setProductName("Diapers");
        products5.setProductPrice(10);
       products5.setQuantity(13);













        List<Products> productsList = new ArrayList<>();
        //productsList.add(products1);
       //productsList.add(products2);
       // productsList.add(products3);
        productsList.add(products4);
       productsList.add(products5);






        shoppingCart.setProducts(productsList);



            int z = products1.getQuantity();
            double discount;

            if(products1.getQuantity()==1){
                discount=0;
            }
            else if(products1.getQuantity()%2==0){

                discount=products1.discount();
            }
            else {
                products1.setQuantity(z-1);
                discount= products1.discount();

                products1.setQuantity(z);



            }

            double discount1=0;
            int q=products5.getQuantity();

            if(products5.getQuantity()<4){

                discount1=0;


            }
            else if(products5.getQuantity()%4==0){

                 for(int i=0; i<products5.getQuantity(); i=i+4)
                discount1=products5.discount1() +discount1;

            }
            else {
                products5.setQuantity(q-3);

                for(int i=0; i<products5.getQuantity(); i=i+4) {
                    discount1 = products5.discount1() + discount1;
                }
                products5.setQuantity(q);
            }

double discount2=0;
            String day ="Wed";

            if(day.equals("Wed")){
for(int i =0; i<products4.getQuantity(); i++)
                discount2= products4.discount3()+discount2;


            }
            else {
                discount2=0;


            }
if(!productsList.contains(products1)){
    discount=0;
        }


        if (!productsList.contains(products5)){

    discount1=0;
}


if (!productsList.contains(products4)){

    discount2=0;
}



double fullDiscount = discount +discount1 +discount2;

System.out.println("you have orderd");
for(int i =0; i<productsList.size();i++){

            System.out.println("Name "+productsList.get(i).getProductName()+" "+"Quanitatiy "+productsList.get(i).getQuantity());

        }



        System.out.println("Price = "+PaymentLogic.calculateTotalPrice(shoppingCart));
        System.out.println("Discount = "+ fullDiscount);
        System.out.println("Price after discount = "+(PaymentLogic.calculateTotalPrice(shoppingCart)-fullDiscount));
        paymentLogic1.setPaidCash(100);
System.out.println("you have piad = "+paymentLogic1.getPaidCash());

        if(paymentLogic1.getPaidCash()<PaymentLogic.calculateTotalPrice(shoppingCart)-fullDiscount){


            System.out.println("Money is not enough");



        }

else {

            double totalPrice = PaymentLogic.calculateTotalPrice(shoppingCart) - fullDiscount;


            double canghemoney = paymentLogic1.getPaidCash() - totalPrice;

            System.out.println("Changemoney =" + canghemoney);


        }











    }











}
