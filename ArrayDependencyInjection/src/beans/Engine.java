package beans;

public class Engine {
	private String modelyear;
	
	public Engine() {
		System.out.println("Engine class instantiated");
	}
	
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	
	public String getModelyear() {
		return modelyear;
	}

}
