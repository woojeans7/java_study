package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            System.out.println("----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("----------------------------");

            System.out.print("선택: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                i++;
                System.out.println("현재 속도 = " + i);
            }
            else if (choice == 2) {
                i--;
                System.out.println("현재 속도 = " + i);
            }
            else {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
