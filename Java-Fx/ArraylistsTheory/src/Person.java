
public class Person {
	
	private String name; 
	private    int yearBirth;

	
	public Person(String name, int yearBirth) {
		super();
		this.name = name;
		this.yearBirth = yearBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearBirth() {
		return yearBirth;
	}
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getGebJahr()=" + getYearBirth() + "]";
	}
}
