package prob10;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	private static final Function<String, Human> query3_v1 = Human::new;
	private static final BiFunction<String,Integer, Human> query3_v2 = Human::new;
	private static final TriFunction<String, Integer, String, Human> query3_v3 = Human::new;
	
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	List<Human> hList = Arrays.asList(list);
	System.out.println(hList);
	
    // Query 1  : Print only Female canditates names
	String query1 = hList.stream()
			.filter(h -> h.getGender().equals("Female"))
			.map(h -> h.getName())
			.collect(Collectors.joining(", "));	
	System.out.println("Query1: " + query1);

    // Query 2 : Create an object by choosing suitable Interface to the specified constructors(Totally 3 constructors)using fourth type of Method Reference ClassName::new. Then print the object status
	Human hOb1 = query3_v1.apply("Bob");	
	System.out.println("Query2 Human object1: " + hOb1);
	Human hOb2 = query3_v2.apply("Alan", 22);	
	System.out.println("Query2 Human object2: " + hOb2);
	Human hOb3 = query3_v3.apply("Sarah", 25, "Female");	
	System.out.println("Query2 Human object3: " + hOb3);
 
	// Query 3 : Count the male candidates whose age is more than 30
    long query3  = hList.stream()
    		.filter(h -> h.getGender().equals("Male"))
    		.filter(h -> h.getAge() > 30)
    		.count();
	System.out.println("Query3: " + query3);
    
   }



}
