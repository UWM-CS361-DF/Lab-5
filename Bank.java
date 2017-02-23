import java.util.*;
public class Bank {
	static List<Account> accounts;
	public Bank(){
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1234, 6789, 80));
		accounts.add(new Account(6789, 4321, 60));
	}
	Account acct;
	public Account validate(int account){
		for(int i = 0; i < accounts.size(); i ++){
			acct = accounts.get(i);
			if(acct.accountNumber == account){
				return acct;
			}
		}
		return null;
	}
}
