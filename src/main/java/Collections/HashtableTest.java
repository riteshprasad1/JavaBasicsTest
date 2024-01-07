package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableTest {

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Ritesh");
		h1.put(2, "Prasad");
		h1.put(3, "Moshi");
		
		System.out.println(h1);
		
		System.out.println("****Print value using Enumeration****");
		Enumeration h2 =h1.elements();
		{
			System.out.println(h2);
			while(h2.hasMoreElements())
			{
				System.out.println(h2.nextElement());
			}
		}
		System.out.println("****Print value using EnterSet****");
			Set s1 = h1.entrySet();
			System.out.println(s1);
				Iterator it = s1.iterator();
				{
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
				}
				

	}

}
