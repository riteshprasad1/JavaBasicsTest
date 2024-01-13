package Collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
	
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "Ritesh");
		map.put(500, "Prasad");
		map.put(300, "Tom");
		map.put(2000, "Lisa");
		
		System.out.println(map); //it will display in ascending order of Key
				for(Entry ll : map.entrySet())
				{
					System.out.println(ll.getKey() +" "+ ll.getValue());
				}
				System.out.println("***itrating via iterator****");
				Iterator ii = map.entrySet().iterator();
				{
					while(ii.hasNext())
					{
						System.out.println(ii.next());
					}
				}
				map.forEach((k,v) ->System.out.println("Key "+k+"Value"+v)); //for each method with lambda
				
				System.out.println(map.lastKey());
				System.out.println(map.firstKey());
				Set<Integer> keyLessthen500 = map.headMap(500).keySet(); //Less the value Headmap() method 
				System.out.println(keyLessthen500);
				
				Set<Integer> GrLessthen500 = map.tailMap(500).keySet(); //Gr the value Headmap() method 
				System.out.println(GrLessthen500);
	}

}
