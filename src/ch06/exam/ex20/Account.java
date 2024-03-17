package ch06.exam.ex20;

public class Account {
	private String accountNumber;
	private String owner;
	private int balance;
	
	public Account(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
