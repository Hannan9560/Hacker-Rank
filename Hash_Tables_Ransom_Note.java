package PracticeProblemInterview;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Tables_Ransom_Note {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for(int magazine_i=0; magazine_i < m; magazine_i++){
		            magazine[magazine_i] = in.next();
		        }
		String ransom[] = new String[n];
		for(int ransom_i=0; ransom_i < n; ransom_i++){
		            ransom[ransom_i] = in.next();
		        }
		
		checkMagazine(magazine, ransom);
		

	}

	public static void checkMagazine(String[] magazine, String[] ransom) {
	    HashMap<String, Integer> usableWords = makeMap(magazine);
	    for (int i = 0; i < ransom.length; i++) {
	        if (usableWords.containsKey(ransom[i]) && usableWords.get(ransom[i]) > 0) {
	            usableWords.merge(ransom[i], -1, Integer::sum); // uses the word
	        } else {
	            System.out.println("No");
	            return;
	        }
	    }
	    System.out.println("Yes");
	}

	
	private static HashMap<String, Integer> makeMap(String[] words) {
	    HashMap<String, Integer> map = new HashMap();
	    for (int i = 0; i < words.length; i++) {
	        map.merge(words[i], 1, Integer::sum);
	    }
	    return map;
	}

}
