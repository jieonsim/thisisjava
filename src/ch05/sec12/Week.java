package ch05.sec12;

/*
 	데이터 중에는 몇 가지로 한정된 값을 갖는 경우가 있다.
 	예를 들어 요일은 월,화,수,목,금,토,일이라는 7개의 값을,
 	계절은 봄,여름,가을,겨울이라는 4개의 값을 갖는다.
 	
 	이와 같이 한정된 값을 갖는 타입을 열거 타입(enumeration type)이라고 한다.
 	
 	열거 타입을 사용하기 위해서는 먼저 열거 타입 이름으로
 	소스 파일(.java)을 생성하고 한정된 값을 코드로 정의해야 한다.
 	(패키지 생성 후 패키지명에서 마우스 우클릭 > new > Enum > Name 입력 란에 열거 타입 이름 입력
 	
 	- 열거 타입 이름은 첫 문자를 대문자로 하고 캐멀(camel) 스타일로 지어주는 것이 관례이다.  
 */

public enum Week { // Week : 열거 타입 이름
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
	/* ↑ 열거 상수 목록 (한정된 값 목록)
	
	열거 상수는 열거 타입으로 사용할 수 있는 한정된 값을 말한다.
	관례적으로 알파벳으로 정의하며, 모두 대문자로 작성한다.
	열거 상수가 여러 단어로 구성될 경우 단어와 단어 사이를 언더바(_)로 연결하는 것이 관례이다.
	
	예)
	public enum LoginResult {
		LOGIN_SUCCESS,
		LOGIN_FAILED
	}	
	
	
	열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야 한다.
	열거 타입 Week로 변수를 선언하면 다음과 같다.
	
	Week today;
	Week reservationDay;
	
	열거 타입 변수에는 열거 상수를 대입할 수 있는데, '열거타입.열거상수' 형태로 작성한다.
	Week 변수에 열거 상수인 SUNDAY를 대입하는 코드는 다음과 같다.
	
	Week today = Week.Sunday;
	
	열거 타입은 참조 타입이므로 Week 변수에 다음과 같이 null도 대입할 수 있다.
	Week birthday = null;
	
	열거 변수의 값이 특정 열거 상수인지 비교할 때는 ==와 != 연산자를 사용한다.
	Week 변수값이 SUNDAY인지 비교하는 코드는 다음과 같다.
	
	Week today = Week.SUNDAY;
	today == Week.SUNDAY
	(출력 결과: true)
	
	컴퓨터의 날짜 및 요일, 시간을 얻을 때는 Calendar를 이용한다.
	오늘의 연, 월, 일, 요일, 시간, 분, 초를 다음과 같이 얻을 수 있다.
	
	Calendar now = Calendar.getInstance();			// Calendar 객체 얻기
	int year	 = now.get(Calendar.YEAR);			// 연
	int month	 = now.get(Calendar.MONTH) + 1;		// 연
	int day 	 = now.get(Calendar.DAY_OF_MONTH);	// 연
	int week 	 = now.get(Calendar.DAY_OF_WEEK);	// 연
	int hour 	 = now.get(Calendar.HOUR);			// 연
	int minute 	 = now.get(Calendar.MINUTE);		// 연
	int second	 = now.get(Calendar.SECOND);		// 연
	
	 */
}
