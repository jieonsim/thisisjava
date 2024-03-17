package ch05.sec06;

/*
 	new 연산자로 배열 생성
 	
 	값의 목록은 없지만 향후 값들을 저장할 목적으로 배열을 미리 생성할 수도 있다
 	new 연산자를 다음과 같이 사용하면 배열 객체를 생성한다
 	길이는 배열이 저장할 수 있는 항목 수를 말한다
 	
 	타입[] 변수 = new 타입[갈이];
 	
 	new 연산자는 해당 길이의 배열을 생성하고
 	배열의 번지를 리턴하기 때문에 배열 변수에 대입할 수 있다
 	
 	이미 배열 변수가 선언된 후에도 다음과 같이 대입이 가능하다
 	
 	타입[] 변수 = null;
 	변수 = new 타입[길이];
 	
 	new 연산자로 배열을 처음 생성하면 배열 항목은 기본값으로 초기화된다.
 	> 정수 배열은 0, 실수 배열은 0.0, 논리 배열은 false, 참조 배열은 null로 초기화된다
	
 */

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] arr1 = new int[3];
		// 배열 항목의 초기화 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		// 배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		// 배열 항목의 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");

		// 배열 변수 선언과 배열 생성
		double[] arr2 = new double[3];
		// 배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		// 배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		// 배열 항목의 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");

		// 배열 변수 선언과 배열 선언
		String[] arr3 = new String[3];
		// 배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		// 배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		// 배열 항목의 변경값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
	}
}
