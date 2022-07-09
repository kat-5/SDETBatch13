package Reples;

public class Reple144 {

    public static void main(String [] args){
        StoreProduct first=new StoreProduct("Eggs",3.0,"Produce",true,10);
        first.display();
        StoreProduct second=new StoreProduct("Paper Towels",2.0,24);
        second.display();
        StoreProduct third=new StoreProduct("Paper Towels",2.0);
        third.display();
    }

}
class StoreProduct{
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label,double price,String
            category,boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }

    StoreProduct(String label,double price,int stock){
        this.label=label;
        this.price=price;
        category="misc";
        hasExpiration=false;
        this.stock=stock;

    }

    StoreProduct(String label,double price){
        this.label=label;
        this.price=price;
        stock=0;
    }

    void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}




