package ch05.sec06;

/*
 	배열은 연속된 공간에 값을 나열시키고, 각 값에 인덱스(index)를 부여해 놓은 자료구조이다
 	인덱스는 대괄호 []와 함께 사용하여 각 항목의 값을 읽거나 저장하는데 사용된다
 	
 	<배열의 특징>
 	- 배열은 같은 타입의 값만 관리한다
 	- 생성과 동시에 길이가 결정된다
 	- 배열의 길이는 늘리거나 줄일 수 없다
 	
 	<배열 변수 선언>
 	→ 타입[] 변수;
 	
 	배열 변수는 참조 변수이다. 배열도 객체이므로 힙 영역에 생성되고
 	배열 변수는 힙 영역의 배열 주소를 저장한다
 	참조할 배열이 없다면 배열 변수도 null로 초기화할 수 있다
 	
 	예) 타입[] 변수 = null;
 	
 	만약 배열 변수가 null 값을 가진 상태에서 변수[인덱스]로
 	값을 읽거나 저장하게 되면 NullPointerException이 발생한다
 	
 	<값 목록으로 배열 생성>
 	배열에 저장될 값의 목록이 있다면, 아래와 같이 간단하게 배열을 생성할 수 있다
 	→ 타입[] 변수 = { 값0, 값1, 값2, 값3, ... };
 	
 	중괄호 {}는 나열된 값들을 항목으로 가지는 배열을 힙에 생성하고, 번지를 리턴한다
 	배열 변수는 리턴된 번지를 저장함으로써 참조가 이루어진다
 	
 */

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		String[] season = { "Spring", "Summer", "Fall", "Winter" };

		// 배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);

		// 인덱스 1번 항목의 값 변경
		// season[1]의 "Summer"를 "여름"으로 바꾸고 싶다면 아래와 같이 대입 연산자를 사용하면 된다
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();

		// 배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };

		// 총합과 평균 구하기
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
