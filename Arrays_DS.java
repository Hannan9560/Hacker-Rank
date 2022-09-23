package PracticeProblemInterview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Arrays_DS {

	public static void main(String[] args) throws IOException {
       

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1);

        List<Integer> res = Result.reverseArray(arr);


    }

}
