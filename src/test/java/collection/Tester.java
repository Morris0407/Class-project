package collection;


import java.util.TreeSet;

public class Tester {
    public static void main(String[] args) {
        TreeSet<Integer> aa = new TreeSet<>();
        aa.add(0);
        aa.add(1);
        aa.add(9);
        aa.add(1);
        System.out.println(aa.size());
        System.out.println(aa);
        for (Integer a : aa){
            System.out.println(a);
        }
    }

}
