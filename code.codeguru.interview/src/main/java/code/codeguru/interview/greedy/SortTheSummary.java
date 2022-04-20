package code.codeguru.interview.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheSummary {

    public int[][] sortTheSummary(int inputArray[]) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] unique = Arrays.stream(inputArray).distinct().toArray();

//		for (int i = 0; i < unique.length; i++) {
//			
//			map.put(Collections.frequency(inputArray, unique[i]), null)
//		}

        Map<Integer, Long> freq = Arrays.stream(inputArray).boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        int output[][] = new int[freq.size()][2];

        int index = 0;
//		for(Entry entry : freq.entrySet()) {
//			
//			output[index][2] = 
//		}

        return null;
    }
}
