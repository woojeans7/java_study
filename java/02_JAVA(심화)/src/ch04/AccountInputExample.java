package ch04;

import java.util.Scanner;

public class AccountInputExample {
    public static void main(String[] args) {
        int account = 0;
        while(true){
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료");
            System.out.println("--------------------------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("선택> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("예금액> ");
                int money = scanner.nextInt();
                account += money;
                System.out.println();
            }
            else if (choice == 2) {
                System.out.print("출금액> ");
                int money = scanner.nextInt();
                account -= money;
                System.out.println();
            }
            else if (choice == 3) {
                System.out.println("잔고> " + account);
                System.out.println();
            }
            else if (choice == 4) {
                break;
            }
            else {
                System.out.println("잘못된 선택입니다.");
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
