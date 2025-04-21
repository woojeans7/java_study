package org.scoula.lib;

import java.util.Scanner;
public class Input {
    // 정적 참조 변수
    static Scanner sc = new Scanner(System.in);

    // 1. 문자열 입력
    public static String read(String title){
        System.out.print(title);
        return sc.nextLine();
    }
    public static String read(String title, String def){
        System.out.printf("%s(%s):",title, def);
        String answer = sc.nextLine();
        return answer.isEmpty() ? def : answer;
    }

    // 2. 정수입력
    public static int readInt(String title){
        System.out.print(title);
        String num = sc.nextLine();
        return Integer.parseInt(num);
    }

    // 3. yes/no 확인
    public static boolean confirm(String title, boolean defaultValue) {
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s: ", title, yesNo);
        String answer = sc.nextLine();
        if (answer.isEmpty())
            return defaultValue;
        return answer.equalsIgnoreCase("y");
    }
    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
