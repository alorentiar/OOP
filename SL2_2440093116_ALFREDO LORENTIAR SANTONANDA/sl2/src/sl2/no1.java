package sl2;

import java.util.Scanner;

public class no1 {

	public no1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Original String = ");
		//Saya asumsikan kalau tulisan Java Exercises! perlu inputan
		String str = sc.nextLine();
		
		System.out.print("Which index position that you want to know : ");
		int cari = sc.nextInt();
		//Menyimpan hasil sesuai dengan yang diminta soal
		int idx1 = str.charAt(cari);
		
		//cetak hasilnya
		System.out.println("The character at position "+ cari +" is "+ (char)idx1);
	}
}
