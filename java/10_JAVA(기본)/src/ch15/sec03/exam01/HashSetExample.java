package ch15.sec03.exam01;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        //객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        // HashSet 저장
        // Java, JDBC, Servlet/JSP, iBATIS

        //저장된 객체수 출력
        // 예상 출력 4
        int size = set.size();
        System.out.println("총 객체수: " + size);
    }
}

