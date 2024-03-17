package ch05.exam;

/*
	배열 항목에서 최대값을 출력하는 코드(for 문 이용)
*/

public class Example1 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	}
}
