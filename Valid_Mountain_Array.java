package LeetCodeProblemSet;

public class Valid_Mountain_Array {

	public static void main(String[] args) {
		int[] arr = {0,3,2,1};

		System.out.println(validMountainArray(arr));

	}

	private static boolean validMountainArray(int[] arr) {
		int n = arr.length;
		int i = 0;
		
		while(i+1 < n && arr[i] < arr[i+1])
			i++;
		
		if(i == 0 || i == n-1)
			return false;
		
		while(i+1 < n && arr[i] > arr[i+1])
			i++;
		
		return i == n-1;
	}

}
