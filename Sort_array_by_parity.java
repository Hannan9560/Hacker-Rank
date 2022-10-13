package LeetCodeProblemSet;

public class Sort_array_by_parity {

	public static void main(String[] args) {
		int[] nums = {3,1,2,4, 5, 6};
		
		sortArrayByParity(nums);

	}
	
	public static int[] sortArrayByParity(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++){
        	if(nums[i] % 2 == 0){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        
        return nums;
    }

}
