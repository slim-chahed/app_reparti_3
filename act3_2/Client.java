package act3_2;

import java.io.*;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
	
		try {
			Socket socket = new Socket("localhost", 1215);
			System.out.println("Je suis connecté");
			OutputStream output = socket.getOutputStream();
		    ObjectOutputStream os = new ObjectOutputStream(output);
		    InputStream input = socket.getInputStream();
		    ObjectInputStream is = new ObjectInputStream(input);
		    Operation op = new Operation(40,20,'+');
		    //Scanner scanner = new Scanner(System.in);

		    //System.out.print("num 1 : ");
		    //int num1 = scanner.nextInt();

		    //System.out.print("num 2 : ");
		    //int num2 = scanner.nextInt();

		    //System.out.print("pick op  (+, -, *, /): ");
		    //char operator = scanner.next().charAt(0);

		    //Operation op = new Operation(num1, num2, operator);

		    os.writeObject(op);
		    

		     op = (Operation) is.readObject();

		     System.out.println(op.getRes());
				socket.close();



	       
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
	}

}
