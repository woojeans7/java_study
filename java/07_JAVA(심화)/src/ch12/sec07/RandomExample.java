package ch12.sec07;

import java.util.*;

public class RandomExample {
    public static void main(String[] args) {
        int[] select = new int[6];
        Random rand = new Random();
        System.out.print("선택번호: ");
        for (int i = 0; i < 6; i++) {
            select[i] = rand.nextInt(45)+1;
            System.out.print(select[i] + " ");
        }
        System.out.println();

        int[] win = new int[6];
        rand = new Random(5);
        System.out.print("당첨번호: ");
        for (int i = 0; i < 6; i++) {
            win[i] = rand.nextInt(45)+1;
            System.out.print(win[i] + " ");
        }
        System.out.println();

        Arrays.sort(select);
        Arrays.sort(win);
        boolean result = Arrays.equals(select, win);
        System.out.print("당첨여부: ");
        if (result) {
            System.out.println("1등에 당첨되셨습니다.");
        }
        else {
            System.out.println("당첨되지 않으셨습니다.");
        }
    }
}
