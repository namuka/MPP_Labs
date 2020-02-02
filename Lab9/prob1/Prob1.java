package prob1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prob1 {
	public static void reverse(List<?> list) {
		System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(",")));	
	}
	public static void main(String[] args) {
		Prob1.reverse(Arrays.asList("Bill","Thomas","Mary"));
	}
}
