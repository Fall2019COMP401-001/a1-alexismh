package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		process(scan);

	}
	
	public static void process(Scanner scan) {
		// Your code follows here.
		int totalCount = scan.nextInt();
		 double[] arr = new double [totalCount];
		 String [] beep = new String[totalCount];
		
		for (int i=0; i<totalCount; i++) {
			beep[i] = scan.next();
			arr[i] = scan.nextDouble();
		}	
		
		int totalCustomers = scan.nextInt();
		int [] jar = new int[totalCount];
		int [] tar = new int[totalCount];

		for (int j=0; j<totalCustomers; j++) {
			String first = scan.next();
			String last = scan.next();
			int bought = scan.nextInt();
			for (int b=0; b<bought; b++) {
				int numberEach = scan.nextInt();
				String nameEach = scan.next();
				for(int i=0; i<totalCount; i++) {
					if (nameEach.equals(beep[i])) {
						tar[i] += numberEach;
						jar[i]++;
					}
				}
				
		}
				
		}
		for (int i=0; i<totalCount; i++) {
			if (jar[i] == 0) {
				System.out.println("No customers bought " + beep[i]);
			} else {
				System.out.println(jar[i] + " customers bought " + tar[i] + " " + beep[i]);
			}
		}
	 
		
	}
}
