package threads.simple;

public class TableGenerator {

	public synchronized void  printTable(int num) {
		try {
		for(int i=1;i<11;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
			Thread.sleep(5000);
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
