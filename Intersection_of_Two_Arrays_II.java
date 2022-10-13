package LeetCodeProblemSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_Two_Arrays_II {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2};
		
	
		System.out.println(intersect(nums1, nums2).length);
	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		
		if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		}
		
		int i = 0;
        int j = 0;
         
        Arrays.sort(nums1);
        Arrays.sort(nums2);
         
        List<Integer> result = new ArrayList<>();
         
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }
        }
		
		
		return listToArray(result);
		
	}

	private static int[] listToArray(List<Integer> result) {
		int array[] = new int[result.size()];
		for(int i=0; i<result.size(); i++) {
			array[i] = result.get(i);
		}
		return array;
	}

}
