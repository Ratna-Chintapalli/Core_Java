package comm.exceptionhandling;

public class NullpointerEx {

	public static void main(String[] args) {
//java.lang.NullPointerException
		try {
		    String s = null;
		    s.length();
		} catch (ArithmeticException e) {
		    System.out.println("A");
		} 
//		catch (NullPointerException e) {
//		    System.out.println("B");
//		}


	}

}
