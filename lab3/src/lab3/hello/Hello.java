package lab3.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
	public String getGreeting() throws RemoteException;
}
