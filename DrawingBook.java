package PracticeProblemInterview;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		System.out.println(pageCount(n,p));
		in.close();

	}

	private static int pageCount(int n, int p) {
		int totalPageCountFromFront = n/2;
		int targetPageCountFromFront  = p/2;
		int targetPageTurnCountFromBack = totalPageCountFromFront - targetPageCountFromFront;
		
		return Math.min(targetPageCountFromFront, targetPageTurnCountFromBack);
		
	}

}
