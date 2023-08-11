package threads.pc;

public class Queue {

	private int data=0;
	private boolean valueSet=false;
	
	
	public synchronized void put(int data) {
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.data=data;
		System.out.println("PUT : "+this.data);
		this.valueSet=true;
		notifyAll();
		
	}
	
	public synchronized void get() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("GET : "+this.data);
		this.valueSet=false;
		notifyAll();
	}
}
