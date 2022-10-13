package LeetCodeProblemSet;

public class Move_zeros_last {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);

	}
	public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        
        for(int i=index; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
