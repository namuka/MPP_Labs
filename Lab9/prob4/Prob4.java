package prob4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob4 {
	public static void main(String[] args) {
		Prob4.printSquares(4);
	}
	
	public static void printSquares(int num) {
		Stream<Integer> intStream = Stream.iterate( 1, n->n +1).map(n->n*n).limit(num);		
		System.out.println(intStream.map(String::valueOf).collect(Collectors.joining(", ")));
		//intStream.forEach(s-> System.out.print(s+","));
	}
}
