package ch09.exam.ex05;

// Action의 익명 구현 객체를 만들기

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}
}
