
public class Vehicle {

	private String lmp;
	private double height;
	public static int counter=0;
	
	public Vehicle(){}
	public Vehicle(String lmp, double height) {
		setHeight(height);
		setLmp(lmp);
		counter++;
		System.out.println("Hello World");
	}
	
	public String getLmp() {
		System.out.println("Hello World 4");
		return lmp;
	}
	public void setLmp(String lmp) {
		this.lmp = lmp;
		System.out.println("Hello World 3");
	}
	public double getHeight() {
		System.out.println("Hello World 2");
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		System.out.println("Hello World 1");
	}
	
}