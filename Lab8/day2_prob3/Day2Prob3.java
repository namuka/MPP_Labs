import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Day2Prob3 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		
		/*Task a*/
		fruits.forEach(x->System.out.println(x));
		
		/*Task b*/
		Consumer<List<String>> cob = System.out::println;
		cob.accept(fruits);
	}
}
