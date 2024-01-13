package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name = new LinkedList<String>();
		name.add("Ritesh");
		name.add("Prasad");
		
		System.out.println(name);
		
			 Iterator<String> nameList	= name.iterator();
			 {
				 while(nameList.hasNext())
				 {
					 System.out.println(nameList.next());
				 }
			 }
			 
			 name.forEach((k)->System.out.println(k));
			 LinkedList<String> lang = new LinkedList<String>();
			 lang.add("Java");
			 lang.add("CPP");
			 lang.add("Python");
			 lang.add("JavaScript");
			 System.out.println(lang);
			 System.out.println(lang.size());
			 
			 //Reversing via for loop
			 for(int i=lang.size()-1;i>=0;i--)
			 {
				 System.out.println(lang.get(i));
			 }
			 System.out.println("Reversing via Iterator descending");
			 		Iterator<String> langList =lang.descendingIterator();
			 		{
			 			while(langList.hasNext())
			 			{
			 				System.out.println(langList.next());
			 			}
			 		}
	}

}
