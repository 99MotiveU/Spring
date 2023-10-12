package ff;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerLabel = new JLabel();
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		setSize(300,179);
		setVisible(true);
		th.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx();

	}

}
