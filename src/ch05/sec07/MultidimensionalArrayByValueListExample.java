package ch05.sec07;

/*
   	- 다차원 배열
 	배열 항목에는 또 다른 배열이 대입될 수 있고, 이러한 배열을 다차원 배열이라고 부른다.
 	
 	값 목록으로 다차원 배열을 생성하려면 배열 변수 선언 시 타입 뒤에 대괄호[]를 차원의 수만큼 붙이고,
 	값 목록도 마찬가지로 차원의 수만큼 중괄호를 중첩시킨다
 	
 */

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		// 2차원 배열 생성
		int[][] scores = { 
				{ 80, 90, 96 },		// 1차원 배열의 0인덱스 : 첫 번째 반 성적
				{ 76, 88 }			// 1차원 배열의 1인덱스 : 두 번째 반 성적
		};
		
		// 배열의 길이
		System.out.println("1차원 배열의 길이(반의 수) : " + scores.length );
		System.out.println("2차원 배열의 길이(첫 번째 반의 학생 수) : " + scores[0].length);
		System.out.println("2차원 배열의 길이(두 번째 반의 학생 수) : " + scores[1].length);
		
		// 첫 번째 반의 세 번째 학생의 점수 일기
		System.out.println("scores[0][2] : " + scores[0][2]);
		
		// 두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1] : " + scores[1][1]);
		
		// 첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);
		
		// 두 번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);
		
		// 전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {			// 반의 수만큼 반복         
			totalStudent += scores[i].length;				// 반의 학생 수 합산				
			for (int k = 0; k < scores[i].length; k++) {	// 해당 반의 학생 수만큼 반복
				totalSum += scores[i][k];					// 학생 점수 합산
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수 : " + totalAvg);
	}
}
