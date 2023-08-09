package exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			double result = a / b;
			int[] nums = { 1, 2, 3, 4 };

			System.out.println(nums[3]);

			String[] names = new String[4];

			System.out.println(names[2].length());

			System.out.println("No Exception here..");
		} catch (ArithmeticException ex) {
			System.out.println(ex);
			// ex.printStackTrace();
			//System.out.println(ex.getMessage());

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getCause());
		}

		finally {
			System.out.println("finally executed..");
		}
		System.out.println("Normal flow resumed...");
	}

}
