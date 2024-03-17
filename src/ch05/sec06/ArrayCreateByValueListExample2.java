package ch05.sec06;

/*
 	중괄호 {}로 감싼 값의 목록을 배열 변수에 대입할 때 주의할 점이 있다
 	배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다

 	타입[] 변수;
 	변수 = { 값0, 값1, 값2, 값3, ... }; // 컴파일 에러
 	
 	배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면
 	아래와 같이 new 타입[]을 중괄호 앞에 붙여주면 된다
 	
 	타입은 배열 변수를 선언할 때 사용한 타입과 동일하게 주면 된다

 	변수 = new 타입[] { 값0, 값1, 값2, 값3, ... };
 	
 	예를 들어 String 배열 변수 names를 선언한 후에 값 목록을 대입할 경우에는
 	new String[]을 중괄호 앞에 붙여줘야 한다.

 	String[] names = null;
 	names = new String[] { "심지언", "홍길동", "김자바" };
 	
 	메소드의 매개변수가 배열 타입일 경우에도 마찬가지다
 	아래와 같이 매개변수로 int[] 배열 타입을 갖는 printItem() 메소드가 있다고 가정하면
 	printItem() 메소드를 호출할 때 매개값으로 중괄호로 감싼 값 목록을 주면 컴파일 에러가 발생한다
 
 	// 메소드 선언
 	void printItem(int[] scores) { ··· }
 	
 	// 잘못된 메소드 호출
 	printItem( {95, 85, 90} ); // 컴파일 에러
 	
 	매개변수가 이미 선언되어 있고, 호출 시 값 목록을 제공하므로 아래와 같이 호출해야 한다
 	// 올바른 메소드 호출
 	printItem( new int[] {95, 85, 90} );
 	
 */
public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		// 배열 변수 선언
		int[] scores;
		// 배열 변수에 배열을 대입
		scores = new int[] { 83, 90, 87 };
		// 배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		// 배열을 매개값으로 주고, printItem() 메소드 호출
		printItem(new int[] { 83, 90, 87 });
	}

	// printItem() 메소드 선언
	public static void printItem(int[] scores) {
		// 매개변수가 참조하는 배열의 항목을 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}
}
