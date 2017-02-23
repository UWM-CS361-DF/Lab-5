import java.util.*;
public class Bank {
	static List<Account> accounts;
	public Bank(){
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1234, 6789, 80));
		accounts.add(new Account(6789, 4321, 60));
	}
	Account acct;
	public Account validate(int account) throws Exception{
		int i = 0;
		while(acct.accountNumber != account){
			i++;
			acct = accounts.get(i);
			if(i >= accounts.size())
				throw new Exception("Error");
		}
		return acct;
	}
}
