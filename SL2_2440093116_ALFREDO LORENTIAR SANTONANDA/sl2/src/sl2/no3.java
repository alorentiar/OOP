package sl2;

import java.util.Scanner;

public class no3 {

	public no3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ddeklarasi var awal buat nyimpan panjang length
		int panjang1 = 0;
		int panjang2 = 0;
 		
		System.out.print("The given string is: ");
		String str1 = sc.nextLine();
		System.out.print("The given mask string is: ");
		String str2 = sc.nextLine();
		
		//simpan panjang length string dan mask string
		panjang1 = str1.length();
		panjang2 = str2.length();
		
		//insialisasi array of char
		char arr[] = new char[panjang1];
		char check[] = new char[1000];
		
		//menandai char yang kena mask
		for(int a = 0; a < panjang2; a++) {
			check[str2.charAt(a)]=1;
		}
		
		System.out.println("The new string is : ");
		//print apa saja char yang tidak kena mask
		for(int a = 0; a < panjang1; a++) {
			if(check[str1.charAt(a)] == 0) {
				System.out.print(str1.charAt(a));
			}
		}
	}

}
