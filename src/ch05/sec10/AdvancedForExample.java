package ch05.sec10;

/*
 	배열 항목 반복을 위한 향상된 for 문
 	
 	자바는 배열 및 컬렉션을 좀 더 쉽게 처리할 목적으로 향상된 for 문을 제공한다.
 	카운터 변수와 증감식을 사용하지 않고, 항목의 개수만큼 반복한 후 자동으로 for 문을 빠져나간다
 	
 	for ( ② 타입 변수 : ① 배열 ) {
			③ 실행문;
 	}
 	
 	for 문이 실행되면 ① 배열에서 가져올 항목이 있을 경우
 	② 변수에 항목을 저장하고, ③ 실행문을 실행한다.
 	다시 반복해서 ① 배열에서 가져올 다음 항목이 존재하면 ② → ③ → ① 로 진행하고,
 	가져올 항목이 없으면 for 문을 종료한다
 	
 */
public class AdvancedForExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		// 배열 항목 전체 합 구하기
		int sum = 0;
		for (int score : scores) {		// 5개의 항목이 한 번씩 score 변수에 저장되고
			sum += score;				// sum에 누적됨 (반복 횟수 : 5)
		}
		System.out.println("점수 총합 = " + sum);
		// 배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
