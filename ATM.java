import java.util.*;

public class ATM {

	public void start() throws Exception{
		int account = CardReader.acctNumber();
		Bank bank = new Bank();
		Account valid = bank.validate(account);
		if(valid.validate()){
			
		}
	}
}
