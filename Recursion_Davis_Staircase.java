package PracticeProblemInterview;

import java.util.Scanner;

public class Recursion_Davis_Staircase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(stepPerms(n));
     
	}

	private static int stepPerms(int n) {
		
//		if(n == 1 || n == 0) return 1;
//		
//		else if(n == 2) return 2;
//		
//		
//		else return stepPerms(n-3) + stepPerms(n-2) + stepPerms(n-1);
		
		int[] res = new int[n + 1]; 
        res[1] = 1;
        if(n >= 2) res[2] = 2;
        if(n >= 3) res[3] = 4;
  
        for (int i = 4; i <= n; i++) 
            res[i] = res[i - 1] + res[i - 2] 
                     + res[i - 3]; 
  
        return res[n]; 
		
	}
}
