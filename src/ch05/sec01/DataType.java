package ch05.sec01;

/*
 	데이터 타입 분류
 	
 	자바의 데이터 타입은 크게 기본 타입(primitive type)과 참조 타입(reference type)으로 분류된다.
 	
 	참조 타입이란 *객체(object)의 번지를 참조하는 타입으로
 	배열, 열거, 클래스, 인터페이스 타입이 있다.
 	
 	*객체 = 데이터(필드) + 메소드
 	데이터와 메소드로 구성된 덩어리라고 생각하면 된다.
 	
 	기본 타입으로 선언된 변수와 참조 타입으로 선언된 변수의 차이점은 저장되는 값이다.
 	기본 타입으로 선언된 변수는 값 자체를 저장하고 있지만,
 	참조 타입으로 선언된 변수는 객체가 생성된 메모리 번지를 저장한다.
 	
 */
public class DataType {
	public static void main(String[] args) {
		// 기본 타입 변수
		int age = 25;
		double price = 100.5;
		
		System.out.println("age : " + age);
		System.out.println("price : " + price);
		
		// 참조 타입 변수
		String name = "심지언";
		String hobby = "독서";
		
		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby);
		
		/*
			변수들은 모두 스택(stack)이라는 메모리 영역에 생성된다.
			기본 타입 변수인 age와 price는 직접 값을 저장하고 있지만,
			참조 타입 변수인 name과 hobby는 힙 메모리 영역의 String 객체 번지를 저장하고
			이 번지를 통해 String 객체를 참조한다.
			
		 */
	}
}
