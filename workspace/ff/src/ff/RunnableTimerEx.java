package ff;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerLabel = new JLabel();
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		timerLabel.setFont(new Font("Gothic",Font.BOLD,25));
		c.add(timerLabel);
			JButton btn = new JButton("Stop");
			btn.addActionListener(new ActionListener(){
@Override
			public void actionPerformed(ActionEvent e) {
			th.interrupt();
			JButton tn = (JButton)e.getSource();
			btn.setEnabled(false);}});
			c.add(btn); setSize(300,200); setVisible(true); th.start();}
	public static void main(String[] args) {new RunnableTimerEx();}}
