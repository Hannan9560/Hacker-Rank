package PracticeProblemInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

public class Sherlock_and_Anagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			String s = in.next();
			System.out.println(sherlockAndAnagrams(s));
		}

	}

	private static int sherlockAndAnagrams(String str) {
		Map<String, Integer> keyCount = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j <= str.length(); j++) {
				String key = generateKey(str.substring(i, j));
				if(!keyCount.containsKey(key)) {
					keyCount.put(key, 0);
				}
				keyCount.put(key, keyCount.get(key) + 1);
			}
		}
		return keyCount.values().stream().mapToInt(count -> count * (count - 1) / 2).sum();
		
		
	}

	private static String generateKey(String str) {
		return str.chars().sorted().mapToObj(letter -> String.valueOf((char) letter)).collect(Collectors.joining());
	}

}
