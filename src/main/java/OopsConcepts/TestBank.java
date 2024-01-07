package OopsConcepts;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrazilBankInterface h1 = new HSBCBankClass();
		h1.credit();
		h1.mutualFund();
		System.out.println(USBankInterface.min_bal);
	}

}
