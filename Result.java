package PracticeProblemInterview;

import java.util.Arrays;
import java.util.List;

public class Result {

	public static List<Integer> reverseArray(List<Integer> a) {
		int s = a.size();
        List<Integer> b = Arrays.asList(new Integer[s]);
        for(int i=0; i<a.size(); i++){
            b.set(i, s);
            s--;
        }
        return b;

	}

}
