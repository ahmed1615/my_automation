package concepts;

public class Car {

	private String color;
	
	private String make;
	
	private String model;
	
	private int year;
	
	public Car() {
		System.out.println("this is the main constarctour");
	}
	public Car(int year,String make, String color) {
	    this.color=color;
		this.year=year;
		this.make=make;
		System.out.println("this is the second constractur");
	
	}
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void increaseSpeed() {
		System.out.println("more speed plz!");
	}
	
	
	
}
