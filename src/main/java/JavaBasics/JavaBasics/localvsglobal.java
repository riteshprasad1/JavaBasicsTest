package JavaBasics.JavaBasics;

public class localvsglobal {

	static int i = 10;
	String name = "Ritesh";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i = 20;
		localvsglobal obj = new localvsglobal();
		System.out.println(i);
		System.out.println(i);
		obj.Car();
		System.out.println(i);
		
	}

	public void Car()
	{
		int i =30;
		System.out.println(i);
	}
}
