package ch15.sec05.exam03;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("홍길동", 35));
        people.add(new Person("감자바", 25));
        people.add(new Person("박지원", 31));

        for (Person p : people) {
            System.out.println(p.name + "," + p.age);
        }
    }
}
