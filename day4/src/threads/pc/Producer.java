package threads.pc;

public class Producer implements Runnable{

	private Queue queue;
	public Producer(Queue queue) {
		this.queue=queue;
	}
	@Override
	public void run() {
		int count=0;
		while(true) {
			queue.put(count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
