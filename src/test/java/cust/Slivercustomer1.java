package cust;

public class Slivercustomer1 extends Customer1{
    float discount = 0.1f;
    public Slivercustomer1(String name, int price) {
        super(name, price);
    }
    public int getTotal(){
        return price - (int)(price * discount);
    }
}
