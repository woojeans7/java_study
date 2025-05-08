package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream().forEach(System.out::println);

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream.forEach(System.out::println);
    }
}
