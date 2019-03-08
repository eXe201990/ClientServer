package ro.oldtech.agenda.server.test;

import java.sql.SQLException;

import ro.oldtech.agenda.server.DbConnection;
import ro.oldtech.agenda.server.ServerSocketAgenda;

public class TestMain {

	public static void main(String[] args) {

		DbConnection dbConnection = DbConnection.getInstance();

		System.out.println("conectat la baza de date " + dbConnection.isConnected());

		try {
			dbConnection.arataTotiUtilizatori();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (dbConnection.isConnected()) {
			try {
				dbConnection.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		ServerSocketAgenda serverSkt = new ServerSocketAgenda();
		serverSkt.start();

	}
}
