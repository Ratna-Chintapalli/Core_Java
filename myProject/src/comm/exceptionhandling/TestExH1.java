package comm.exceptionhandling;

public class TestExH1 {

	public static void main(String[] args) {
		System.out.println("main Method started");
		int a=10/0;
		 
		 try {
			 System.out.println("In try");
			 
		 }catch(Exception e) {
			 System.err.println(e.getMessage());
		 }

	}

}
