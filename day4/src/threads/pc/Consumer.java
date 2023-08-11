package threads.pc;

public class Consumer implements Runnable{

	private Queue queue;
	public Consumer(Queue queue) {
		this.queue=queue;
	}
	@Override
	public void run() {
		
		while(true) {
			queue.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
