package sl2;

import java.util.Scanner;

public class no2 {

	public no2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String 1 : ");
		String str1 = sc.nextLine();
		System.out.print("String 2 : ");
		String str2 = sc.nextLine();
		
		//dibandingkan
		int cek = str1.compareTo(str2);
		
		//tampilkan hasil
		if(cek == 0) {
			System.out.println("\""+str1+"\" is equal to \""+str2+"\"");
			//sama dong
		}else if(cek < 0) {
			System.out.println("\""+str1+"\" is less than \""+str2+"\"");
			//lebih kecil
		}else if(cek > 0) {
			System.out.println("\""+str1+"\" is more than \""+str2+"\"");
			//lebih besar
		}

	}

}
