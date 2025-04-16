package ch03;

// 문제 5번
public class Trapezoid {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

        double area = (double)(lengthTop + lengthBottom) * height / 2;
        System.out.println("사다리꼴 넓이 : " + area);
    }
}
