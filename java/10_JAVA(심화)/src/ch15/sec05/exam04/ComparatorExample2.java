package ch15.sec05.exam04;

import java.util.*;

public class ComparatorExample2 {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        Collections.sort(fruits, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit f1, Fruit f2) {
                return Integer.compare(f1.price, f2.price);
            }
        });

        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}
