package sl2;

import java.util.Scanner;

public class no5 {

	public no5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("The given string is: ");
		String str1 = sc.nextLine();
		
		//split string yang dimasukkan menjadi perkata
		String[] word = str1.split(" ");
		
		//menghitung banyaknya split yang terjadi
		int angka = word.length;
		
		
		
		System.out.print("The new string after reversed is: ");
		//tinggal print terbalik saja
		for (int a = angka-1; a >= 0; a--) {
			if(a == 0) System.out.print(word[a]);
			else System.out.print(word[a]+" ");
		}
}
	
}
