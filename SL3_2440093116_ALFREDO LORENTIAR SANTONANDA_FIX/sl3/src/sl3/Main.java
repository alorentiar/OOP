package sl3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void menu() {
		System.out.println("1. Input Data");
		System.out.println("2. Show Data");
		System.out.println("3. Delete Data");
		System.out.println("4. Exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inp = 0;
		int count = 0;
		int toDel = 0;
		int isAngka = 0;
		String nama;
		String pass;
		String phone;
		
		
		ArrayList<String> stringNameList = new ArrayList<String>();
		ArrayList<String> stringPassList = new ArrayList<String>();
		ArrayList<String> stringPhoneList = new ArrayList<String>();
		
		
		do {
			menu();
			do {
				System.out.print("Your Choice : ");
				inp = sc.nextInt();
				sc.nextLine();
			}while(inp<1 ||inp>4);
			
			switch(inp) {
			case 1:
				do {
				System.out.print("Name : ");
				nama = sc.nextLine();
				}while(nama.length()<1);
				do {
				System.out.print("Pass : ");
				pass = sc.nextLine();
				}while(pass.length()<1);
				do {
					System.out.print("Phone : ");
					phone = sc.nextLine();
					for(int b = 0; b <phone.length(); b++) {
						if(phone.charAt(b)>='0' && phone.charAt(b)<='9') {
							isAngka=1;
						}else {
							isAngka=0;
							break;
						}
					}
				}while((phone.length()< 1) || (isAngka == 0));
				
				
				stringNameList.add(nama);
				stringPassList.add(pass);
				stringPhoneList.add(phone);
				
				System.out.println("New data is added");
				
				count++;
			break;
			
			case 2:
				System.out.println("===========================================================");
				System.out.println("| No|		Name|		Pass|		|Phone	  |");
				System.out.println("===========================================================");
				if(count>=1) {
					for(int a = 0; a < count; a++){
						System.out.println("| "+(a+1)+" | 	"+stringNameList.get(a)+" | "+stringPassList.get(a)+" | "+stringPhoneList.get(a));
//						System.out.printf("|%d|%s|%s|%d|",stringNameList.get(a),stringPassList.get(a),stringPhoneList.get(a));
					}
				}
				else {
					System.out.println("			|No data exists|		");
				}
			break;
			
			case 3:
				if(count == 0) System.out.println("No data to be deleted..");
				else {
					do {
						System.out.print("Input data number to be deleted: ");
						toDel = sc.nextInt();
					}while(toDel<1||toDel>count);
					toDel = toDel - 1;
					stringNameList.remove(toDel);
					stringPassList.remove(toDel);
					stringPhoneList.remove(toDel);
					count--;
				}
			break;
			
			case 4:
				System.out.println("Thank you for using this application..");
			break;
			
			}
		}while(inp!=4);
		
		
	}

}
