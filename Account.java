public class Account {
	int accountNumber;
	int pinCode;
	int balance;
	
	public Account(int acct, int pin, int bal){
		accountNumber = acct;
		pinCode = pin;
		balance = bal;
	}
	
	public boolean validate(){
		if(ATM.pin == pinCode) return true;
		else return false;
	}
}