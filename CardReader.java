import java.util.*;
public class CardReader {
	static Scanner stdIn = new Scanner(System.in);

	public static int acctNumber(){
		System.out.print("Enter Account Number: ");
		int account = stdIn.nextInt();
		return account;
	}
}
