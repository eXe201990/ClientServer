package ro.oldtech.agenda.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ro.oldtech.agenda.server.bean.Utilizatori;

public class DbConnection {

	final String host = "localhost";
	final Integer port = 3306;
	final String user = "root";
	final String pass = "1234";
	final String db = "agenda";
	final String connectionSyntax = "jdbc:mariadb://" + host + ":" + port + "/" + db + "?user=" + user + "&password="
			+ pass;

	private static DbConnection singleton;

	Connection connection;

	private DbConnection() {
		try {
			makeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DbConnection getInstance() {
		if (singleton == null) {
			synchronized (DbConnection.class) {
				if (singleton == null) {
					singleton = new DbConnection();
				}
			}
		}
		return singleton;
	}

	private void makeConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		// Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(connectionSyntax);
	}

	public void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}

	public boolean isConnected() {
		return connection != null ? true : false;
	}

	public List<Utilizatori> arataTotiUtilizatori() throws SQLException {
		List<Utilizatori> listaUtilizatori = new ArrayList<Utilizatori>();

		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("select * from utilizatori");

		while (rs.next()) {
			System.out.println(rs.getInt("id") + " - " + rs.getString("username"));
		}

		rs.close();
		stmt.close();

		// DatabaseMetaData dbmd = connection.getMetaData();

		return listaUtilizatori;
	}

}
