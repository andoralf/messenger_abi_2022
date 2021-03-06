package de.EKS.Jan.obs;

import java.util.List;

public class Server {
	private List<Client> connectetClients; 
	private List<Client> disconnectetClients; 
	
	private String myIP;
	private String myPort; 
	
	public Server(String myIP, String myPort) {
		this.myIP= myIP; 
		this.myPort = myPort; 
	}
	
	public void addConnection(Client client) {
		this.connectetClients.add(client);
	}
	public void removeConnection(Client client){
		if(!connectetClients.contains(client)) // TODO Real Check
			throw new NullPointerException("Dieser Client ist nicht Verbunden!");
		
		if(disconnectetClients.contains(client)){
			connectetClients.remove(client); 
			return; 
		}
		connectetClients.remove(client); 
		disconnectetClients.add(client);
	}
}
