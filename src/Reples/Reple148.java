package Reples;

public class Reple148 {
    public static void main(String[] args) {
        ShoppingStore item1=new ShoppingStore("Blanket",49.99,2);
         item1.TotalValue();
        ShoppingStore item2=new ShoppingStore("Mattress",439.18,1);
        item2.TotalValue();
        item2.itemTotalPrice(439.18,99.98);
    }
}


    class ShoppingStore {

        String item;
        double price;
        int quantity;


        ShoppingStore(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;

        }


        void TotalValue() {
            double totalValue=price*quantity;
            System.out.println(item+" Total Value "+totalValue);
        }


        void itemTotalPrice(double num3, double num4) {
            System.out.println("You purchased "+ (num3+num4)+" Today");

        }

    }



