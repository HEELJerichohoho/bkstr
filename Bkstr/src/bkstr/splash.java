package bkstr;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {
	public splash(int duration) {
		
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JPanel splsh = new JPanel();
		splsh.setBounds(0, 0, 507, 294);
		getContentPane().add(splsh);
		splsh.setLayout(null);
		
		JLabel lblsplsh = new JLabel();
		lblsplsh.setBounds(0, 0, 507, 294);
		
		ImageIcon splshimg = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\Liblib\\bs.jpg");
		Image imgsplsh = splshimg.getImage();
		Image scaledimgsplsh = imgsplsh.getScaledInstance(lblsplsh.getWidth(), lblsplsh.getHeight(), Image.SCALE_SMOOTH);
		lblsplsh.setIcon(new ImageIcon (scaledimgsplsh));
		splsh.add(lblsplsh);
		
		setSize(507, 294);
		setLocationRelativeTo(null);	
	}
	
	public void showsplash(int duration) {
		setVisible(true);
		try {
			Thread.sleep(duration);
			
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		dispose();
	}
	
	
}



