package act3_1;

import java.io.IOException;
import java.net.Socket;

public class ClientProcess extends Thread {
	Socket socket;
    int ord = 0;
	public ClientProcess(Socket socket , int ord){
	super();
	this.socket = socket;
	this.ord = ord;
	}
	
	
	public void run() {
	System.out.println("Le client est connecte "+socket.getRemoteSocketAddress()+" et son ordre "+ord);
	try {
	
	socket.close();
	}
	catch (IOException e)
	{e.printStackTrace();}
	}
	

}
