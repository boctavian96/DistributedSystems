package lab3.bank;

import java.rmi.*;
public class Bank2Server
{
	private static final String HOST = "localhost";
	public static void main(String[] args) throws Exception
	{
		//Create array of initialised implementation
		//objects...
		Bank2Impl[] account ={new Bank2Impl(111111,"Smith", "Fred James",112.58),
				new Bank2Impl(222222,"Jones","Sally",507.85),
				new Bank2Impl(234567,"White", "Mary Jane",2345.00),
				new Bank2Impl(666666,"Satan", "Beelzebub",666.00)};
		
		for (int i=0; i<account.length; i++)
		{
			int acctNum = account[i].getAcctNum();
			/* Generate each account name (as a concatenation of 'Account' and the
				account number) and bind it to the appropriate object reference in the
			array... */
			Naming.rebind("rmi://" + HOST + "/Account" + acctNum, account[i]);
		}
		System.out.println("Binding complete...\n");
	}
}