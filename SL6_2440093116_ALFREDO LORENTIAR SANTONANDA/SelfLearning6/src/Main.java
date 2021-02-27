import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void menu() {
		System.out.println("Book Loan Application");
		System.out.println("=====================");
		System.out.println("1.Create User");
		System.out.println("2.Borrow Book") ;
		System.out.println("3.Return Book");
		System.out.println("4.Exit");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inp=0;
		int count=0;
		int countBook = 0;
		int savedIdx = 0;
		int totalDays = 0;
		int totalFine = 0;
		
		String tempID;
		String tempName;
		String tempPhone;
		String tempBookName;
		String tempBookAuthor;
		int tempDayIn;
		int tempMonthIn;
		int tempYearIn;
		int tempDayOut;
		int tempMonthOut;
		int tempYearOut;
		
		ArrayList<User> addUser = new ArrayList<User>();
		ArrayList<Book> pinjBook = new ArrayList<Book>();
//		ArrayList<Book> kembBook = new ArrayList<Book>();
		
		
		
		do {
			menu();
			do {
				System.out.print(">> ");
				inp = sc.nextInt();
			}while(inp<1||inp>4);
			
			sc.nextLine();
			switch(inp) {
			case 1:
				//input ID
				do {
					System.out.print("Please input user id [1-5]: ");
					tempID = sc.nextLine();
				}while(tempID.length()<1||tempID.length()>5);
				//input NAMA
				do {
					System.out.print("Please input name [1-10] : ");
					tempName = sc.nextLine();
				}while(tempName.length()<1||tempName.length()>10);
				
				//input Phone Number
				do {
					System.out.print("Please input Phone Number[1-12] : ");
					tempPhone = sc.nextLine();
				}while(tempPhone.length()<1 || tempPhone.length()>12);
				
				addUser.add(new User(tempID,tempName,tempPhone));
				
				System.out.println("Success create user!");
				count++;
			break;
			
			case 2:
				//Borrow Book
				System.out.println("BORROW BOOK");
				System.out.println("===========");
				
				System.out.print("Please input yout User ID : ");
				tempID = sc.nextLine();
				
				for(int i = 0; i < count; i++) {
					if(addUser.get(i).userID.equals(tempID)) {
						savedIdx = i;
						break;
					}else {
						savedIdx = -1;
					}
				}
				
				if(savedIdx == -1) {
					System.out.println("User ID not found..");
					break;
				}
				
//				System.out.println("saved idx :" + savedIdx);
				else {
					System.out.print("Please input book name : ");
					tempBookName = sc.nextLine();
					System.out.print("Please input book author : ");
					tempBookAuthor = sc.nextLine();
					System.out.print("Please input day in :");
					tempDayIn = sc.nextInt();
					System.out.print("Please input month in :");
					tempMonthIn = sc.nextInt();
					System.out.print("Please input year in :");
					tempYearIn = sc.nextInt();
					
					
					pinjBook.add(new Book(tempBookName,tempBookAuthor,tempDayIn,tempMonthIn,tempYearIn));
					
					System.out.println("");
					System.out.println("Success Borrow Book!");
					System.out.println("Please return max 7 days, otherwise fine 1000/day");
					System.out.println("Thank you..");
					
					System.out.println("");
					System.out.println("");
					
					countBook++;
				}
				
				savedIdx = -1;
				
			break;
			
			case 3:
				//Return Book
				System.out.println("RETURN BOOK");
				System.out.println("===========");
				
				System.out.print("Please input yout User ID : ");
				tempID = sc.nextLine();
				
				savedIdx = -1;
				
				for(int i = 0; i < count; i++) {
					if(addUser.get(i).userID.equals(tempID)) {
						savedIdx = i;
						break;
					}else {
						savedIdx = -1;
					}
				}
				
				if(savedIdx == -1) {
					System.out.println("User ID not found..");
					System.out.println("");
					System.out.println("");
					break;
				}
				
				
//				System.out.println("saved idx :" + savedIdx);
				else {
					System.out.print("Please input book name : ");
					tempBookName = sc.nextLine();
					
					savedIdx = -1;
					
					for(int i = 0; i < countBook; i++) {
						if(pinjBook.get(i).bookName.equals(tempBookName)) {
							savedIdx = i;
							break;
						}else {
							savedIdx = -1;
						}
					}
					
					if(savedIdx == -1) {
						System.out.println("Book Not found..");
						System.out.println("");
						System.out.println("");
						break;
					}
					
					else {
						System.out.print("Please input day out :");
						tempDayOut = sc.nextInt();
						sc.nextLine();
						System.out.print("Please input month out :");
						tempMonthOut = sc.nextInt();
						sc.nextLine();
						System.out.print("Please input year out :");
						tempYearOut = sc.nextInt();
						sc.nextLine();
						System.out.println("");
						System.out.println("");
						
						Book hitungTelat = new Book();
						if((tempMonthOut!=pinjBook.get(savedIdx).borrowMonth || tempMonthOut==pinjBook.get(savedIdx).borrowMonth) && tempYearOut!=pinjBook.get(savedIdx).borrowYear) {
							int bulSem;
							
							bulSem = (((tempYearOut - (pinjBook.get(savedIdx).borrowYear)) * 12) - (tempMonthOut - (pinjBook.get(savedIdx).borrowMonth)) * 31);
							
							totalDays = (bulSem)*31 - (tempDayOut-(pinjBook.get(savedIdx).borrowDay));
//							totalDays = totalDays - 7;
							if(totalDays <= 7) {
								totalDays = 0;
							}else {
								totalDays = totalDays - 7;
							}
							totalFine = hitungTelat.calculateOverdue(totalDays);
							
//							System.out.println(tempYearOut+" - "+pinjBook.get(savedIdx).borrowYear);
						}else if(tempMonthOut!=pinjBook.get(savedIdx).borrowMonth && tempYearOut==pinjBook.get(savedIdx).borrowYear) {
							totalDays = ((tempMonthOut - pinjBook.get(savedIdx).borrowMonth) * 31) - (tempDayOut-pinjBook.get(savedIdx).borrowDay);
//							totalDays = totalDays - 7;
							if(totalDays <= 7) {
								totalDays = 0;
							}else {
								totalDays = totalDays - 7;
							}
							totalFine = hitungTelat.calculateOverdue(totalDays);
						}else {
							totalDays = tempDayOut - pinjBook.get(savedIdx).borrowDay;
							if(totalDays <= 7) {
								totalDays = 0;
							}else {
								totalDays = totalDays - 7;
							}
							totalFine = hitungTelat.calculateOverdue(totalDays);
						}
						
						if(totalFine == 0) {
							System.out.println("Thank you for returning on time! No fine applied!");
//							System.out.println(totalFine);
						}else {
							System.out.println("Your fine (in IDR ) : "+ totalFine);
						}
						
						System.out.println("");
						System.out.println("Success Return Book!");
						System.out.println("Thank you..");
						System.out.println();
						
						System.out.println("");
						System.out.println("");
						pinjBook.remove(savedIdx);
						countBook--;
						
						savedIdx = -1;
						
						tempYearOut = 0;
						tempMonthOut = 0;
						tempDayOut = 0;
					}
					
					
				}
			break;
			
			case 4:
				//Exit
				System.out.println("Thank you for using this application...");
			break;
			}
		}while(inp!=4);
	}

}
