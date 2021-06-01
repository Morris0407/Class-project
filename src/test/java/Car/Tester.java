package Car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        int fee = 30;
        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("abc-123", "14:47");
        Car c2 = new Car("xyz-888", "14:30");
        Car c3 = new Car("fgh-561", "14:14");
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);
        String id = "xyz-888";//輸入車牌號碼
        Car car = cars.get(id);
        if (car == null) {
            System.out.println("Car not found");
        } else {
            Date now = new Date();//獲取現在的時間
            long ms = now.getTime() - car.getEnter().getTime();//現在時間減掉進場時間
            long mins = ms / (1000 * 60);//換算
            System.out.println(mins);//輸入的車的進場時間
        }
    }
}
