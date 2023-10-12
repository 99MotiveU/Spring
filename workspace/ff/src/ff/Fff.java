package ff;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Fff extends JFrame {
	public Fff() {
		setTitle("new button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyButton b = new MyButton("new button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		c.add(b);
		setSize(350,400);
		setVisible(true);
	}
	
	class MyButton  extends JButton{
		 public MyButton(String s) {
			 super(s);	
	}
		
	
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0,0,this.getWidth()-1,this.getHeight()-1);
		}		
}
	

	public static void main(String[] args) {
		new Fff();
	}
}
