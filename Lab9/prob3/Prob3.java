package prob3;

import java.util.Arrays;
import java.util.List;

public class Prob3 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Brian", "Nate", "Raju", "Neal", "Sara", "Nora");
		Prob3 ob = new Prob3();
		System.out.println("countWords(" + words + ", n, e, 5): " + ob.countWords(words, 'n', 'e', 5));
		System.out.println("countWords(" + words + ", a, r, 4): " + ob.countWords(words, 'a', 'r', 4));
		System.out.println("countWords(" + words + ", e, T, 4): " + ob.countWords(words, 'e', 'T', 4));
	}
	
	public int countWords(List<String> words, char c, char d, int len) {
		
		long count = words.stream()
				.filter(w -> w.length()==len)
				.filter(w -> w.toLowerCase().contains(Character.toString(c).toLowerCase()))
				.filter(w -> !w.toLowerCase().contains(Character.toString(d).toLowerCase()))
				.count();
		return Math.toIntExact(count);
	}
}