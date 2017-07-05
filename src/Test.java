
import java.awt.Image; 

import javax.swing.ImageIcon; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 

public class Test extends JFrame { 

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Test() { 

 int width = 100; 
 int height = 100; 
  
 ImageIcon image = new ImageIcon("c:\\Users\\StevenCheng\\workspace\\Test\\src\\Brick.JPG"); 
 image.setImage(image.getImage().getScaledInstance(width,height,Image.SCALE_DEFAULT)); 
 JLabel label = new JLabel(image); 
  
 getContentPane().add(label); 
  
 setBounds(100, 100, 200, 200); 
 setDefaultCloseOperation(EXIT_ON_CLOSE); 
 setVisible(true); 
 } 

 public static void main(String[] args) { 
	 Test th = new Test();
	 th.setVisible(true);

 } 
}

