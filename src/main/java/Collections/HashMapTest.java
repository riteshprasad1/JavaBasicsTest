package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
	}

}
