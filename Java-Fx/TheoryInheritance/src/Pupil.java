
public class Pupil extends Person {

	private String className; 
	
	public Pupil(String name, String surname, int yearOfBirth, 
				 String className) {
		// call of the Person constructor
		super(name, surname, yearOfBirth);
		this.setClassName(className);
		// TODO Auto-generated constructor stub
		
	}

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
/*		return"Pupil [className=" + this.className     +
				   ", getName()=" + super.getName()    + 
				", getSurname()=" + super.getSurname() + 
				     "]";
*/
		return 
				"Pupil ["        + 
				super.toString() +
				", className="   + this.className +
				"]";
	}
	

}
