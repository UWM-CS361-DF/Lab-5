import java.util.*;
public class Bank {
	static List<Account> accounts;
	public int account;
	public Bank(){
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1234, 6789, 80));
		accounts.add(new Account(6789, 4321, 60));
	}
	
	public Account validate(int account) throws Exception{
		int i = 0;
		while(accounts.get(i).accountNumber != account){
			i++;
			if(i >= accounts.size())
				throw new Exception("Error");
		}
		return accounts.get(i);
	}
}
