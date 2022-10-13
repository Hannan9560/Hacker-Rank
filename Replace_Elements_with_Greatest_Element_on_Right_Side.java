package LeetCodeProblemSet;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
	public static void main(String[] args) {
		
		int[] arr = {17,18,5,4,6,1};
		
		replaceElements(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] replaceElements(int[] arr) {
		if(arr.length == 0) {
			return null;
		}
		
		for(int i=0; i<arr.length; i++) {
			int greatest = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > greatest) {
					greatest = arr[j];
				}
			}
			arr[i] = greatest;
		}
		
		arr[arr.length - 1] = -1;
		
		
		return arr;
		
	}

}
