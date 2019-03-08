package ro.oldtech.agenda.server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerSocketAgenda implements Runnable {

	private Integer port = 8989;
	private Socket socket = null;
	private ServerSocket serverSktAg = null;
	private Thread thread = null;
	private DataInputStream streamIn = null;

	public ServerSocketAgenda() {
		// TODO Auto-generated constructor stub
		System.out.println("Binding to port " + port + ", please wait  ...");
		try {
			serverSktAg = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			socket = serverSktAg.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("Client accepted: " + socket);
		start();
	}

	public void start() {

	

		System.out.println("Server started ... socket agenda ");
		System.out.println("Waiting for a client agenda to connect... ");

		openStream();
		
		thread = new Thread(this);
		thread.start();
	}

	public void openStream() {
		try {
			streamIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {

		if (streamIn != null)
			try {
				streamIn.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		if (socket != null)
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		if (serverSktAg != null)
			try {
				serverSktAg.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public void stop() {
		if (thread != null || thread.isAlive()) {
			synchronized (this) {
				thread.notifyAll();
				try {
					thread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		close();
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				// System.out.println(new Date() + " thread");

				if (streamIn != null) {

					try {
						// String line = streamIn.readUTF();
						String line = streamIn.readUTF();
						System.out.println(line);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
					}

				}
				// try {
				// TimeUnit.SECONDS.sleep(2);
				// } catch (InterruptedException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }

			}
		}

	}

}
