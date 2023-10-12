package ff;

import javax.swing.JLabel;

public class TimerThread extends Thread {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel){
		super();
		this.timerLabel = timerLabel;
	}
	@Override
	public void run () {super.run(); int n = 0;
	while(true) {	
		timerLabel.setText(Integer.toString(n)); n++;
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {
				e.printStackTrace();
		}
	}}
}
