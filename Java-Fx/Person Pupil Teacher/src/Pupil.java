
public class Pupil extends Person {

	private String className; 
	
	public Pupil(String name, String surname, int yearOfBirth, 
				 String className) {
		// call of the Person constructor
		super(name, surname, yearOfBirth);
		this.setClassName(className);
		
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
				", className="   +
				this.className +"]";
	}

	@Override
	public int getYearsOfProgrammingExperience() {
		if(className.startsWith("2")) { return 1;}
		else return 2;
	}
	
	@Override
	public int getMonthsOfProgrammingExperience() {
		// TODO Auto-generated method stub
		return this.getYearsOfProgrammingExperience()*(Person.MONTHS_IN_YEAR-1);
	}


	

}
