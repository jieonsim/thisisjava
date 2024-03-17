package ch06.sec07.exam04;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자 선언
	// ① 생성자
	Car() {
	}

	// ② 생성자
	Car(String model) {
		this.model = model;
	}

	// ③ 생성자
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// ④ 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
