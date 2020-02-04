package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static <T> boolean  contains1(List<T> list, T s) {
		for(T x: list) {
			if(x==null && s==null) return true;
			if(s==null || x==null) continue;
			if(x.equals(s)) return true;
		}
		return false;
	}
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println("String test result: " + result);
	}
	public static void test2() {
		List<Employee> list = Arrays.asList(
				new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000),
		        new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));
		Employee emp1 = new Employee("Joe", "Davis", 120000);		
		boolean result = Main.contains1(list, emp1);
		System.out.println("Employee test result: " + result);		
	}
	public static void main(String[] args) {
		Main.test1();
		Main.test2();
	}
}
