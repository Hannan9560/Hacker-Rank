package PracticeProblemInterview;

public class FindPivotIndex2 {
	public static void main(String[] args) {
		int[] nums = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
	
	public static int pivotIndex(int[] nums) {
		
		int sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		
		int temp = 0;
		
		for(int i=0; i <nums.length; i++) {
			sum -= nums[i];
			if(temp == sum) return i;
			temp += nums[i];
		}
		
		return -1;
	}
}

