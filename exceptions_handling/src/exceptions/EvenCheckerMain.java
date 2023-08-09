package exceptions;

public class EvenCheckerMain {

	public static void main(String[] args) {

		EvenChecker evenChecker = new EvenChecker();

		try {
			evenChecker.check(11);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("All done..");
	}

}
