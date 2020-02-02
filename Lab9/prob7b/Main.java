package prob7b;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
	private static final TriFunction<List<Employee>, Integer, String, Stream<Employee>> filteredEmps = 
			(emps, s, c) -> emps.stream()
			.filter(p->p.getSalary() > s)
			.filter(p-> p.getLastName().compareTo(c) >=0);
			
	public List<String> listFilteredEmployees(List<Employee> employees, Integer salary, String letter ){
		return filteredEmps.apply(employees, salary, letter)
				.map(p-> p.getFirstName() + " " + p.getLastName())
		.sorted()
		.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		Main m = new Main();
		System.out.println(m.listFilteredEmployees(list, 100000, "M"));
	}

}
