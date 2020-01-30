import java.util.function.Supplier;

public class MethodRefExample3 {	
	private MySupplier ms = new MySupplier();
	class MySupplier {
		MySupplier(){
			Supplier<Double> sob = Math::random;
			System.out.println("Random number: " + sob.get());
		}
	}
	
	public static void main(String[] args) {			
		 new MethodRefExample3();	
	}
	
}
