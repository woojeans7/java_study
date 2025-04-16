package ch06.sec07.exam04;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 디폴트 생성자
    Car(){}

    // model만 가지는 생성자
    Car(String model) {
        this.model = model;
    }

    // model, color 가지는 생성자
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // model, color, maxspeed 가지는 생성자
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
