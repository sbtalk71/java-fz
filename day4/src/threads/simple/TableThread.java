package threads.simple;

public class TableThread extends Thread {

	private int num;
	private TableGenerator tableGenerator;

	public TableThread(int num, TableGenerator tableGenerator) {
		this.num = num;
		this.tableGenerator = tableGenerator;
	}

	@Override
	public void run() {
		tableGenerator.printTable(num);

	}
}
