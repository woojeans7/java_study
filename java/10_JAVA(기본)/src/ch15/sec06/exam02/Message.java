package ch15.sec06.exam02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
