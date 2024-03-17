package ch06.sec04;

/*
 	클래스로부터 객체를 생성하려면 객체 생성 연산자인 new가 필요하다.
 	
 	new 클래스()
 	
 	new 연산자 뒤에는 생성자 호출 코드가 오는데, 클래스() 형태를 가진다.
 	new 연사자는 객체를 생성시킨 후 객체의 주소를 리턴하기 때문에 클래스 변수에 다음과 같이 대입할 수 있다.
 	
 	클래스 변수 = new 클래스();
 	
 */
public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		/*
		 	클래스의 두 가지 용도
		 	
		 	- 라이브러리(library)클래스 : 실행할 수 없으며 다른 클래스에서 이용하는 클래스
		 	- 실행 클래스 : main() 메소드를 가지고 있는 실행 가능한 클래스
		 	
		 	Student : 라이브러리 클래스
		 	StudentExample : 실행 클래스
		 	
		 	일반적으로 하나의 실행 클래스와 여러 개의 라이브러리 클래스들로 구성된다.
		 	실행 클래스는 실행하면서 라이브러리 클래스를 내부에서 이용한다.
		 	
		 */
	}
}
