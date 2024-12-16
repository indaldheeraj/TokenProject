package tokensystem;

public class Customer {
	void taketoken() {
		Money m = new Money();
		Cashier c = new Cashier();
		Token T = c.issueToken(m);
		System.out.println("Token taken");
	}

}
