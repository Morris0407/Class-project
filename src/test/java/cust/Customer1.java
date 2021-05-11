package cust;

public class Customer1 {
    String name;
    int price;

    public Customer1( String name,int price){
        this.name=name;
        this.price=price;
    }
    public int getTotal(){
        return price;
    }

}
