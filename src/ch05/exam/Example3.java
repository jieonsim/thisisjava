package ch05.exam;

import java.util.Scanner;

/*
 	학생들의 점수를 분석하는 프로그램을 만들려고 합니다.
 	키보드부터 학생 수와 각 학생들의 점수를 입력받고
 	while 문과 Scanner의 nextLine() 메소드를 이용해서
 	최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요.
 */
public class Example3 {
	public static void main(String[] args) {
		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생 수 : ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {					
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("잘못 선택하셨습니다. 다시 선택해 주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
