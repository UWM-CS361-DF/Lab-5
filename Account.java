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
		for(int i = 2; i >= 0; i --){
			if(ATM.pin == pinCode){
				return true;
			}
			else{
				System.out.print(i + "chances left");
			}
		}
		System.out.println("Invalid input! Please try again!");
		return false;
	}
}