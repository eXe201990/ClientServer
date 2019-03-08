package ro.oldtech.agenda.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocketAgenda {

	private Socket socket = null;
	private DataInputStream console = null;
	private DataOutputStream streamOut = null;
	private String serverHost = "192.168.0.117";
	private Integer serverPort = 8989;

	public ClientSocketAgenda() {
		// TODO Auto-generated constructor stub
		try {
			socket = new Socket(serverHost, serverPort);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void stop() {
		try {
			if (socket != null)
				socket.close();
		} catch (IOException ioe) {
			System.out.println("Error closing ...");
		}
	}

}
