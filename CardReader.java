import java.util.*;
public class CardReader{
	static Scanner stdIn = new Scanner(System.in);

	public int acctNumber(){
		int account = stdIn.nextInt();
		return account;
	}
}
