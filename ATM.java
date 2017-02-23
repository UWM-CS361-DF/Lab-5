import java.util.*;

public class ATM {
	CardReader cr = new CardReader();
	Printer pt = new Printer();
	CashDispenser cash = new CashDispenser();
	Bank bank = new Bank();
	Account valid;
	static int pin;
	Scanner stdIn = new Scanner(System.in);
	
	public void start(){
		do{
			int account = cr.acctNumber();
			valid = bank.validate(account);
		}while(valid == null);
		
		System.out.print("Enter PIN: ");
		for(int i = 2; i >= 0; i--){
			pin = stdIn.nextInt();
			if(valid.validate()){
				System.out.println("Choose Transaction");
				
			}
			else{
				System.out.println(i + " chances left");
				if(i == 0){
					System.out.println("Invalid input! Please try again!");
				}
			}
		}
		stdIn.close();
	}
}
