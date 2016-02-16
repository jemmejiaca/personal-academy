package ch14;

public class BankAccount {
	private long number;
	private long balance;
	
	public BankAccount(long initialDeposit) {
		balance = initialDeposit;
	}
	
	public synchronized long getBalance() {
		return balance;
	}
	
	public synchronized void deposit(long amount) {
		balance += amount;
	}

}
