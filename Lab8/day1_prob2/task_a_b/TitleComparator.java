package task_a_b;
import java.util.Comparator;

/* Task 'b' */
public class TitleComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
