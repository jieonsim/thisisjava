package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
	// 필드 선언
	A a1 = new A(true);
	// A a2 = new A(1);			// package1 classA에 생성된 default 생성자 접근 불가 (컴파일 에러)
	// A a3 = new A("문자열");	// package1 classA에 생성된 private 생성자 접근 불가 (컴파일 에러)
}
