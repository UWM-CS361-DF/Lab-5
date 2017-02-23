import java.util.*;

public class ATM {
	CardReader cr = new CardReader();
	Printer pt = new Printer();
	CashDispenser cash = new CashDispenser();
	Bank bank = new Bank();
	Account valid;
	static int pin;
	
	public void start(){
		System.out.println("Welcome use ATM!");
		System.out.print("Enter Account Number: ");
		int account = cr.acctNumber();
		valid = bank.validate(account);
		while(valid == null){
			System.out.println("Invalid Account!");
			System.out.println("Welcome use ATM!");
			System.out.print("Enter Account Number: ");
			account = cr.acctNumber();
			valid = bank.validate(account);
		}
		System.out.print("Enter PIN: ");
		Scanner stdIn = new Scanner(System.in);
		pin = stdIn.nextInt();
		if(valid.validate()){
			
		}
		stdIn.close();
	}
}
