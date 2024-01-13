package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

	public void ConvertHashMaptoArrayList()
	{
		HashMap<String, Integer> comp = new HashMap<String, Integer>();
		comp.put("Google",1000);
		comp.put("Amazon",2000);
		comp.put("Walmart",3000);
		
		for(Entry<String,Integer> e : comp.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
			Iterator it = comp.entrySet().iterator();
			{
				while(it.hasNext())
				{
					Map.Entry pairs =(Map.Entry) it.next();
					System.out.println(pairs.getKey() + " "+pairs.getValue());
				}
			}
			System.out.println("*******Converting hashmap key to Arraylist******");
			List<String> key = new ArrayList<String>(comp.keySet());
			System.out.println(key);
			System.out.println("*******Converting hashmap value to Arraylist******");
			List<Integer> value = new ArrayList<Integer>(comp.values());
			System.out.println(value);
	}
		
			
	
	public void Study()
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ritesh");
		hm.put(2, "Prasad");
		
		System.out.println(hm);
		for( Entry e :  hm.entrySet())
		{
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
		
		Employee e1 = new Employee(11, "ABCD");
		Employee e2 = new Employee(21, "XYZ");
		
		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		
		hm1.put(1, e1);
		hm1.put(2,e2);
		
		System.out.println(hm1);
		
		for(Entry<Integer, Employee> ee : hm1.entrySet())
		{
			int i = ee.getKey();
			Employee eee = ee.getValue();
			System.out.println(eee.name+ " "+ eee.age);
		}
		
		System.out.println("********SynchronizedHashmap******");
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "Ritesh");
		map1.put("2", "Prasad");
		
		Map<String,String> map2 = Collections.synchronizedMap(map1);
		System.out.println(map2);
		
		System.out.println("***********ConcurrentHashMap******");
		
		ConcurrentHashMap<String, String> map3 = new ConcurrentHashMap<String, String>();
		map3.put("3", "Moshi");
		map3.put("4", "Bhosari");
		
		for(Entry<String, String> it :map3.entrySet())
		{
			System.out.println(it.getKey()+" "+it.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapTest convert = new HashMapTest();
		convert.ConvertHashMaptoArrayList();
			
	}

}
