package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        // 일반 while 문
       /*
       while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    */

        // do ~ while 문
        int num;
        do {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
        } while (num != 6);
        System.out.println("프로그램 종료");
    }
}
