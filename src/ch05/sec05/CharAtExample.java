package ch05.sec05;

/*
 	문자열에서 특정 위치의 문자를 얻고 싶다면 charAt() 메소드를 이용한다
	charAt() 메소드는 매개값으로 주어진 인덱스의 문자를 리턴한다
	인덱스란 0에서부터 '문자열의 길이 - 1' 까지의 번호를 말한다
	
	- 메소드 : charAt(int index)
	- 설명 : 문자열에서 얻고 싶은 문자의 인덱스를 입력
			지정된 인덱스에서 'char'값을 반환한다
			인덱스 범위는 0부터 'lenght() - 1'까지
	
 */
public class CharAtExample {
	public static void main(String[] args) {
		// 주민등록번호에서 성별에 해당하는 7번째 문자를 읽고 남자 또는 여자인지 출력하는 코드
		String ssn = "9506241230123"; // ssn : Social Security Mumber
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
