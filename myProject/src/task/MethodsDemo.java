package task;

public class MethodsDemo {
	int getNumber() {
		int sum=0;
		sum=sum+10;
	    return sum;
	}
	void display() {
	    System.out.println("Hello!");
	}

	public static void main(String[] args) {
		MethodsDemo m=new MethodsDemo();
		m.display();
		int x=m.getNumber();
		System.out.println(x);

	}

}
