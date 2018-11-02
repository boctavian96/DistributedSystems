package lab3.bank;

import java.rmi.*;
import java.rmi.server.*;

public class Bank2Impl extends UnicastRemoteObject implements Bank2
{
	private int acctNum;
	private String surname;
	private String firstNames;
	private double balance;

	//Constructor for implementation objects...
	public Bank2Impl(int acctNo, String sname, String fnames, double bal) throws RemoteException{
		acctNum = acctNo; surname = sname;
		firstNames = fnames;
		balance = bal; 
	}

	public int getAcctNum() throws RemoteException { return acctNum; }
	public String getName() throws RemoteException {
		return (firstNames + " " + surname); }
	public double getBalance() throws RemoteException { return balance; }
	
	public double withdraw(double amount) throws RemoteException{
		if ((amount>0) && (amount<=balance)) return amount; else return 0; 
	}

	public void deposit(double amount) throws RemoteException
	{
		if(amount>0) {
			balance += amount;
		}
	}
}