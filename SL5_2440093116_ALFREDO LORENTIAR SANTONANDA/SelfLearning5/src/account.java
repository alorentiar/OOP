
import java.util.Date;

public class account {

	Double interest;
	static Double balance;
	String accountID;
	static Date time;
	
	public account() {
		// TODO Auto-generated constructor stub
	}

	public account(Double interest, Double balance, String accountID,Date time) {
		super();
		this.interest = interest;
		account.balance = balance;
		this.accountID = accountID;
		account.time = time;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public static void deposit(Double depo, Date waktu) {
		balance = balance + depo;
		System.out.println("Success Deposit");
		System.out.println("Now your balance is " + balance);
		
		time = waktu;
		
		System.out.println("Deposit Success at "+ time);
	}
	
	public static void withdraw(Double withdraw, Date waktu) {
		if(balance == 0.0) {
			System.out.println("Not enough balance..");
		}
		else {
		balance = balance - withdraw;
		System.out.println("Success Withdraw");
		System.out.println("Now your balance is " + balance);
		
		time = waktu;
		
		System.out.println("Withdraw Success at "+ time);
		}
	}
	
	

	
}
