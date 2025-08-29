package bkstr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {
	private JTextField txtuser;
	private JPasswordField txtpass;
	String placeholder = "Enter Your Username";
	String passplaceholder = "Enter Your Password";

	public login() {
		setTitle("Welcome to the Bookstore!");
		getContentPane().setLayout(null);

		UIManager.put("ToolTip.background", new Color(139, 69, 19));
		UIManager.put("ToolTip.foreground", Color.WHITE);

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
		logpanel.setBounds(361, 0, 362, 357);
		getContentPane().add(logpanel);
		logpanel.setLayout(null);

		txtuser = new JTextField();
		txtuser.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtuser.getText().isEmpty()) {
					txtuser.setText(placeholder);
					txtuser.setForeground(Color.GRAY);

				} else {

					txtuser.setForeground(Color.BLACK);

				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (txtuser.getText().equals(placeholder)) {
					txtuser.setText("");
					txtuser.setForeground(Color.BLACK);

				} else {

					txtuser.setForeground(Color.BLACK);

				}
			}
		});

		txtuser.setBounds(110, 109, 202, 29);
		logpanel.add(txtuser);
		txtuser.setColumns(10);

		txtpass = new JPasswordField();
		txtpass.setBounds(110, 159, 202, 29);
		txtpass.setEchoChar((char)0);
		txtpass.setForeground(Color.GRAY);
		txtpass.setText(passplaceholder);
		
		txtpass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(String.valueOf(txtpass.getPassword()).equals(passplaceholder)) {
					txtpass.setText("");
					txtpass.setForeground(Color.BLACK);
					txtpass.setEchoChar('*');
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(String.valueOf(txtpass.getPassword()).isEmpty()) {
					txtpass.setText(passplaceholder);
					txtpass.setForeground(Color.GRAY);
					txtpass.setEchoChar((char)0);
				}
				
			}
		});
		
		logpanel.add(txtpass);
		
		
		
		
	
		
		JLabel lblforgotpass = new JLabel("Forgot Password?");
		lblforgotpass.setToolTipText("Click here if you forgot your password");
		lblforgotpass.setForeground(Color.WHITE);
		lblforgotpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblforgotpass.setBounds(159, 264, 105, 23);
		lblforgotpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logpanel.add(lblforgotpass);

		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtuser.getText();
				String password = String.valueOf(txtpass.getPassword());
				
				
				if((username.equals(placeholder) || username.isEmpty()) && (password.equals(passplaceholder) || password.isEmpty()))
						{
					JOptionPane.showMessageDialog(null, "Please enter username and password");
				}else if(username.equals(placeholder) || username.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter username");
				}else if(password.equals(passplaceholder) || password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter password");
				}else if(dbcon.validatelogin(username, password)) {
					
					JOptionPane.showMessageDialog(null, "Login Successfully");
					new dash().setVisible(true);
					dispose();
					
				} else {
					JOptionPane.showMessageDialog(null, "Invalid username or password.");
					
				}
				
			
			}
		});
		btnlogin.setToolTipText("Log in your account");
		btnlogin.setForeground(new Color(139, 69, 19));
		btnlogin.setBackground(Color.WHITE);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlogin.setBounds(110, 226, 202, 29);
		btnlogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		logpanel.add(btnlogin);

		JLabel lblsignup = new JLabel("Sign Up");
		lblsignup.setToolTipText("Click here to sign up");
		lblsignup.setForeground(Color.WHITE);
		lblsignup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblsignup.setBounds(186, 282, 49, 29);
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
		
		JCheckBox chckbxsp = new JCheckBox("Show Password");
		chckbxsp.setForeground(Color.WHITE);
		chckbxsp.setBackground(new Color(139, 69, 19));
		chckbxsp.setBounds(110, 195, 142, 23);
		chckbxsp.addActionListener(e -> {
		    if (!String.valueOf(txtpass.getPassword()).equals(passplaceholder)) {
		        if (chckbxsp.isSelected()) {
		        	txtpass.setEchoChar((char)0); 
		        } else {
		        	txtpass.setEchoChar('•');
		        }
		    }
		});
		
		logpanel.add(chckbxsp);
		
		setSize(739, 389);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
