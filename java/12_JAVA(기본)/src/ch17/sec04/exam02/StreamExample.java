package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = { "홍길동", "신용권", "김미나"};

        int[] intArray = { 1, 2, 3, 4, 5 };

        Stream strStream = Arrays.stream(strArray);
        strStream.forEach(s-> System.out.print(s + ","));
        System.out.println();

        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(i-> System.out.print(i + ","));
    }
}
