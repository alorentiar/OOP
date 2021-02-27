/* TUGAS SL OOP
 * 
 * Alfredo Lorentiar Santonanda
 * PPTI 10
 * 2440093116
 * 
 */



package withdrawMoney;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void menu() {

		
		System.out.println("Withdraw Money");
		System.out.println("=============");
		System.out.println("1.Create Account");
		System.out.println("2.Transaction");
		System.out.println("3.Exit");
	}
	
	public static void main(String[] args) {
		int inp = 0;
		String tempNama;
		String tempUser;
		String tempPin;
		int tempBalance;
		int isAngka = 0;
		int count = 0;
		int cek = -1;
		int savedIdx = 0;
		int Mdebdep = 0;
		int tempDebit = 0;
		int tempDepo = 0;
		
		ArrayList<Account> aList = new ArrayList<Account>();
		
		
		Scanner sc = new Scanner(System.in);
				
				
		do {
			menu();
			do {
				System.out.print(">> ");
				inp = sc.nextInt();
			}while(inp<1||inp>3);
			switch(inp){
			case 1:
				
				System.out.print("Please input Name : ");		
				tempNama = sc.nextLine();
				sc.nextLine();
				
				System.out.print("Please input username : ");		
				tempUser = sc.nextLine();
//				System.out.println("Press enter to continue...");
//				sc.nextLine();
				
				do {
					System.out.print("Please input PIN : ");
					tempPin = sc.nextLine();
					for(int b = 0; b <tempPin.length(); b++) {
						if(tempPin.charAt(b)>='0' && tempPin.charAt(b)<='9') {
							isAngka=1;
						}else {
							isAngka=0;
							break;
						}
					}
				}while((tempPin.length()< 1|| (isAngka == 0)));
				
				
				do {
				System.out.print("Please input account balance : ");
				tempBalance = sc.nextInt();
				}while(tempBalance<1);
				
				aList.add(new Account(tempUser, tempPin, tempNama,tempBalance));
				
				System.out.println("Data saved successfully!");
				sc.nextLine();
				
				count++;
				
			break;
					
			case 2:
				System.out.println("Please press enter...");
				sc.nextLine();
				System.out.print("Please input your username : ");
				tempUser = sc.nextLine();
				
				for(int i = 0 ; i < count; i++) {
					if(aList.get(i).username.equals(tempUser)) {
						cek = 1;
						savedIdx = i;
						break;
					}else {
						cek = 0;
					}
				}
//				System.out.println(count);
				if(cek == 0) System.out.println("No Username found");
				
				
				if(cek == 1) {
				do {
					System.out.print("Please input your PIN : ");
					tempPin = sc.nextLine();
					for(int b = 0; b <tempPin.length(); b++) {
						if(tempPin.charAt(b)>='0' && tempPin.charAt(b)<='9') {
							isAngka=1;
						}else {
							isAngka=0;
							break;
						}
					}
				}while((tempPin.length()< 1|| (isAngka == 0)));
				
				if(aList.get(savedIdx).pin.equals(tempPin)) {
					System.out.println("Which transaction do you choose :");
					System.out.println("1. Debit");
					System.out.println("2. Deposit");
					do {
						System.out.print("[1/2] :");
						Mdebdep = sc.nextInt();
					}while(Mdebdep<1||Mdebdep>2);
					
					if(Mdebdep == 1) {
						if(aList.get(savedIdx).saldo == 0) {
							System.out.println("You cannot make a withdrawal, an account balance does not exist");
							break;
						}
						
						System.out.print("Please input your debit Amount : ");
						tempDebit = sc.nextInt();
						Account.debit(tempDebit);
					}
					else if(Mdebdep == 2) {
						System.out.print("Please input your deposit Amount : ");
						tempDepo = sc.nextInt();
						Account.deposit(tempDepo);
					}
					
				}else {
					System.out.println("Wrong Pin...");
				}
				
				
				}
				
			break;
			case 3:
				System.out.println("Thank you for using this application...");
				System.out.println("Stay safe everyone and obey the health protocols ...");
			break;
			
			}
			
			
					
					
		}while(inp!=3);
	}

}
