package threads.simple;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread executed...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Job Done");
	}
}
