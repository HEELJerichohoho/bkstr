package bkstr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class regis extends JFrame {
	private JTextField txtuserreg;
	private JPasswordField txtpassregis;
	private JPasswordField txtpassregiscon;
	private JTextField txtnum;
	private JComboBox comboBox;
	String placeholder = "Enter valid username";
	String passplaceholder = "Enter valid password";
	String conpassplaceholder = "Confirm password";
	String numplaceholder = "Enter 11-digit number ex. 09998889999";
	
	
	public regis() {
		setTitle("Registration");
		setResizable(false);
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
		txtnum.setToolTipText("Enter your 11-digit format number");
		txtnum.setColumns(10);
		txtnum.setBounds(139, 187, 202, 29);
		txtnum.setForeground(Color.GRAY);
		txtnum.setText(numplaceholder);
		
		txtnum.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (txtnum.getText().equals(numplaceholder)) {
		            txtnum.setText("");	
		            txtnum.setForeground(Color.BLACK);	
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        String numText = txtnum.getText();

		        
		        if (numText.isEmpty()) {
		            txtnum.setText(numplaceholder);	
		            txtnum.setForeground(Color.GRAY);
		            txtnum.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		            return;
		        }

		        if (!numText.matches("\\d{11}")) {
		            txtnum.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            //JOptionPane.showMessageDialog(null, "Number must be exactly 11 digits.", "Invalid Number", JOptionPane.ERROR_MESSAGE);
		        } else {
		            txtnum.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1)); 
		    }
		    }});

		
		
		
		
		
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
		
		JButton btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Confirm = JOptionPane.showConfirmDialog(null, "Do you want to cancel your registration?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(Confirm==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Your registration is cancelled", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
					login log = new login();
                    log.setVisible(true);
                    dispose();
					
				} else {
					 JOptionPane.showMessageDialog(null, "You may continue using the registration page.", "Info", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		btncancel.setToolTipText("Click to cancel your registration");
		btncancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btncancel.setForeground(new Color(139, 69, 19));
		btncancel.setBounds(137, 260, 89, 23);
		regpanel.add(btncancel);
		
		JButton btnconfirm = new JButton("Confirm");
		btnconfirm.setToolTipText("Click if you are finished entering valid information");
		btnconfirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnconfirm.setForeground(new Color(139, 69, 19));
		btnconfirm.setBounds(252, 260, 89, 23);
		
		
		btnconfirm.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String user = txtuserreg.getText();
		        String pass = new String(txtpassregis.getPassword());
		        String conpass = new String(txtpassregiscon.getPassword());
		        String num = txtnum.getText();
		        String role = comboBox.getSelectedItem().toString();
		        
		        
		        
		        
		        if (user.isEmpty() || user.equals(placeholder) ||
		                pass.isEmpty() || pass.equals(passplaceholder) ||
		                conpass.isEmpty() || conpass.equals(conpassplaceholder) ||
		                num.isEmpty() || num.equals(numplaceholder) ||
		                num.length() != 11 || !num.matches("\\d{11}")) {

		                JOptionPane.showMessageDialog(
		                    null,
		                    "Please fill out all fields correctly before proceeding.\n" +
		                    "- Username should not be empty\n" +
		                    "- Passwords must not be empty and must match\n" +
		                    "- Contact number must be exactly 11 digits",
		                    "Invalid Input",
		                    JOptionPane.WARNING_MESSAGE
		                );
		                return;
		            }
		        
		        
		        
		        
		        
		        

		       
		        if (!showTermsAndConditions()) {
		            JOptionPane.showMessageDialog(
		                null, 
		                "You must accept the Terms and Conditions to proceed.", 
		                "Agreement Required", 
		                JOptionPane.WARNING_MESSAGE
		            );
		            return;
		        }

		        
		        if (!pass.equals(conpass)) {
		            JOptionPane.showMessageDialog(null, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		      
		        int confirm = JOptionPane.showConfirmDialog(
		                null,
		                "Are you sure with your registration?",
		                "Confirm",
		                JOptionPane.YES_NO_OPTION
		        );

		        if (confirm == JOptionPane.YES_OPTION) {
		            if (dbcon.registration(user, pass, num, role)) {
		                JOptionPane.showMessageDialog(null, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

		                txtuserreg.setText("");
		                txtpassregis.setText("");
		                txtpassregiscon.setText("");
		                txtnum.setText("");

		                int confirm2 = JOptionPane.showConfirmDialog(
		                        null,
		                        "Do you want to proceed to login page?",
		                        "Confirm",
		                        JOptionPane.YES_NO_OPTION
		                );

		                if (confirm2 == JOptionPane.YES_OPTION) {
		                    login log = new login();
		                    log.setVisible(true);
		                    dispose();
		                } else {
		                    JOptionPane.showMessageDialog(null, "You may continue using the registration page.", "Info", JOptionPane.INFORMATION_MESSAGE);
		                }
		            } else {
		                JOptionPane.showMessageDialog(null, "Registration failed! Username might already exist.", "Failed", JOptionPane.ERROR_MESSAGE);
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "You may continue using the registration page.", "Info", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});


		
		
		
		
		regpanel.add(btnconfirm);
		
		JLabel lblrtype = new JLabel("Account");
		lblrtype.setVerticalAlignment(SwingConstants.TOP);
		lblrtype.setForeground(Color.WHITE);
		lblrtype.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblrtype.setBounds(67, 231, 62, 23);
		regpanel.add(lblrtype);
		
		
	
		
		
	
		setSize(756, 399);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private boolean validpass(String pass){
		String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&._-])[A-Za-z\\d@$!%*?&._-]{8,}$";
		return pass.matches(regex);
	}
	
	
	
	
	private boolean showTermsAndConditions() {
	    String terms = "DATA PRIVACY NOTICE\n\n"
	            + "By registering, you agree to provide your personal information (e.g., name, "
	            + "contact number, username, and password) to our system. "
	            + "We value your privacy and are committed to protecting your personal data in "
	            + "accordance with the Data Privacy Act of 2012 (RA 10173).\n\n"
	            + "• Your data will be collected and processed solely for purposes of account "
	            + "creation, system access, and verification.\n"
	            + "• Your data will be kept confidential and will not be shared with third "
	            + "parties without your consent, unless required by law.\n"
	            + "• You have the right to access, correct, or request deletion of your personal "
	            + "data at any time.\n"
	            + "• Reasonable measures are in place to ensure the security and integrity of "
	            + "your information.\n\n"
	            + "By clicking 'I Agree', you confirm that you have read, understood, and "
	            + "accepted these terms.";

	    JTextArea textArea = new JTextArea(terms);
	    textArea.setEditable(false);
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);

	    JScrollPane scrollPane = new JScrollPane(textArea);
	    scrollPane.setPreferredSize(new Dimension(450, 250));

	    int choice = JOptionPane.showOptionDialog(
	            null,
	            scrollPane,
	            "Terms and Conditions",
	            JOptionPane.YES_NO_OPTION,
	            JOptionPane.INFORMATION_MESSAGE,
	            null,
	            new String[]{"I Agree", "Cancel"},
	            "I Agree"
	    );

	    return choice == JOptionPane.YES_OPTION;
	}

}
