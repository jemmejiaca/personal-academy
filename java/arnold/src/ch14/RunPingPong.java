package ch14;

public class RunPingPong implements Runnable {
	private String word;	// what word to print
	private int delay;		// how long to pause
	
	public RunPingPong(String whatToSay, int delayTime) {
		word = whatToSay;
		delay = delayTime;
	}
	
	public void run() {
		try {
			for(;;) {
				System.out.print(word + " ");
				Thread.sleep(delay);	// wait until next time
			}
		} catch (InterruptedException e) {
			return;		// end this thread
		}
	}

	public static void main(String[] rgs) {
		Runnable ping = new RunPingPong("ping", 33);
		Runnable pong = new RunPingPong("PONG", 100);
		new Thread(ping).start();
		new Thread(pong).start();
	}

}
