package ch06.sec06.exam02;

/*
 	필드 사용
 	
 	필드를 사용한다는 것은 필드값을 읽고 변경하는 것을 말한다
 	
 	클래스에서 필드를 선언했다고 해서 바로 사용할 수 있는 것은 아니다.
 	필드는 객체의 데이터이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
 	
 	클래스로부터 객체가 생성된 후에 필드를 사용할 수 있다.
 	필드는 객체 내부의 생성자와 메소드 내부에서 사용할 수 있고, 객체 외부에서도 사용할 수 있다.
 	
 	객체 내부(Car)에서는 단순히 필드명으로 읽고 변경할 수 있지만
 	외부 객체(Car Example)에서는 참조 변수와 도트(.) 연산자를 이용해서 읽고 변경해야한다.
 	ㄴ
 	도트(.) 연산자는 객체 접근 연산자로, 객체가 가지고 있는 필드나 메소드에 접근하고자 할 때 참조 변수 뒤에 붙인다.
 */

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		// Car 객체의 필드값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}
