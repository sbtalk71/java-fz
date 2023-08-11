package threads.simple;

public class TableMain {

	public static void main(String[] args) throws Exception{
		TableGenerator tg= new TableGenerator();
		
		TableThread t1= new TableThread(7, tg);
		t1.start();
		
		TableThread t2= new TableThread(8, tg);
		t2.start();
		
		t1.join();
		t2.join();

	}

}
