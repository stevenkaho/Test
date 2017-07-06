
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon; 
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane; 

public class Test extends JFrame { 

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Test() { 

 int width = 30; 
 int height = 30; 
 String FilePath = "c:\\Users\\StevenCheng\\workspace\\Test\\src\\";

 String[] imagelists = new String[9];
 // fill up imagelists with File string
 for(int i =0 ; i < imagelists.length ; i++ ){
	 imagelists[i] = FilePath  + Integer.toString(i) + ".jpg";
 }
 ImageIcon [] imgUP = new ImageIcon[9]; // image array
 JLabel jl[] = new JLabel[9]; // label array
/* 
 Container c;
 c = this.getContentPane();
 setSize(800,600);
*/ 
 this.setResizable(false);//set resize button disable
 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new GridLayout(3,3));
 

 for (int i =0; i < imagelists.length ; i++){
	imgUP[i] = new ImageIcon(imagelists[i]);
 	imgUP[i].setImage(imgUP[i].getImage().getScaledInstance(width,height,Image.SCALE_DEFAULT));
 	jl[i] = new JLabel(imgUP[i]);
 	getContentPane().add(jl[i]);
 	jl[i].setBounds(new Rectangle(new Point(50,50), jl[i].getPreferredSize()));
 };

 
 setBounds(100, 100, 400, 400); 
 setDefaultCloseOperation(EXIT_ON_CLOSE); 
 setVisible(true); 
 } 

 public static void main(String[] args) { 
	 Test th = new Test();
	 th.setVisible(true);

 } 
}

