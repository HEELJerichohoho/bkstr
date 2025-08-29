package bkstr;
import java.sql.*;


public class dbcon {

	private static final String url ="jdbc:mysql://localhost:3306/bkstr";
	private static final String user = "root";
	private static final String password ="";
	
	
public static Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	return DriverManager.getConnection(url,user,password);
} catch(SQLException | ClassNotFoundException e) {
	e.printStackTrace();
	return(null);
	
}	
}

public static PreparedStatement prepareStatement(Connection conn, String sql) {
	try {
		return conn.prepareStatement(sql);
		
	} catch(SQLException e){
		e.printStackTrace();
		return(null);

	}
}

public static boolean validatelogin(String username, String password) {
	String sql = "SELECT * FROM acc WHERE Acc_User = ? AND Acc_Pass =?";
	
	try (Connection conn = getConnection();
		PreparedStatement pst = conn.prepareStatement(sql)){
		pst.setString(1, username);
		pst.setString(2, password);
		
		try(ResultSet rs = pst.executeQuery()) {
			return rs.next();
		}
	}catch (SQLException e) {
		e.printStackTrace();
		return(false);
	}
	
}


}


