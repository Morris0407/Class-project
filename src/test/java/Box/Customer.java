package Box;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Box3 box3 = new Box3() {

            @Override
            public String getName2() {
                return "Box2";
            }

            @Override
            public int getPrice2() {
                return 120;
            }

            @Override
            public String getName3() {
                return "Box3";
            }

            @Override
            public int getPrice3() {
                return 240;
            }
        };
        Box2 box2 = new Box2(){
            @Override
            public String getName() {
                return "Box3";
            }

            @Override
            public int getPrice() {
                return 60;
            }

            @Override
            public String getName3() {
                return "Box1";
            }

            @Override
            public int getPrice3() {
                return 240;
            }
        };
        Box1 box1= new Box1(){
            @Override
            public String getName3() {
                return "Box1";
            }

            @Override
            public int getPrice3() {
                return 240;
            }

            @Override
            public String getName() {
                return "Box3";
            }

            @Override
            public int getPrice() {
                return 60;
            }

            @Override
            public String getName2() {
                return "Box2";
            }

            @Override
            public int getPrice2() {
                return 120;
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height: ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
        if (box3.validate(length, width, height)) {
            System.out.println(box3.getName());
            System.out.println(box3.getPrice());
        }
        else if  (box2.validate(length, width, height)){
            System.out.println(box2.getName2());
            System.out.println(box2.getPrice2());
        }else if  (box1.validate(length, width, height)){
            System.out.println(box1.getName3());
            System.out.println(box1.getPrice3());
        }

    }
}