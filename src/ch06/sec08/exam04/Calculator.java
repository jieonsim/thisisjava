package ch06.sec08.exam04;

/*
	정사각형 넓이 구하는 메소드와 직사각형 넓이 구하는 메소드는 오버로딩되었다.
	메소드 오버로딩 : 메소드 이름은 같되 매개 변수의 타입, 개수, 순서를 달리하여 메소드를 선언하는 것
	(리턴 타입은 무관함)
 */
public class Calculator {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
