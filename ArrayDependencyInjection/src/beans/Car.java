package beans;

public class Car {
	private String[] carname;
	private Engine[] engine;
	
	public Car() {
		System.out.println("Car class instantiated");
	}
	
	
	
	public String[] getCarname() {
		return carname;
	}



	public void setCarname(String[] carname) {
		this.carname = carname;
	}



	public Engine[] getEngine() {
		return engine;
	}



	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}



	public void printCarData() {
		for(String car: carname) {
		System.out.println("car name: " + car );
		}
		for(Engine en:engine) {
			System.out.println("ModelYear: " + en.getModelyear() );
		}

	}

}
