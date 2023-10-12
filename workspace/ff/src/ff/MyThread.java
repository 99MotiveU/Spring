package ff;

import javax.swing.JLabel;

public class MyThread implements Runnable{
	public void run() {
		try {Thread.sleep(5000);
	}
		catch(InterruptedException e) {return;}
	}
	public static void main(String[] args) {
		JLabel timerLabel = new JLabel();
		TimerRunnable runnable = new TimerRunnable(timerLabel);

		Thread th = new Thread(runnable);
		th.start();
	}
}
