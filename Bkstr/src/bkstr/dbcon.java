package bkstr;
import java.security.MessageDigest;
import java.sql.*;
import java.security.*;


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
	String sqllogin1 = "SELECT * FROM acc WHERE Acc_User = ? AND Acc_Pass =?";
	
	try (Connection conn = getConnection();
		PreparedStatement pst = conn.prepareStatement(sqllogin1)){
		pst.setString(1, username);
		 pst.setString(2, hashPassword(password));
		
		try(ResultSet rs = pst.executeQuery()) {
			return rs.next();
		}
	}catch (SQLException e) {
		e.printStackTrace();
		return(false);
	}
	
}

public static boolean userexist(String username) {
	String sqllogin2 = "SELECT 1 FROM acc WHERE Acc_User = ?";
	
	try (Connection conn = getConnection();
		PreparedStatement pst2 = conn.prepareStatement(sqllogin2)){
		pst2.setString(1, username);
		try(ResultSet rs = pst2.executeQuery()) {
			return rs.next();
		}
	}catch (SQLException e) {
		e.printStackTrace();
		return(false);
	}
	
}

public static boolean registration (String user, String pass, String num, String role) {
	if(userexist(user)){
		System.out.println("Username already exists.");
        return false;
	}

	String sqlregis = "INSERT INTO acc (Acc_User, Acc_Pass, Acc_Cntc, Acc_Type) VALUES (?,?,?,?)";
	String hashedPass = hashPassword(pass);
	try (Connection conn = getConnection();
		PreparedStatement  pst3 = conn.prepareStatement(sqlregis)){
		
		pst3.setString(1, user);
		pst3.setString(2, hashedPass);
		pst3.setString(3, num);
		pst3.setString(4, role);
		
		int rows = pst3.executeUpdate();
		return rows > 0;
	} catch (SQLException e) {
		e.printStackTrace();
		return(false);
	}
}


public static String hashPassword(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
        byte[] hashBytes = md.digest(password.getBytes());

        // Convert bytes to hex
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();

    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return null;
    }
}




}


