import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void menu() {
		System.out.println("Bank Profit");
		System.out.println("===========");
		System.out.println("1. Open Account");
		System.out.println("2. Deposit Account");
		System.out.println("3. Withdraw Account");
		System.out.println("4. Close Account");
		System.out.println("5. Check Balance");
		System.out.println("6. Show Interest Rate");
		System.out.println("7. Exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int inp = 0;
		int cek = -1;
		int savedIdx = 0;
		int todel = 0;
		Double interest = 0.1;
		Double balance = 0.0;
		
		String accID;
		String name;
		String address;
		String dateOfBirth;
		
		Double tempDepo;
		Double tempWD;
		
		Date tanggal = null;
		
		
		ArrayList<account> listAccount = new ArrayList<account>();
		ArrayList<customer> listCustomer = new ArrayList<customer>();
		
		do {
			menu();
			
			try {
				do {
				System.out.print(">>");
				inp = sc.nextInt();
				}while(inp<1||inp>7);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			switch(inp) {
			case 1:
				System.out.println("Open Account");
				System.out.print("Account ID : ");
				accID = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Name : ");
				name = sc.nextLine();
//				sc.nextLine();
				
				System.out.print("Address : ");
				address = sc.nextLine();
//				sc.nextLine();
				
				System.out.print("Date of birth [DDMMYYYY]: ");
				dateOfBirth = sc.nextLine();
//				sc.nextLine();
				
				listCustomer.add(new customer(accID, name, address, dateOfBirth));
				listAccount.add(new account(interest,balance,accID,tanggal));
				
				System.out.println("Success Open Account");
				
				count++;
			break;
			
			case 2:
				sc.nextLine();
				System.out.println("Deposit Account");
				System.out.print("Please input your Name : ");
				name = sc.nextLine();
				System.out.println("Please press enter again...");
				sc.nextLine();
				
				for(int i = 0; i < count; i++) {
					if(listCustomer.get(i).name.equals(name)) {
						cek = 1;
						savedIdx = i;
//						System.out.println((listCustomer.get(i).name));
						break;
					}else {
						cek = 0;
					}
				}
				
//				System.out.println(cek);
//				System.out.println((listAccount.get(0).accountID));
				
				
				if(cek == 0 || cek == -1) {
					System.out.println("No Name found..");
					break;
				}
				if(cek == 1) {
				System.out.println("Name found!");
				System.out.print("Please input your deposit Amount : ");
				tempDepo = sc.nextDouble();
				sc.nextLine();
				
				
				
				
				
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
				Date tanggalan = new Date();  
//				System.out.println(formatter.format(tanggalan)); 
				
				tempDepo = tempDepo + listAccount.get(savedIdx).balance;
				
			    account.deposit(tempDepo,tanggalan);
				
				System.out.println("Balance Updated!");
				}
				
				cek = -1;
				
			break;
			
			case 3:
				sc.nextLine();
				System.out.println("Withdraw Account");
				System.out.print("Please input your Name : ");
				name = sc.nextLine();
				System.out.println("Please press enter again...");
				sc.nextLine();
				
				for(int i = 0; i < count; i++) {
					if(listCustomer.get(i).name.equals(name)) {
						cek = 1;
						savedIdx = i;
//						System.out.println((listCustomer.get(i).name));
						break;
					}else {
						cek = 0;
					}
				}
				
//				System.out.println(cek);
//				System.out.println((listAccount.get(0).accountID));
				
				
				if(cek == 0 ||cek == -1) {
					System.out.println("No Name found..");
					break;
				}
				if(cek == 1) {
				System.out.println("Name found!");
				System.out.print("Please input your withdraw Amount : ");
				tempWD = sc.nextDouble();
				sc.nextLine();
				
				
				
				
				
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
				Date tanggalan = new Date();  
//				System.out.println(formatter.format(tanggalan)); 
				
				tempDepo = tempWD + listAccount.get(savedIdx).balance;
				
			    account.withdraw(tempWD,tanggalan);
				
				System.out.println("Balance Updated!");
				}
				
				cek = -1;
			break;
			
			case 4:
				System.out.println("Deposit Account");
				
				if(count == 0) {
					System.out.println("No account to be close");
				}
				else {
				System.out.println("Close Account ");
				System.out.println("|No | Name | Balance | Interest|");
				for(int i = 0; i < count; i++) {
					System.out.println("| "+(i+1) +" | "+listCustomer.get(i).name +" | "+listAccount.get(i).balance +" | "+listAccount.get(i).interest+"|");
				}
				do {
					System.out.println("Choose number you want to close account : ");
					todel = sc.nextInt();
				}while(todel<1 || todel>count);
				
				todel = todel-1;
				
				listAccount.remove(todel);
				listCustomer.remove(todel);
//				listTransaction.remove(todel);
				
				count--;
				
				System.out.println("Account successfully closed...");
				}
					
			break;
			
			
			case 5:
				System.out.println("Check Balance");
				
				if(count == 0) {
					System.out.println("No data to be shown..");
				}
				else if (count != 0) {
				System.out.println("|No | Name | Balance | Date last change | Interest|");
				for(int i = 0; i < count; i++) {
					listAccount.get(i);
					System.out.println("| "+(i+1) +" | "+listCustomer.get(i).name +" | "+ listAccount.get(i).balance +" | "+listAccount.get(i).time+" | " + listAccount.get(i).interest+"%"+ "|");
				}
				
				}
				
			break;
			
			case 6:
				System.out.println("Show Interest Rate : ");
				System.out.println("The interest rate is "+ interest + " %");
			break;
			
			}
			
		}while(inp!=7);
		
	}

}
