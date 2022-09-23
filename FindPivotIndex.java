package PracticeProblemInterview;

public class FindPivotIndex {
	public static void main(String[] args) {
		int[] nums = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
	
	public static int pivotIndex(int[] nums) {
		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];
		
		int temp = 0;
		for(int i=0; i<nums.length; i++) {
			leftSum[i] = temp;
			temp += nums[i];
		}
		
		temp = 0;
		for(int j=nums.length - 1; j >= 0; j--) {
			rightSum[j] = temp;
			temp += nums[j];
		}
		
		for(int i=0; i<nums.length; i++) {
			if(leftSum[i] == rightSum[i])
				return i;
		}
		return -1;
	}
}

