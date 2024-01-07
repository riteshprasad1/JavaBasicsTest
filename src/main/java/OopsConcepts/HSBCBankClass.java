package OopsConcepts;

public  class HSBCBankClass implements USBankInterface,BrazilBankInterface {

	public void credit() {
		System.out.println("HSBC credit");
		System.out.println(USBankInterface.min_bal);
		
	}

	public void debit() {
		System.out.println("HSBC debit");
		
	}
	
	public void recurring() {
		System.out.println("HSBC recurring");
	}

	public void mutualFund() {
		System.out.println("Brazil mutual fund");
		
	}

	
}
