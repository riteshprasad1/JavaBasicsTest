package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public void Vector2d()
	{
		Vector<String> langVector = new Vector<String>();
		langVector.add("Java");
		langVector.add("C++");
		langVector.add("Javascript");
		
		Vector osVector = new Vector();
		osVector.add(langVector);
		
		//System.out.println(osVector);
		
		//osVector.forEach(list->System.out.println(list));
		
		System.out.println(osVector.size());
		
		for(int i=0;i<langVector.size();i++)
		{
		String str = (String) ((Vector) osVector.get(0)).get(i);
		System.out.println(str);
		}
		
	}
	public static void main(String[] args) {
		
		VectorTest vt = new  VectorTest();
		vt.Vector2d();
		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(100);
		myVector.add(100);
		myVector.add(200);
		myVector.add(300);
		myVector.add(49);
		
		System.out.println(myVector);
		myVector.remove(1);
		System.out.println(myVector);
		
		myVector.forEach(value ->System.out.println(value));
		
				Iterator<Integer> ll=myVector.iterator();
				{
					while(ll.hasNext())
					{
						System.out.println(ll.next());
					}
				}
				Collections.sort(myVector);
				System.out.println(myVector);
				
	}

}
