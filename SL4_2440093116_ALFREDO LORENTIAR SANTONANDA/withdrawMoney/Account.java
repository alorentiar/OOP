/* TUGAS SL OOP
 * 
 * Alfredo Lorentiar Santonanda
 * PPTI 10
 * 2440093116
 * 
 */

package withdrawMoney;

public class Account {
	//Properti
	String username;
	String pin;
	String nama;
	static int saldo;

	public Account(String username, String pin,String nama, int saldo) {
		super();
		this.username = username;
		this.pin = pin;
		this.nama = nama;
		Account.saldo = saldo;
	}
	
	//method
	
	//debit
	public static void debit(int debit) {
		if(saldo >= debit) {
			saldo = saldo - debit;
			System.out.println("Success Debit");
			System.out.println("Now your balance is "+ saldo);
		}
		else if(saldo == 0){
			System.out.println("You cannot make a withdrawal, an account balance does not exist");
		}else {
			System.out.println("The amount of debit exceeds the account balance");
		}
	}
	
	public static void deposit(int depo) {
		saldo = saldo + depo;
		System.out.println("Success Deposit");
		System.out.println("Now your balance is " + saldo);
	}

}
