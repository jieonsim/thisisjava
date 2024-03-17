package ch11.exam.ex07;

// login() 메소드에서 존재하지 않는 ID를 입력하면
// NotExistIDException을 발생시키고,
// 잘못된 패스워드를 입력하면 WrongPasswordException을 발생
public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPassWordException {
		// id가 blue가 아니라면 NotExistIDException을 발생시킴
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}

		// password가 12345가 아니라면 WrongPasswordException을 발생시킴
		if (!password.equals("12345")) {
			throw new WrongPassWordException("패스워드가 틀립니다.");
		}
	}
}
