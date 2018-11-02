package lab3.bank;

import java.rmi.*;
public class Bank2Client
{
	private static final String HOST = "localhost";
	private static final int[] acctNum = {111111,222222,234567,666666};
	public static void main(String[] args){

		try{
			//	Simply display all account details...
			for (int i=0; i<acctNum.length; i++){
				/* Obtain a reference to the object from the
				registry and typecast it into the appropriate type... */
				Bank2 temp =(Bank2)Naming.lookup("rmi://" + HOST + "/Account" + acctNum[i]);
				//Now invoke the methods of the interface to
				//display details of associated account...
				System.out.println("\nAccount number: " + temp.getAcctNum());
				System.out.println("Name: " + temp.getName());
				System.out.println("Balance: "+ temp.getBalance());
			}
		}
		catch(ConnectException conEx)
		{
			System.out.println( "Unable to connect to server!");
			System.exit(1);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.exit(1); 
		} 
	} 
}