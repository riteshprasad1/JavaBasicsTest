package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	// How to store specific user defined in arrayList 
	public static void main(String arg[])
	{
						Employee e1 = new Employee(1, "Ritesh");
				Employee e2 = new Employee(2, "Prasad");
				
				ArrayList<Employee> al = new ArrayList<Employee>();
				al.add(e1);
				al.add(e2);
				
				Iterator<Employee> it = al.iterator();
						{
							while(it.hasNext())
							{
								Employee emp = it.next();
								System.out.println(emp.age);
								System.out.println(emp.name);
							}
						}
				
				
			


	}

}
