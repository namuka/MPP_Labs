package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group<T> {
	private static final int ArrayList = 0;
	private T specialElement;
	private List<T> elements = new ArrayList<>();
	public Group(T special, List<T> elements) {
		this.specialElement = special;
		this.elements = elements;
	}
	public T getSpecialElement() {
		return specialElement;
	}
	public List<T> getElements(){
		return elements;
	}
	public String toString() {
		return "special: " + this.specialElement + ", elements: " + elements;
	}
	public static Group<?> copy(Group<?> group){
		return copyHelper(group);
	} 
	private static <T> Group<T> copyHelper(Group<T> group){
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}
	
	public static void main(String[] args) {
		List<Group<?>> groups = Arrays.asList(
				new Group(1, Arrays.asList(1,2,3,4)),
				new Group(8, Arrays.asList(4,8,5,6)),
				new Group("Java", Arrays.asList("C++","C#", "Java","Kotlin"))
         );
		
		List<Group<?>> groupCopies = new ArrayList<>();
		for(Group<?> g: groups) {
			groupCopies.add(Group.copy(g));
		}		
		System.out.println(groupCopies);	
	}

}
