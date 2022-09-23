package PracticeProblemInterview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		
		for(int i=0; i<p; i++) {
			String a = in.next();
			String b = in.next();
			
			System.out.println(twoStrings(a, b));
		}

	}

	private static String twoStrings(String a, String b) {
		
		Set<Character> aLetterSet = new HashSet<>();
		Set<Character> bLetterSet = new HashSet<>();
		
		for(int j=0; j<a.length(); j++) {
			aLetterSet.add(a.charAt(j));
		}
		
		for(int k=0; k<b.length(); k++) {
			bLetterSet.add(b.charAt(k));
		}
		
		aLetterSet.retainAll(bLetterSet);
		
		if(aLetterSet.size() > 0) {
			return "YES";
		}else {
			return "NO";
		}
	}

}
