package calculator.java;

import java.util.Scanner;

public class Main {
	

	public Main() {
		// TODO Auto-generated constructor stub
		
	}
	
	static void spasi() {
		for(int i = 0; i < 10; i++) {
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//inisialisasi first run
		int cek = 0;
		
		//buat coba pake try catch
		boolean check = true;
		
		//inisialisasi input
		int menu = 0;
		
		double hasil=0.0,input1=0.0,input2=0.0;
		
		//bikin tampilan
		do {
			spasi();
			System.out.println("Calculator");
			System.out.println("==============");
			System.out.println("Total = "+ hasil);
			//nilai input1 diambil dari hasil ketika 
			input1 = hasil;
			System.out.println("");
			System.out.println("");
			//input number pertama
			if(cek == 0) {
				do {
				
					check = true;
				
					try {
						System.out.print("Input number : ");
						input1 = sc.nextInt();
						sc.nextLine();
					} catch (Exception e) {
						check = false;
						sc.nextLine();
					}
				
				}while(check == false);
				
			}
			
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulo");
			System.out.println("6. Clear Total");
			System.out.println("7. Exit");
			
			//input menu dan validasi
			do{
				do {
					check = true;
					
					try {
						System.out.print("Operator [1...7]: ");
						menu = sc.nextInt();
						sc.nextLine();
					} catch (Exception e) {
						check = false;
						sc.nextLine();
					}
				
				}while(check == false);
			}while(menu < 1 || menu > 7);
			//otomatis keluar ketika input 7
			if(menu == 7) {
				System.exit(0);
			}
			//jika input bukan 6 maka dia minta input number kedua
			if(menu != 6) {
				do {
					
					check = true;
				
					try {
						System.out.print("Input number : ");
						input2 = sc.nextInt();
						sc.nextLine();
					} catch (Exception e) {
						check = false;
						sc.nextLine();
					}
				
				}while(check == false);
			}
			switch(menu){
				case 1:
					hasil = input1 + input2;
				break;
				
				case 2:
					hasil = input1 - input2;
				break;
				
				case 3:
					hasil = input1 * input2;
				break;
				
				case 4:
					hasil = input1 / input2;
				break;
				
				case 5:
					hasil = input1 % input2;
				break;
				
				case 6:
					hasil = 0.0;
					input1 = 0.0;
					input2 = 0.0;
					cek = 0;
				break;
				
			};
			
			
		}while(menu != 7 );
	
	}


}
