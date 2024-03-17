package ch06.sec10.exam01;

/*
 	객체마다 가지고 있을 필요성이 없는 공용적인 필드는 정적 필드로 선언하는 것이 좋다.
 	정적 필드를 선언하려면 static 키워드를 추가하면 된다.
 */
public class Calculator {
	static double pi = 3.14159;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
