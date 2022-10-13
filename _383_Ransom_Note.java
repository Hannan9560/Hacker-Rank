package LeetCodeProblemSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _383_Ransom_Note {

	public static void main(String[] args) {
		
		System.out.println(canConstruct("aa", "ab"));

	}

	private static boolean canConstruct(String ransomNote, String magazine) {
//		char[] ch1 = new char[ransomNote.length()];
//        char[] ch2 = new char[magazine.length()];
        ArrayList<Character> ch1 = new ArrayList<>();
        ArrayList<Character> ch2 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < ransomNote.length(); i++){
            ch1.add(ransomNote.charAt(i));
        }
        
        for (int i = 0; i < magazine.length(); i++){
            ch2.add(magazine.charAt(i));
        }
           
        for (int i = 0; i < ch1.size(); i++){
        	for(int j=0; j<ch2.size(); j++) {
        		if(ch1.get(i) == ch2.get(j)) {
        			count++;
                    ch2.remove(j);
                    break;
                }
        	}  
        }
        if(count == ransomNote.length()) {
        	return true;
        }
        
        return false;
	}

}
