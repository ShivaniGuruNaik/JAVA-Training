package Interfaces;

public interface Bank {
	double MIN_BALANCE = 1000;
	double DEPOSIT_LIMIT = 100000;
	double INTREST_RATE=9.8;
	void deposit(Accounts account, double amount);
	void withdraw(Accounts account, double amount);

}
