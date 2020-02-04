package prob2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prob2_v2 {
	
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
		return list.stream().sorted((x,y) -> x.compareTo(y)).collect(Collectors.toList()).get(1);
	}
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		System.out.println("String test result: " + Prob2_v2.secondSmallest(list));
	}
	public static void test2() {
		List<Integer> list = Arrays.asList(5, 4, 9, 15, 11);
		System.out.println("Integer test result: " + Prob2_v2.secondSmallest(list));	
	}
	public static void test3() {
		List<Double> list = Arrays.asList(5.5, 4.0, 1.2, 15.0, 14.0);
		System.out.println("Double test result: " + Prob2_v2.secondSmallest(list));	
	}
	
	public static void main(String[] args) {
		Prob2_v2.test1();
		Prob2_v2.test2();
		Prob2_v2.test3();
	}
}
