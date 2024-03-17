package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		// 객체 생성
		A a = new A();
		
		// 필드값 변경
		a.field1 = 1;
		// a.field2 = 1;		field2는 package1에 있는 default 필드라 접근 불가 (컴파일 에러)
		// a.field3 = 1;		field3은 package1에 있는 private 필드라 접근 불가 (컴파일 에러)
		
		// 메소드 호출
		a.method1();
		// a.method2();			method2는 package1에 있는 default 메소드라 접근 불가 (컴파일 에러)
		// a.method3();			method2는 package1에 있는 private 메소드라 접근 불가 (컴파일 에러)
	}
}
