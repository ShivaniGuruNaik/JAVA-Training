package Interfaces;

public class Accounts {
	private int accNo;
	private String name;
	private double balance;
	private Bank bank;
	
	public Accounts() {
		super();
	}
	public Accounts(int accNo, String name, double balance, Bank bank) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Accounts [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", bank=" + bank + "]";
	}
	
}
