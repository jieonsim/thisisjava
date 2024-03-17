package ch05.sec05;

public class EmptyStringExample {
	public static void main(String[] args) {
		String hobby = "";
		if (hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
		// String 변수에 빈 문자열("") 대입도 가능
		// 빈 문자열도 String 객체로 생성되기 때문에 변수가 빈 문자열을 참조하는지 조사하려면
		// 위와 같이 equals() 메소드를 사용해야 함
	}
}
