package ch12.sec08;

import java.text.*;
import java.util.*;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strNow = sdf.format(now);
        System.out.println(strNow);
    }
}

