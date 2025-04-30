package ch15.sec06.exam02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messages = new LinkedList<>();

        messages.offer(new Message("sendMail", "홍길동"));
        messages.offer(new Message("sendSMS", "신용권"));
        messages.offer(new Message("sendKakaotalk", "감자바"));

        while (!messages.isEmpty()) {
            Message message = messages.poll();
            if (message.command.equals("sendMail")) {
                System.out.println(message.to + "님에게 메일을 보냅니다.");
            }
            else if (message.command.equals("sendSMS")) {
                System.out.println(message.to + "님에게 SMS를 보냅니다.");
            }
            else if (message.command.equals("sendKakaotalk")) {
                System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
            }

        }

    }
}
