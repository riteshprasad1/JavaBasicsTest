package JavaBasics.JavaBasics;

public class codingTest {
	
	public void StringTest()
	{
		String s = "321004433332";
		int temp = 0; 
	
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='0') {
				temp++;
				
			}
			
		}
		System.out.println("Zero is present"+temp );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		codingTest ct = new codingTest();
		ct.StringTest();
	}

}
