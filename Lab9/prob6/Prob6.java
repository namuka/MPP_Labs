package prob6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Prob6 {
	public static void main(String[] args) {
		Prob6 ob= new Prob6();		
		Set<String> unionSet = ob.union(Prob6.nextListSet());
		System.out.println(unionSet.toString());		
	}
	
	public Set<String> union(List<Set<String>> sets){		
		//sets.stream().flatMap(s->s.stream()).forEach(s->System.out.println(s));
		Set<String> mySet = sets.stream().flatMap(Collection::stream).collect(Collectors.toSet());		
		//Set<String> mySet = sets.stream().flatMap(s->s.stream()).collect(Collectors.toSet());	
		return mySet;
	}
	
	private static List<Set<String>> nextListSet(){
		List<Set<String>> myListSet = new ArrayList<Set<String>>();
		
		Set<String> mySet1 = new HashSet<>();
		mySet1.add("A");
		mySet1.add("B");
		myListSet.add(mySet1);
		Set<String> mySet2 = new HashSet<>();
		mySet2.add("D");
		myListSet.add(mySet2);
		Set<String> mySet3 = new HashSet<>();
		mySet3.add("1");
		mySet3.add("3");
		mySet3.add("5");	
		myListSet.add(mySet3);
		
		return myListSet;
	}
}
