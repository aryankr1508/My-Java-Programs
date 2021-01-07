interface Vehicle {
	
	//public void name();
	static void horn() {
		System.out.println("Sound static method");
	}
}

class Car implements Vehicle {
	
}
	
class Truck implements Vehicle {
	
}

public class Interface5 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Vehicle.horn();
	}
	
}
