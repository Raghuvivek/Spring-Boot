package beans;

public class Car {
	private String carname;
	private Engine engine;
	
	public Car() {
		System.out.println("Car class instantiated");
	}
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarData() {
		System.out.println("car name: " + carname );
		System.out.println("model year " + engine.getModelyear() );

	}

}
