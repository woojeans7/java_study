package ch15.sec06.exam01;

import lombok.Getter;

@Getter
public class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }
}
