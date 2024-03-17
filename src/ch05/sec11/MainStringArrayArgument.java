package ch05.sec11;

/*
 	main() 메소드의 String[] 매개변수 용도
	
	이클립스에서 입력값을 주고 실행하려면 다음 순서대로 진행하면 된다
	[Run] - [Run Configurations] - [Arguments]
	- [Program arguments 입력 란에 입력 값 넣기] - [Run] - 실행
	
	- 메소드 : parseInt()
	- 설명 : 문자열을 정수형으로 바꿔준다
	- 사용 : Integer.parseInt() 로 사용한다
			Reference Type에서 Integer가 정수형이기 때문
 */

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if (args.length != 2) {							// 입력된 데이터 개수가 두 개가 아닐 경우
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);								// 프로그램 강제 종료
		}

		String strNum1 = args[0];						// 첫 번째 데이터 얻기
		String strNum2 = args[1];						// 두 번째 데이터 얻기

		int num1 = Integer.parseInt(strNum1);			// 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);			// 문자열을 정수로 변환

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		System.out.println("================================");
		
		String a = "10";
		String b = "20";
		// 문자열 "10"과 "20"을 int 타입으로 변환하려면 아래와 같이 강제 타입 변환을 한다.
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);

		System.out.println(x); // 출력 : 10
		System.out.println(y); // 출력 : 20
		
		System.out.println("================================");
		
		int num3 = Integer.parseInt("1564812148");
		System.out.println(num3);
	}
}
