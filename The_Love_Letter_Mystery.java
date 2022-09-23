package PracticeProblemInterview;

public class The_Love_Letter_Mystery {

	public static void main(String[] args) {
		String s = "abc";
		String n_s = "";
		int v = s.charAt(0);
		n_s += (char)(v+1);
		System.out.println(n_s);
		System.out.println(v);
		System.out.println(checkPalindrome(s));
		

	}

	private static int checkPalindrome(String s) {
		String new_s = "";
		int t = 0;
		
		if(isPalindrome(s)) {
			t = 0;
		}else {
			
		}
		
		
		return t;
	}

	private static boolean isPalindrome(String s) {
		String reverseStr = "";
		boolean status = false;
		for(int i = (s.length()-1); i>=0; --i) {
			reverseStr = reverseStr + s.charAt(i);
		}
		
		if(s.equals(reverseStr)) {
			status = true;
		} else {
			status = false;
		}
		
		
		
		return status;
	}

}
