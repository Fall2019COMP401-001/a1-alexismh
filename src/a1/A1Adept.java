package a1;

import java.util.Scanner;

public class A1Adept {

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
		double [] jiff = new double [totalCustomers];
		String [] mars = new String [totalCustomers];
		
		for (int j=0; j<totalCustomers; j++) {
			String first = scan.next();
			String last = scan.next();
			int bought = scan.nextInt();
			double totalPrice = 0;
			for (int b=0; b<bought; b++) {
				int numberEach = scan.nextInt();
				String nameEach = scan.next();
				for (int a=0; a<totalCount; a++){
				if (nameEach.equals(beep[a])) {
				 totalPrice += numberEach * arr[a];
				}
				
		}
				jiff[j] = totalPrice;
				mars[j] = first+ " " +last;
		}
	 }
		double max = 0.0;
		String wom = "r";
			for (int y=0; y<jiff.length; y++) {
				if (jiff[y] > max) {
					max = jiff[y];
					wom = mars[y];
					
				}
			}
			System.out.println("Biggest: " + wom + "(" + String.format("%.2f", max) + ")");
			
			
			double min = jiff[0];
			String man = "j";
			for (int e=0; e<jiff.length; e++) {
				if (jiff[e] < min) {
					min = jiff[e];
					man = mars[e];
				}
			}
			System.out.println("Smallest: " + man + "(" + String.format("%.2f", min) + ")");
		
		double sum = 0.0;
				for (int r=0; r<jiff.length; r++) {
					sum += jiff[r];
			
		}
				double average = sum / jiff.length;
				System.out.println("Average: " + String.format("%.2f", average));
	}
}






 
