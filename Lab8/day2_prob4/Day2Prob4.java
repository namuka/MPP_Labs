import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;

public class Day2Prob4 {
	public static void main(String[] args) {
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
	}
}
