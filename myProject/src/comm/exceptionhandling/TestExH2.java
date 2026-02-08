package comm.exceptionhandling;

public class TestExH2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("in try");
		    //int a = 10/0;
		   //System.out.println(10.5/0); //Infinity
		   //System.out.println(0.0/0.0); //NaN
			//System.out.println(0.0/0); //NaN
			//System.out.println(0/0.0); //NaN
			System.out.println(0/0);  //java.lang.ArithmeticException: / by zero
		} catch (ArithmeticException e) {
			System.err.println(e.toString()); 
		    System.out.println("AE");
		} 

	}

}
