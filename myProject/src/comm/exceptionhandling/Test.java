package comm.exceptionhandling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				String n=null;
				System.out.println(n.length());
			}catch(Exception e) {
				System.out.println("Null Exception ");
			}
		}catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
