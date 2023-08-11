package threads.simple;

public class RunnableMain {

	public static void main(String[] args)  throws Exception{
		System.out.println(Thread.currentThread().getName()+" starts");
		MyRunnable target= new MyRunnable();
		
		Thread t1=new Thread(target);
		
		t1.start();
		
		t1.join();
		System.out.println(Thread.currentThread().getName()+" exits");

	}

}
