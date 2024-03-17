package ch06.sec03; 		// 패키지 선언

public class SportsCar {	// 클래스 선언
}

class Tire {				// 복수 개의 클래스 선언 가능
}

/*
  	하나의 소스 파일에 복수 개의 클래스를 선언할 때 주의할 점
  	소스 파일명과 동일한 클래스만 공개 클래스(public class)로 선언할 수 있다.
  	
  	Tire 클래스도 공개 클래스(public class)로 선언하고 싶다면
  	Tire.java 소스 파일을 별도로 생성해야 한다.
  	
  	그렇기 때문에 특별한 이유가 없다면 소스 파일 하나당 클래스 하나를 선언하는 것이 좋다.
 */
