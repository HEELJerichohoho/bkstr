package bkstr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class regis extends JFrame {
	private JTextField txtuserreg;
	private JPasswordField txtpassregis;
	private JPasswordField txtpassregiscon;
	private JTextField txtnum;
	private JComboBox comboBox;
	String placeholder = "Enter valid username";
	String passplaceholder = "Enter valid password";
	String conpassplaceholder = "Confirm password";
	String numplaceholder = "Enter valid number";
	
	
	public regis() {
		getContentPane().setLayout(null);
		
		JPanel bgpanel = new JPanel();
		bgpanel.setBounds(0, 0, 369, 357);
		getContentPane().add(bgpanel);
		bgpanel.setLayout(null);
		
		JLabel bg = new JLabel();
		bg.setBounds(0, 0, 369, 357);
		
		
		ImageIcon bckgrnd = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\Liblib\\bs.jpg");
		Image img = bckgrnd.getImage();
		Image scaledImg = img.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
		bg.setIcon(new ImageIcon(scaledImg));
		bgpanel.add(bg);
		
		
		
		JPanel regpanel = new JPanel();
		regpanel.setBackground(new Color(139, 69, 19));
		regpanel.setForeground(Color.WHITE);
		regpanel.setBounds(364, 0, 375, 357);
		getContentPane().add(regpanel);
		regpanel.setLayout(null);
		
		txtuserreg = new JTextField();
		txtuserreg.setColumns(10);
		txtuserreg.setBounds(139, 67, 202, 29);
		txtuserreg.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtuserreg.getText().isEmpty()) {
					txtuserreg.setText(placeholder);
					txtuserreg.setForeground(Color.GRAY);
					
				} else {
					txtuserreg.setForeground(Color.BLACK);
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				if (txtuserreg.getText().equals(placeholder)) {
					txtuserreg.setText("");
					txtuserreg.setForeground(Color.BLACK);
					
					
				}else {

					txtuserreg.setForeground(Color.BLACK);

				}
			}
		});
		
		
		
		
		regpanel.add(txtuserreg);
		
		txtpassregis = new JPasswordField();
		txtpassregis.setEchoChar((char)0);
		txtpassregis.setText(passplaceholder);
		txtpassregis.setForeground(Color.GRAY);
		txtpassregis.setBounds(139, 107, 202, 29);
		
		
		txtpassregis.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			
			if (String.valueOf(txtpassregis.getPassword()).equals(passplaceholder)) {
				txtpassregis.setText("");
				txtpassregis.setForeground(Color.BLACK);
				txtpassregis.setEchoChar('*');
				
			}
		}
	});
		
		txtpassregis.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if (String.valueOf(txtpassregis.getPassword()).isEmpty()) {
					txtpassregis.setText(passplaceholder);
					txtpassregis.setForeground(Color.GRAY);
					txtpassregis.setEchoChar((char)0);
					
				}
			}
			
		});
		
		
		txtpassregis.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String vpass = new String(txtpassregis.getPassword());
				if(!validpass(vpass)) {
					txtpassregis.setToolTipText("Password must be 8+ chars, include letters, numbers, and special chars");
		            txtpassregis.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
				}else {
		            txtpassregis.setToolTipText(null);
		            txtpassregis.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		        }
				
			}
		});
		
		regpanel.add(txtpassregis);
		
		txtpassregiscon = new JPasswordField();
		txtpassregiscon.setEchoChar((char)0);
		txtpassregiscon.setText(conpassplaceholder);
		txtpassregiscon.setForeground(Color.GRAY);
		txtpassregiscon.setBounds(139, 147, 202, 29);
		
		txtpassregiscon.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(String.valueOf(txtpassregiscon.getPassword()).equals(conpassplaceholder)) {
					txtpassregiscon.setText("");
					txtpassregiscon.setForeground(Color.BLACK);
					txtpassregiscon.setEchoChar('*');
					
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(String.valueOf(txtpassregiscon.getPassword()).isEmpty()) {
					txtpassregiscon.setText(conpassplaceholder);
					txtpassregiscon.setForeground(Color.GRAY);
					txtpassregiscon.setEchoChar((char)0);
					
				}
				
			}
		});
		
		txtpassregiscon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			    char[] pass = txtpassregis.getPassword();
			    char[] confirm = txtpassregiscon.getPassword();

			    if (!Arrays.equals(pass, confirm)) {
			        txtpassregiscon.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			        txtpassregiscon.setToolTipText("Passwords do not match");
			    } else {
			        txtpassregiscon.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
			        txtpassregiscon.setToolTipText(null);
			    }
			}

		});
		
		
		
		regpanel.add(txtpassregiscon);
		
		txtnum = new JTextField();
		txtnum.setColumns(10);
		txtnum.setBounds(139, 187, 202, 29);
		txtnum.setForeground(Color.GRAY);
		txtnum.setText(numplaceholder);
		
		
		txtnum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtnum.getText().equals(numplaceholder)) {
					txtnum.setText("");	
					txtnum.setForeground(Color.BLACK);	
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtnum.getText().isEmpty()) {
					txtnum.setText(numplaceholder);	
					txtnum.setForeground(Color.GRAY);
				}
				
			}
		});
		
		
		
		
		
		
		regpanel.add(txtnum);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(new Color(139, 69, 19));
		comboBox.setBorder(null);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Client"}));
		comboBox.setBounds(139, 227, 87, 22);
		regpanel.add(comboBox);
		
		JLabel lblrusername = new JLabel("Username");
		lblrusername.setVerticalAlignment(SwingConstants.TOP);
		lblrusername.setForeground(Color.WHITE);
		lblrusername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblrusername.setBounds(67, 74, 62, 23);
		regpanel.add(lblrusername);
		
		JLabel lblrpassword = new JLabel("Password");
		lblrpassword.setVerticalAlignment(SwingConstants.TOP);
		lblrpassword.setForeground(Color.WHITE);
		lblrpassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblrpassword.setBounds(67, 114, 62, 23);
		regpanel.add(lblrpassword);
		
		JLabel lblrnum = new JLabel("Contact");
		lblrnum.setVerticalAlignment(SwingConstants.TOP);
		lblrnum.setForeground(Color.WHITE);
		lblrnum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblrnum.setBounds(67, 194, 62, 23);
		regpanel.add(lblrnum);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setToolTipText("Click to cancel your registration");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setBounds(137, 260, 89, 23);
		regpanel.add(btnNewButton);
		
		JButton btnCancel = new JButton("Confirm");
		btnCancel.setToolTipText("Click if you are finished entering valid information");
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setForeground(new Color(139, 69, 19));
		btnCancel.setBounds(252, 260, 89, 23);
		regpanel.add(btnCancel);
		
	
		setSize(756, 399);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private boolean validpass(String pass){
		String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&._-])[A-Za-z\\d@$!%*?&._-]{8,}$";
		return pass.matches(regex);
	}
	
	
}
