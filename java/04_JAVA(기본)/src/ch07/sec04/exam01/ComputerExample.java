package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("원의 면적: "+calc.areaCircle(10));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원의 면적: "+computer.areaCircle(10));
    }
}
