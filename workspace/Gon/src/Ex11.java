import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ex11 extends JFrame {
		public Ex11() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(),getY()");
		
		JLabel textLabel = new JLabel("인제대학교");
		ImageIcon normallIcon = new ImageIcon("C:\\Users\\WIN\\Desktop/로고.png");
		JLabel Label = new JLabel("전화해", normallIcon, SwingConstants.CENTER);
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC,20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				Ex11 frame = (Ex11)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());
				
			}
			
		});
		c.add(b1); c.add(b2); c.add(b3);
		c.add(textLabel); c.add(Label);
		setSize(350,450);
		setVisible(true);}
		
	public static void main(String[] args) {
	new Ex11();
	}

}
