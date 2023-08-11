package threads.simple;

public class ThreadMain1 {

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread().getName()+" starts");
		
		MyThread t1= new MyThread();
		t1.start();
		
		MyThread t2= new MyThread();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(Thread.currentThread().getName()+" exits");
		

	}

}
