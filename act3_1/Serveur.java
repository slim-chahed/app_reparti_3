package act3_1;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur extends Thread {
	public static void main(String[] args) {
		int ord = 0 ;

		// TODO Auto-generated method stub
		try {
			
		ServerSocket socketServeur = new ServerSocket(1234);
		System.out.println(" Le serveur attend la connexion d'un client ");
	     while(true){
		 Socket socket = socketServeur.accept();
		 System.out.println(" un client est connecte ");
		 ClientProcess client = new ClientProcess(socket, ++ord);
		 
		 client.start();
		 
 	     socket.close();
 	     	
	     }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
