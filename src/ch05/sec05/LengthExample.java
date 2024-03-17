package ch05.sec05;

/*
 	문자열에서 문자의 개수를 얻고 싶다면 length() 메소드를 사용
 	
 	String subject = "자바 프로그래밍";
 	int length = subject.length();
 	
 	위 length 변수에는 8이 저장됨
 	subject 객체의 문자열 길이는 '공백 포함' 8개이기 때문
 	(자1바2공백3프4로5그6래7밍8)
 	
 */
public class LengthExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 가짓수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 가짓수가 틀립니다.");
		}
	}
}
