package comm.exceptionhandling;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("String is null!");
		}

	}

}
