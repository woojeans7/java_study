package ch07.sec04.exam01;

import java.util.*;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
