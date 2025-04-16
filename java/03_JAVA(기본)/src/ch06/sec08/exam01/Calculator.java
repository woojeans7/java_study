package ch06.sec08.exam01;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    double divide(int a, int b) {
        double result = (double) a / (double) b;
        return result;
    }
}
