package ch06.sec06;

/*
 	필드는 객체의 데이터를 저장하는 역할을 한다.
 	객체 데이터에는 고유 데이터, 현재 상태 데이터, 부품 데이터가 있다.
 	
 	필드를 선언하는 방법은 변수를 선언하는 방법과 동일하다.
 	단, 반드시 클래스 블록에서 선언되어야만 필드 선언이 된다.
 	
 	타입 필드명 [ = 초기값];
 	
 	타입은 필드에 저장할 데이터의 종류를 결정한다
 	기본 타입과 참조 타입이 모두 가능하다
 	필드명은 첫 문자를 소문자로 하되, 캐멀 스타일로 작성하는 것이 관례
 */
public class Car {
	// 자동차 클래스	|				자동차 객체
	// 고유 데이터를 저장하는 필드 선언		// [고유 데이터]
	String company;					// 제작회사
	String model;					// 모델
	String color;					// 색깔
	int maxSpeed;					// 최고속도
	
	// 상태 데이터를 저장하는 필드 선언		// [상태]
	int speed;						// 현재속도
	int rpm;						// 엔진회전 수
	
	// 부품 데이터를 저장하는 필드 선언		// [부품]
	Body body;						// 차체
	Engine engine;					// 엔진
	Tire tire;						// 타이어
	
	/*
	 	Car 클래스의 필드를 선언한 예
	 	
	 	public class Car{
	 		String model = "그랜저";
	 		int speed = 300;
	 		boolean start = true;
	 		Tire tire = new Tire();
	 	}
	 	
	 	초기값을 제공하지 않을 경우 필드는 객체 생성 시 자동으로 기본값으로 초기화된다.
	 */
}
