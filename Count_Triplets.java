package PracticeProblemInterview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Count_Triplets {

	public static void main(String[] args) throws IOException {
        List<Long> arr = new ArrayList<Long>();
        arr.add((long) 1);
        arr.add((long) 2);
        arr.add((long) 2);
        arr.add((long) 4);
        
        System.out.println(countTriplets(arr, 2));
        
    }



	private static long countTriplets(List<Long> arr, long r) {
		Map<Long, Long> leftMap = new HashMap<>();
        Map<Long, Long> rightMap = new HashMap<>();
        
        for (long item: arr) {
        	rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
        }
        
        long count = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            long midTerm = arr.get(i);
            long c1 = 0, c2 = 0;
            
            rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);
            
            if(leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
            	c1 = leftMap.get(midTerm / r);
            }
            
            if(rightMap.containsKey(midTerm * r))
            	c2 = rightMap.get(midTerm * r);
            
            count += c1 * c2;
            
            leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0l)+1);
        }
        return count;
	}

}
