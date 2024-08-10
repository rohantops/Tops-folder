package Assignment;
class InvalidAccountException extends Exception {

	InvalidAccountException(String msg)
	{
		System.out.println(msg);
	}
}
public class Q27_java {

	public static void main(String[] args) {
		try
		{
		   amount(2000);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void amount(int amount) throws InvalidAccountException
	{
		if(amount<2500)
		{
		 System.out.println("Sorry, insufficient balance, you need more 500 Rs.To perform\r\n"
		 		+ "this transaction.");	
		}
		else
		{
			System.out.println("Transcation is successfully");
		}

	}

}
