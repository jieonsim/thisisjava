package ch05.sec05;

/*
 	문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶다면 substring() 메소드를 사용한다
 	
 	- 메소드 : substring(int beginIndex)
 	- 설명 : beginIndex에서 끝까지 잘라내기
 	
 	- 메소드 : substring(int beginIndex, int endIndex)
 	- 설명 : beginIndex에서 endIndex 앞까지 잘라내기
 	
 */
public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		// ssn의 문자열을 인덱싱하면 다음과 같다
		// 8 8 8 8 1 5 - 1 2 3  4  5  6  7
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		// fisrtNum 변수는 "880815" 문자열을 참조

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		// secondNum 변수는 "1234567"을 참조한다
	}
}
