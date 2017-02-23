import java.util.Scanner;

public class Account {
	int accountNumber;
	int pinCode;
	int balance;
	
	public Account(int acct, int pin, int bal){
		this.accountNumber = acct;
		this.pinCode = pin;
		this.balance = bal;
	}
	
	public boolean validate(){
		for(int i = 3; i > 0; i --){
			if(Bank.a.pinCode == pinCode){
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
