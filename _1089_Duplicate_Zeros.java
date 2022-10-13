package LeetCodeProblemSet;

public class _1089_Duplicate_Zeros {

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);

	}
	
	public static void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++; 
            }
        }
        
        
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i]+" ");
        }
    }

}
