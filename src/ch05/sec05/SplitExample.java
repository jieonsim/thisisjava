package ch05.sec05;

/*
 	문자열이 구분자를 사용하여 여러 개의 문자열로 구성되어 있을 경우,
 	이를 따로 분리해서 얻고 싶다면 split() 메소드를 사용한다
 	
 	- 메소드 : split(String regex)
 	- 설명 : 괄호 안에 구분자 입력 시 구분자로 구분된 문자열을 분리해줌
 	
 */

public class SplitExample {
	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		// board는 쉼표로 구분된 문자열을 가지고 있다
		// split() 메소드를 호출할 때 쉼표를 제공하면 분리된 문자열로 구성된 배열을 얻을 수 있다
		
		// 문자열 분리
		String[] tokens = board.split(",");

		// 인덱스별로 읽기
		System.out.println("번호 : " + tokens[0]);
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("성명 : " + tokens[3]);
		System.out.println();

		// for 문을 이용한 읽기
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
