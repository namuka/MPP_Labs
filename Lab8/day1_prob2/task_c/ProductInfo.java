package task_c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductInfo {
	static enum SortMethod {BYTITLE, BYPRICE};
	SortMethod method;
	
	public void mySort(List<Product> products, final SortMethod method) {
		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				if(method == SortMethod.BYTITLE) {
					return p1.title.compareTo(p2.title);
				} else {
					if(p1.price == p2.price) return 0;
					else if(p1.price < p2.price) return -1;
					else return 1;
				}
			}
		}
		Collections.sort(products, new ProductComparator());
	}
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", new Double(100000), 1));
		products.add(new Product("Book", new Double(50000), 2));
		products.add(new Product("Apple", new Double(60000), 3));
		
		/* Task 'c' printing result */
		System.out.println("---------Task 'c'---------");
		System.out.println("By Price:");
		ProductInfo p = new ProductInfo();
		p.mySort(products, ProductInfo.SortMethod.BYPRICE);		
		System.out.println(products);
	
		System.out.println("\nBy Title:");
		ProductInfo p2 = new ProductInfo();
		p2.mySort(products, ProductInfo.SortMethod.BYTITLE);
		System.out.println(products);
		
		
	}
}
