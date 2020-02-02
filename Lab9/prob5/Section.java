package prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		// Implement the code
		Stream<String> subStream = stream.skip(m).limit((n-m)+1);
		return subStream;
	}
	public static void main(String[] args) {
		 // Make three calls for the streamSection() method with different inputs
		 // use nextStream() method to supply the Stream input as a first argument in streamSection() method
		Stream<String> stream1 = Section.nextStream();
		Stream<String> subStream1 = Section.streamSection(stream1, 0, 3);
		System.out.println("Result (m=0, n=3): " + subStream1.map(String::valueOf).collect(Collectors.joining(", ")));		
		
		Stream<String> stream2 = Section.nextStream();
		Stream<String> subStream2 = Section.streamSection(stream2, 2, 6);
		System.out.println("Result (m=2, n=6): " + subStream2.map(String::valueOf).collect(Collectors.joining(", ")));
		
		Stream<String> stream3 = Section.nextStream();
		Stream<String> subStream3 = Section.streamSection(stream3, 5, 8);
		System.out.println("Result (m=5, n=3): " + subStream3.map(String::valueOf).collect(Collectors.joining(", ")));
		
	 }
	//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}