package PracticeProblemInterview;

import java.io.IOException;
import java.util.Scanner;

public class Recursive_Digit_Sum {

	static int digitSum(String n, int k) 
    {
        long num = 0;
        for(int i=0; i<n.length(); i++) {
        	num += Integer.parseInt(n.charAt(i) + "");
        }
        
        num = digit_Sum(num*k);
        int num2 = (int) num;
        return num2;
    }

    private static long digit_Sum(long l) {
		if(l < 10) {
			return l;
		} else {
			int num = 0; 
			while(l>0) {
				num += l%10;
				l = l/10;
			}
			return digit_Sum(num);
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = digitSum(n, k);

        System.out.println(result);

        scanner.close();
    }

}
