package threads.pc;

public class PCMain {

	public static void main(String[] args) throws Exception{
		Queue queue= new Queue();
		
		Producer producer= new Producer(queue);
		Thread t1=new Thread(producer);
		t1.start();
		
		Consumer consumer=new Consumer(queue);
		Thread t2= new Thread(consumer);
		
		t2.start();
		
		t1.join();
		t2.join();
		
	

	}

}
