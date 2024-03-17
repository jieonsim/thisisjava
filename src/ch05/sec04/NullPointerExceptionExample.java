package ch05.sec04;

/*
	참조 타입 변수는 아직 번지를 저장하고 있지 않다는 뜻으로 null(널)값을 가질 수 있다
	null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다
	
	String refVar1 = "자바";
	String refVar2 = null;

	참조 타입 변수가 null을 가지는지 확인하려면 다음과 같이 ==, !== 연산을 수행
	refVar1 == null // 결과 : false
	refVar1 != null // 결과 : true

	refVar2 == null 결과 : true
	refVar2 != null 결과 : false

	참조 변수를 사용해서 가장 많이 발생하는 예외 중 하나는 NullPointerException
	변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할 때 이 예외가 발생함

*/
public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		intArray[0] = 10; // nullPointerException
		// intArray가 참조하는 배열 객체가 없으므로 10을 저장할 수 없기 때문에 NullPointerException 발생
		
		String str = null;
		System.out.println("총 문자 수 : " + str.length()); // NullPointerException
		// str 변수가 참조하는 String 객체가 없으므로 문자열의 길이를 구할 수 없음, 이에 NullPointerException 발생
	}
}
