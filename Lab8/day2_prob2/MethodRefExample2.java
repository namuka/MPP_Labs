import java.util.function.Supplier;

public class MethodRefExample2 {
	public static void main(String[] args) {
		Supplier<Double> sob = () -> Math.random();
		System.out.println("Random number using lambda: " + sob.get());
	}
}
