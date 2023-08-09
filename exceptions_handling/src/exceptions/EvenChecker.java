package exceptions;

public class EvenChecker {

	public void check(int num) {
		try {
		if(num%2==0) {
			System.out.println("its en even number");
		}else {
			throw new NotAnEvenException("Its not an even number");
		}
		}catch(NotAnEvenException ex) {
			System.out.println(ex);
			throw new RuntimeException(ex.getMessage());
			
		}
	}
}
