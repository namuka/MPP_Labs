package prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob2 {
	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(3,5,2,8,11);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		int maxVal = summary.getMax();		
		int minVal = summary.getMin();
		System.out.println("Max: " + maxVal + " Min: " + minVal);		
	}
}