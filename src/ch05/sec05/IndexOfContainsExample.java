package ch05.sec05;

/*
 	문자열에서 특정 문자열의 위치를 찾고자 할 때에는 indexOf() 메소드를 사용한다
 	indexOf() 메소드는 주어진 문자열이 시작되는 인덱스를 리턴한다
 	
 */

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		// location 변수에는 3이 저장되는데, "자바 프로그래밍"에서
		// "프로그래밍" 문자열의 인덱스 위치가 3번이기 때문이다

		String substring = subject.substring(location);
		System.out.println(substring);
		// substring() 메소드 : 문자열에서 특정 위치의 문자열을 잘라내어 가져오기
		// location 변수에 3이 저장되어 있기 때문에
		// substring() 메소드를 통해 3인덱스인 '프'부터 끝('밍')까지 모두 출력

		location = subject.indexOf("자바");
		if (location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		// 만약 주어진 문자열이 포함되어 있지 않으면 indexOf() 메소드는 -1을 리턴한다
		// 주어진 문자열이 포함되어 있는지 여부에 따라 실행 코드를 달리하고 싶다면
		// if 조건식을 사용해서 위와 같이 코드를 작성할 수 있다

		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		//
	}
}
