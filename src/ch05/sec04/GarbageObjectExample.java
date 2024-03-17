package ch05.sec04;

/*
 	 어떤 변수에서도 객체를 참조하지 않으면 해당 객체는 프로그램에서 사용할 수 없는 객체가 된다
 	 즉 힙 메모리에는 있지만, 위치 정보를 모르기 때문에 사용할 수 없게 된다
 	 자바는 이러한 객체를 쓰레기로 취급하고, 쓰레기 수집가(garbage collector)를 실행시켜 자동으로 제거한다
 	 
 */
public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦
		
		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println("kind2 : " + kind2);
		
		// 16라인에서 kind1 변수에 null을 대입한다고 해서
		// "자동차"에 해당하는 String 객체가 쓰레기가 되지는 않음
		// kind2 변수가 여전히 참조하고 있기 때문이다
	}
}
