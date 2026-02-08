package task;

class Vehicle {
	String type;

	// String brand;
	// int capacity;
	Vehicle(String type) {
		this.type = type;
	}

}

class Car extends Vehicle {
	String brand;

	Car(String type, String brand) {
		super(type);
		this.brand = brand;
		// TODO Auto-generated constructor stub
	}

}

public class Electric_car extends Car {

	int capacity;

	Electric_car(int capacity, String type, String brand) {
		super(type, brand);

		this.capacity = capacity;

	}
	void display() {
		System.out.println("Car Type is: "+type);
		System.out.println("Car Brand Type Is : "+brand);
		System.out.println("Car Capacity is : "+capacity);
		
	}
	public static void main(String[] args) {
		Electric_car c=new Electric_car(50000,"kkk","yyyy");
		c.display();
	}

}
