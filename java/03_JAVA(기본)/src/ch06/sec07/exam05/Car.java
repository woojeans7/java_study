package ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){}

    Car(String model) {
        this(model,"빨강", 200);
    }

    Car(String model, String color) {
        this(model, color, 200);
    }

    Car(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

