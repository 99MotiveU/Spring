package my0929;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CheckBoxEx extends JFrame{

	 private JRadioButton[] radio = new JRadioButton[3];
	 private String[] text ={"사과", "체리", "배"};
	 private ImageIcon[] image = {
	 new ImageIcon ("imge/apple.jpg"),
	 new ImageIcon("C:\\Users\\WIN\\Desktop/cherry.jpg"),
	 new ImageIcon("C:\\Users\\WIN\\Desktop/pear.jpg")};
	 private JLabel imageLabel = new JLabel();
	
	 public CheckBoxEx() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		ButtonGroup g = new ButtonGroup();
		
		for(int i =0; i<image.length; i++) {
			radio[i]=new JRadioButton(text[i]);
				g.add(radio[i]);
				radioPanel.add(radio[i]);
				radio[i].addItemListener(new MyItem());
				
		}
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		setVisible(true);
	}
	 class MyItem implements ItemListener  {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()== ItemEvent.DESELECTED) return;
			if(radio[0].isSelected())imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())imageLabel.setIcon(image[1]);
			else imageLabel.setIcon(image[2]);
			
		}
		 
	 }
	 public static void main(String[] args) {
		new CheckBoxEx();
	}

}
