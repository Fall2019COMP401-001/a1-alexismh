package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		process(scan);
		
	}
	public static void process(Scanner scan) {
	

		// Your code follows here.
		int count = scan.nextInt();
		for (int i=0; i<count; i++) {
			String first = scan.next();
			String last = scan.next();
			int items = scan.nextInt();
			double totalPrice = 0;
			for (int b=0; b<items; b++) {
				int numberEach = scan.nextInt();
				String nameEach = scan.next();
				double priceEach = scan.nextDouble();
				totalPrice += numberEach * priceEach;
			}
			System.out.println(first.charAt(0) + ". " + last + ": " + totalPrice);
			
		}
		

		 
}
}
