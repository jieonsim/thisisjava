package ch08.sec12;

// ride() 메소드의 매개값으로 Bus를 제공했을 경우에만 checkFare() 메소드를 호출하는 예제
public class InstanceOfExample {
	public static void main(String[] args) {
		// 구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// ride() 메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	
	// 인터페이스를 매개변수로 갖는 메소드
	public static void ride(Vehicle vehicle) {
		// 방법1
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
		// 매개값이 Bus인 경우에만 강제 타입 변환해서 checkFare() 메소드를 호출
		
		
		/*방법2 : java12부터 사용 가능
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		*/
	}
}
