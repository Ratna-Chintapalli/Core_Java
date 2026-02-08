package comm.exceptionhandling;

public class TestExH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    try {
		        int a = 10/0;
		    }catch (ArithmeticException e) {
		        System.out.println("Inner");
		    }
		} catch (Exception e) {
		    System.out.println("Outer");
		}

	}

}
