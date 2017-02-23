import java.util.*;

public class ATM {

	public void start(){
		int account = CardReader.acctNumber();
		Bank bank = new Bank();
		Account validate = bank.validate(account);
		
			
			

	}
}
