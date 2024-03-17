package ch05.sec06;

/*
 	배열의 길이란 배열에 저장할 수 있는 항목 수를 말한다
 	코드에서 배열의 길이를 얻으려면 도트(.)연산자를 사용해서
 	참조하는 배열의 length 필드를 읽으면 된다
 	
 	배열변수.length;
 	
 	배열의 length 필드는 읽기만 가능하므로 다음과 같이 값을 변경할 수는 없다
 	
 	intArray.length = 10; // 컴파일 에러 발생
 	
 	배열 길이는 for문을 사용해서 전체 배열 항목을 반복할 때 많이 사용된다
 	
 */
public class ArrayLengthExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 대입
		int[] scores = { 84, 90, 96 };
		
		// 배열 항목의 총합 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			// for 조건식에서 < 연산자를 사용한 이유는 배열의 마지막 인덱스는 배열 길이보다 1이 적기 때문
			// 인덱스를 초과해서 사용하면ㅁ ArrayIndexOutOfBoundsException이 발생한다
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		// 배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
