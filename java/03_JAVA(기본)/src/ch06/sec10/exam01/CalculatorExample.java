package ch06.sec10.exam01;

import static ch06.sec10.exam01.Calculator.pi;
import static ch06.sec10.exam01.Calculator.plus;
import static ch06.sec10.exam01.Calculator.minus;


public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * pi;
        int result2 = plus(10, 5);
        int result3 = minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
