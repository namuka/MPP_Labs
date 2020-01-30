package task_d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductInfo {
	static enum SortMethod {BYTITLE, BYPRICE};
	SortMethod method;
	
	public void mySort(List<Product> products, final SortMethod method) {
		Collections.sort(products, (p1,p2) ->
		{
			if(method == SortMethod.BYTITLE) {
				if(p1.title.compareTo(p2.title)==0) {
					if(p1.price == p2.price) return 0;
					else if(p1.price < p2.price) return -1;
					else return 1;
				}
				else return p1.title.compareTo(p2.title);
			} else {
				if(p1.price == p2.price) return 0;
				else if(p1.price < p2.price) return -1;
				else return 1;
			}
		});
	}
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", new Double(100000), 1));
		products.add(new Product("Laptop", new Double(50000), 2));
		products.add(new Product("Book", new Double(60000), 3));
		
		/* Task 'd' printing result */
		System.out.println("---------Task 'd'---------");
		System.out.println("By Price:");
		ProductInfo p = new ProductInfo();
		p.mySort(products, ProductInfo.SortMethod.BYPRICE);		
		System.out.println(products);
	
		System.out.println("\nBy Title and Price:");
		ProductInfo p2 = new ProductInfo();
		p2.mySort(products, ProductInfo.SortMethod.BYTITLE);
		System.out.println(products);
		
		
	}
}
