package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(5);
		
		hs.forEach(show->System.out.println(show));
		
		//Union of 2 set
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,5,2,7,8,8}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {3,5,6,7,8,8}));
		
		Set<Integer> union = new HashSet<Integer>(first);
		System.out.println(union);
		union.addAll(second);
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>(first);
		System.out.println(intersection);
		intersection.retainAll(second);
		System.out.println(intersection);


	}

}
