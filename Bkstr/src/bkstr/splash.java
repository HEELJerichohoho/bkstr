package bkstr;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {
    
    private JProgressBar prog;
    
    public splash() {
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
        Image scaledimgsplsh = imgsplsh.getScaledInstance(
                lblsplsh.getWidth(), lblsplsh.getHeight(), Image.SCALE_SMOOTH);
        lblsplsh.setIcon(new ImageIcon(scaledimgsplsh));
        splsh.add(lblsplsh);
        
        setSize(507, 314); 
        setLocationRelativeTo(null);
        
        prog = new JProgressBar(0, 100);
        prog.setForeground(new Color(139, 69, 19));
        prog.setBounds(0, 294, 507, 20);
        prog.setStringPainted(true);
        getContentPane().add(prog);
    }
    
    public void showsplash() {
        setVisible(true);
        
        
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            prog.setValue(i);
        }
        
        dispose(); 
    }
}
