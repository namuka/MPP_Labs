package task_a_b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {BYTITLE, BYPRICE};
	SortMethod method;
	
	public ProductInfo(SortMethod method) {
		this.method = method;
	}
	public void mySort(List<Product> products) {
		if(method == SortMethod.BYTITLE) {
			Collections.sort(products, new TitleComparator());
		}
		else if(method == SortMethod.BYPRICE) {
			Collections.sort(products, new PriceComparator());
		}
	}
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", new Double(100000), 1));
		products.add(new Product("Book", new Double(50000), 2));
		products.add(new Product("Apple", new Double(60000), 3));
		
		/* Task 'a' printing result */
		System.out.println("Task 'a' - Sort by Price:");
		ProductInfo p1 = new ProductInfo(SortMethod.BYPRICE);
		//Collections.sort(products, new PriceComparator());
		p1.mySort(products);		
		System.out.println(products);
		
		/* Task 'b' printing result */
		System.out.println("\nTask 'b' - Sort by Title:");
		//Collections.sort(products, new TitleComparator());
		ProductInfo p2 = new ProductInfo(SortMethod.BYTITLE);
		p2.mySort(products);
		System.out.println(products);
		
		
	}
}
