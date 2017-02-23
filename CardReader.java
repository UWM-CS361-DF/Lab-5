import java.util.*;
public class CardReader{
	static Scanner stdIn = new Scanner(System.in);

	public int acctNumber(){
		System.out.println("Welcome use ATM!");
		System.out.print("Enter Account Number: ");
		int account = stdIn.nextInt();
		return account;
	}
}
