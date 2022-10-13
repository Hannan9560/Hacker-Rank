package LeetCodeProblemSet;

public class Check_if_n_double {

	public static void main(String[] args) {
		
		int[] arr = {-20,8,-6,-14,0,-19,14,4};
		
		System.out.println(checkIfExist(arr));

	}
	public static boolean checkIfExist(int[] arr) {
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i == j)
                    continue;
                if(arr[i] == 2*arr[j]){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
