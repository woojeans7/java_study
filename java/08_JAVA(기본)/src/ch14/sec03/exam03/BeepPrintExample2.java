package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        // 쓰레드 자체에서 작업, 실행을 다 한다.
        // 이미 Thread를 상속하고 있어서 다른 클래스를 상속할 수 없음
        Thread thread = new Thread(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
            }
        };

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{ Thread.sleep(500);}catch(Exception e){}
        }
    }
}
