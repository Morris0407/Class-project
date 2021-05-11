package cust;

public class Tester1 {
    public static void main(String[] args) {
        Customer1 cust1= new Customer1("morris",900);
        System.out.println(cust1.name+"\t" + cust1.price +"\t" + cust1.getTotal());
        Slivercustomer1 slcu1 = new Slivercustomer1("hank",900);
        System.out.println(slcu1.name + "\t" + slcu1.price + "\t" +slcu1.getTotal());


    }
}
