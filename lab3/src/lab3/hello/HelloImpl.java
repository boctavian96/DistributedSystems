package lab3.hello;

import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloImpl() throws RemoteException{
		//No action needed here.
	}
	
	public String getGreeting() throws RemoteException{ 
		return ("Hello there!"); 
	}
}
