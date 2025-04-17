package ch05;

import java.util.Scanner;

public class InputScore {
    public static void main(String[] args) {

        int[] scores = null;
        int cnt = 0;
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("선택> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("학생 수> ");
                cnt = scanner.nextInt();
                scores = new int[cnt];
            }
            else if (choice == 2) {
                for(int i=0; i<scores.length; i++) {
                    System.out.print("scores[i]> ");
                    scores[i] = scanner.nextInt();
                }
            }
            else if (choice == 3) {
                for(int i=0; i<scores.length; i++) {
                    System.out.println("scores[i]: " + scores[i]);
                }
            }
            else if (choice == 4) {
                int max = scores[0];
                int sum = 0;
                for(int i=0; i<scores.length; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                double avg = (double) sum/scores.length;

                System.out.println("최고 점수 : " + max);
                System.out.printf("평균 점수 : %.1f\n", avg);
            }
            else {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
