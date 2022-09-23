package PracticeProblemInterview;

import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int k, n;
		n = input.nextInt();
		k = input.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println(hurdleRace(k, arr));
		
	}

	private static int hurdleRace(int k, int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return 0;
		}
		
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		int diff = max - k;
		
		if(diff < 0) {
			return 0;
		}
		
		return diff;
		
	}

}
