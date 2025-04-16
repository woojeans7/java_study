package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        int x = scanner.nextInt();

        System.out.print("y 값 입력: ");
        int y = scanner.nextInt();

        int result  = x+y;
        System.out.println("x + y: " + result);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.print("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");

    }
}
