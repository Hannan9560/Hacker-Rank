package PracticeProblemInterview;

import java.util.Arrays;
import java.util.Scanner;

public class ClossetNumber {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();
        
        closestNumbers(array);
        
        System.out.print(array);
        
    }

	private static int[] closestNumbers(int[] arr) {
		int minAbs = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int[] out = new int[(arr.length) + 3];
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            minAbs = Math.min(minAbs, Math.abs(arr[i] - arr[i - 1]));
            
        }
        
        for (int i = 1; i < arr.length; i++) {
            if(minAbs ==Math.abs(arr[i] - arr[i - 1])) {
                out[j++]=arr[i - 1];
                out[j++]=arr[i];
            }
        }
        int[] tem= new int[j];
        for(int i=0; i<j;i++) {
            tem[i]=out[i];
        }
        
        
        return tem;
		
	}

}
