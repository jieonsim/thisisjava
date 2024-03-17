package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* stop 메소드가 final이라서 오버라이딩 할 수 없음
	@Override
	public final void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/

}
