package prob3;

public class Employee {
	String firstName, lastName;
	

	int salary;
	public Employee(String f, String l, int s) {
		this.firstName = f;
		this.lastName = l;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("first name: ");
		sb.append(firstName);
		sb.append(" last name: ");
		sb.append(lastName);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj.getClass()!=this.getClass()) return false;
		Employee e = (Employee) obj;
		return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.salary==e.salary;
	}
}

