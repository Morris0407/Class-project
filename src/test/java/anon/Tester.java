package anon;

public class Tester {
    public static void main(String[] args) {
       Reporter reporter =new Reporter() {
           @Override
           public void print() {
               System.out.println("ding dong");
           }
       };
       Reporter reporter1 =new Reporter() {
           @Override
           public void print() {
               System.out.println("hehe");
           }
       };
       reporter.print();
       reporter1.print();
    }
}
