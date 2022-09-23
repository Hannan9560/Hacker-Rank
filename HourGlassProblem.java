package PracticeProblemInterview;

import java.io.IOException;
import java.util.Scanner;

public class HourGlassProblem {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();
    }

	private static int hourglassSum(int[][] arr) {
		
		int max_sum = Integer.MIN_VALUE;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
						+ arr[i+1][j+1] 
						+ arr[i+2][j] + arr[i+2][j+2] + arr[i+2][j+2];
				
				max_sum = Math.max(max_sum, sum);
			}
		}
		
		
		return max_sum;
	}

}
