package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List Object Object
        List<Object> lists = new ArrayList<>();
        lists.add("Bob");
        lists.add("Cahrli");
        lists.add("Jhone");
        lists.add("SRK");
        lists.add(3456);
//        for (Object o : lists){
//            System.out.println(o);
//        }

        List<String> s = new ArrayList<>();
        s.add("Audi");
        s.add("BMW");
        s.add("TATA Truck");
        // s.add(234) can not do because I list declare String
//        for (String e : s){
//            System.out.println(e);
//        }


        Car car1 = new Car("BMW", "X Models", 360.00);
        Car car2 = new Car("AUDI", "Y Models", 360.00);
        Car car3 = new Car("AUDI", "Y Models", 360.00);
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        for (Car c : carList){
            System.out.println(c);
        }
    }
}


