import java.util.*;
public class Bank {
	static List<Account> accounts;
	public Bank(){
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1234, 6789, 80));
		accounts.add(new Account(6789, 4321, 60));
	}
	static Account a;
	public int validate(int account) throws Exception{
		int i = 0;
		this.a = accounts.get(i);
		while(a.accountNumber != account){
			i++;
			this.a = accounts.get(i);
			if(i >= accounts.size())
				throw new Exception("Error");
		}
		return a.accountNumber;
	}
}
