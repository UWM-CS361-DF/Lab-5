import java.util.Scanner;

public class Account {
	int accountNumber;
	int pinCode;
	int balance;
	
	public Account(int acct, int pin, int bal){
		accountNumber=acct;
		pinCode=pin;
		balance=bal;
	}
	
	public boolean validate(){
		int tries=0;
		int pinNum;
		Account a = ;
		do{
			System.out.print("Enter PIN: "); 
			Scanner stdIn = new Scanner(System.in);
			pinNum = stdIn.nextInt();
			tries++;
		}while(pinNum!=a.pinCode&&tries!=3);
		if(tries==3&&pinNum!=a.pinCode){
			System.out.print("Invalid PIN");
			System.out.println('\n');
			return false;
		}
		return true;
	}
}