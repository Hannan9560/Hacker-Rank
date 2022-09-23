package PracticeProblemInterview;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}

		int asum = 0;
		
		int charged = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(i==k) {
				asum = asum+0;
			} else {
				asum = asum + c[i];
			}
		}
		
		int tasum = asum/2;
		
		if(charged == tasum) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(charged - tasum);
		}
	}

}
