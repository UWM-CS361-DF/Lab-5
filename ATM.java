import java.util.*;

public class ATM {
	CardReader cr = new CardReader();
	Printer pt = new Printer();
	CashDispenser cash = new CashDispenser();
	Bank bank = new Bank();
	int valid;
	static int pin;
	int bal;
	Account acct = new Account(valid, pin, bal); 
	
	public void start() throws Exception{
		int account = cr.acctNumber();
		valid = bank.validate(account);
		System.out.println("Enter PIN: ");
		Scanner stdIn = new Scanner(System.in);
		pin = stdIn.nextInt();
		if(acct.validate()){
			
		}
	}

}
