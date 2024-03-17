package ch06.exam.ex20;

import java.util.Scanner;

public class BankApplication {
	public static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("---------------------");
		System.out.println("계좌 생성");
		System.out.println("---------------------");
		
		System.out.print("계좌번호 : ");
		String accountNumber = scanner.nextLine();
		
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		
		System.out.print("초기 입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account newAccount = new Account(accountNumber, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	// 계좌 목록 보기
	private static void accountList() {
		System.out.println("---------------------");
		System.out.println("계좌 목록");
		System.out.println("---------------------");
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAccountNumber());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	
	// 예금하기
	private static void deposit() {
		System.out.println("---------------------");
		System.out.println("예금");
		System.out.println("---------------------");
		System.out.print("계좌번호 : ");
		String accountNumber = scanner.nextLine();
		System.out.print("예금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(accountNumber);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공되었습니다.");
	}
	
	// 출금하기
	private static void withdraw() {
		System.out.println("---------------------");
		System.out.println("출금");
		System.out.println("---------------------");
		System.out.print("계좌번호 : ");
		String accountNumber = scanner.nextLine();
		System.out.print("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(accountNumber);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");
	}
	
	// Account 배열에서 accountNumber와 동일한 Account 객체 찾기
	private static Account findAccount(String accountNumber) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAccountNumber = accountArray[i].getAccountNumber();
				if(dbAccountNumber.equals(accountNumber)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
