package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		// strVar1과 strVar2는 동일한 문자열 리터럴로 생성된 객체를 참조

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		// strVar3와 strVar4는 new 연산자로 String 객체를 별도로 생성했기 때문에 참조가 다름

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		// 동일한 String 객체든 다른 String 객체든 상관없이 내부 문자열만을 비교할 경우에는
		// String 객체의 equals() 메소드를 사용
	}
}
