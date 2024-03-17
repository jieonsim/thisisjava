package ch07.sec06.package1; // A 클래스와 같은 패키지

public class B {
	// 메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
		// A클래스의 필드, 생성자, 메소드 모두 protected지만 A클래스와 같은 패키지라 모두 가능
	}
}
