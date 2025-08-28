package bkstr;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
	private JTextField txtuser;
	private JPasswordField txtpass;
	public login() {
		getContentPane().setLayout(null);
		
		JPanel bgpanel = new JPanel();
		bgpanel.setBounds(0, 0, 369, 396);
		getContentPane().add(bgpanel);
		
		JPanel logpanel = new JPanel();
		logpanel.setBounds(366, 0, 373, 396);
		getContentPane().add(logpanel);
		logpanel.setLayout(null);
		
		txtuser = new JTextField();
		txtuser.setBounds(110, 132, 192, 29);
		logpanel.add(txtuser);
		txtuser.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(110, 183, 192, 29);
		logpanel.add(txtpass);
		
		JLabel lblforgotpass = new JLabel("Forgot Password?");
		lblforgotpass.setForeground(Color.BLUE);
		lblforgotpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblforgotpass.setBounds(160, 212, 105, 23);
		logpanel.add(lblforgotpass);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlogin.setBounds(110, 247, 192, 29);
		logpanel.add(btnlogin);
		
		JLabel lblsignup = new JLabel("Sign Up");
		lblsignup.setForeground(Color.BLUE);
		lblsignup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblsignup.setBounds(181, 280, 49, 29);
		logpanel.add(lblsignup);
	}
}
