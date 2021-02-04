package sl2;

import java.util.Scanner;

public class no4 {

	public no4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//inisalisasi var
		int panjang2 = 0;
		int counter = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("The given strings are: ");
		String str1 = sc.nextLine();
		System.out.print("The given word is: ");
		String str2 = sc.nextLine();
		
		//split inputan
		String[] word = str1.split(" ");
		
		//cari panjang dari given word
		panjang2 = str2.length();
		int angka = word.length;
		
		//proses cek huruf yang termasuk dan outputnya
		System.out.println("The strings containing all the letters of the given word are:");
		for(int i = 0; i < angka; i++) {
			
			counter = 0; 
			for(int j = 0; j < panjang2; j++) {
				String copy = Character.toString(str2.charAt(j));
				if(word[i].contains(copy)) {
					counter++;
				}
			}
			if(counter >= panjang2) {
				System.out.println(word[i]);
			}
		}
	}

}
