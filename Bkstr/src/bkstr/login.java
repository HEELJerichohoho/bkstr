package bkstr;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
	private JTextField txtuser;
	private JPasswordField txtpass;
	public login() {
		setTitle("Welcome to the Bookstore!");
		getContentPane().setLayout(null);
		
		JPanel bgpanel = new JPanel();
		bgpanel.setBounds(0, 0, 369, 357);
		bgpanel.setLayout(null);
		getContentPane().add(bgpanel);
		
		
		JLabel bg = new JLabel();
		bg.setBounds(0, 0, 369, 357);
		
		ImageIcon bckgrnd = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\Liblib\\bs.jpg");
		Image img = bckgrnd.getImage();
		Image scaledImg = img.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
		bg.setIcon(new ImageIcon(scaledImg));
		bgpanel.add(bg);
		
		JPanel logpanel = new JPanel();
		logpanel.setBackground(new Color(139, 69, 19));
		logpanel.setBounds(370, 0, 352, 357);
		getContentPane().add(logpanel);
		logpanel.setLayout(null);
		
		txtuser = new JTextField();
		txtuser.setBounds(110, 109, 192, 29);
		logpanel.add(txtuser);
		txtuser.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(110, 159, 192, 29);
		logpanel.add(txtpass);
		
		JLabel lblforgotpass = new JLabel("Forgot Password?");
		lblforgotpass.setForeground(Color.WHITE);
		lblforgotpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblforgotpass.setBounds(158, 184, 105, 23);
		lblforgotpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logpanel.add(lblforgotpass);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setForeground(new Color(139, 69, 19));
		btnlogin.setBackground(Color.WHITE);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlogin.setBounds(110, 211, 192, 29);
		btnlogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logpanel.add(btnlogin);
		
		JLabel lblsignup = new JLabel("Sign Up");
		lblsignup.setForeground(Color.WHITE);
		lblsignup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblsignup.setBounds(183, 237, 49, 29);
		lblsignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logpanel.add(lblsignup);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setVerticalAlignment(SwingConstants.TOP);
		lblusername.setForeground(Color.WHITE);
		lblusername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblusername.setBounds(42, 115, 62, 23);
		logpanel.add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setVerticalAlignment(SwingConstants.TOP);
		lblpassword.setForeground(Color.WHITE);
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblpassword.setBounds(42, 165, 62, 23);
		logpanel.add(lblpassword);
		
		
		setSize(739, 389);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
