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
				
				
				ArrayList<Integer> firstList = new ArrayList<Integer>();
			firstList.add(100);
			firstList.add(200);
			firstList.add(300);
			
			System.out.println(firstList);
			ArrayList<Integer> secondList = new ArrayList<Integer>();
			secondList.add(1100);
			secondList.add(2200);
			secondList.add(3300);
			System.out.println(secondList);
			firstList.addAll(secondList);
			System.out.println(firstList);	
				
				Iterator<Employee> it = al.iterator();
						{
							while(it.hasNext())
							{
								Employee emp = it.next();
								System.out.println(emp.age);
								System.out.println(emp.name);
							}
						}
						
						System.out.println("******Using java 8*****");
						al.forEach(employee -> {
							System.out.println(employee.age);
							System.out.println(employee.name);
						});
				
						
						System.out.println("******Using java 8 & Iterator*****");
						it = al.iterator();
						it.forEachRemaining(employee ->
						{
							System.out.println(employee.age);
							System.out.println(employee.name);
						});
						
						System.out.println("******ForEach*****");
						for(Employee s : al)
						{
							System.out.println(s.age);
							System.out.println(s.name);
						}
						
						System.out.println("******Using for loop and index****");
						for(int i=0;i<al.size();i++) {
							Employee e = al.get(i);
							System.out.println(e.age);
							System.out.println(e.name);
						}


	}

}
