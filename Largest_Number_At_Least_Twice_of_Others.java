package PracticeProblemInterview;

public class Largest_Number_At_Least_Twice_of_Others {

	public static void main(String[] args) {
		int[] nums = {3, 6, 1, 0};
		System.out.println(dominantIndex(nums));
	}
	
	public static int dominantIndex(int[] nums) {
			
			int maxIndex = 0;
			for(int i=0; i<nums.length; i++) {
				if(nums[i] > nums[maxIndex]) {
					maxIndex = i;
				}
			}
			
			for(int i=0; i < nums.length; i++) {
				if(maxIndex != i && nums[maxIndex] < 2*nums[i]) {
					return -1;
				}
			}
			
			return maxIndex;
	}

}
