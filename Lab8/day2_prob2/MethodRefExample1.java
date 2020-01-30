import java.util.function.Supplier;

public class MethodRefExample1 {
	public static void main(String[] args) {
		Supplier<Double> sob = Math::random;
		System.out.println("Random number using method reference: " + sob.get());
	}
}
