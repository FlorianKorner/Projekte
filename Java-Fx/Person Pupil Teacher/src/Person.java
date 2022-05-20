/**
 * Abstract classes example
 * 
 * @author PUZ
 *
 */

// KEYWORD: abstract => there MUST be an abstract method somewhere	
public  abstract   class Person {
	// properties
	private String  	name; 
	private String  	surname; 
	private int     	yearOfBirth; 
	
	// 'static' = constant value
	public static int MONTHS_IN_YEAR=12;

	
	public Person(String name, String surname, int yearOfBirth) {
		this.setName(name);
		this.setSurname(surname);
		this.setYearOfBirth(yearOfBirth);
	}

	// abstract method: just a header declaration (no method body) 
	public abstract int getYearsOfProgrammingExperience(); 
	public abstract int getMonthsOfProgrammingExperience();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	@Override
	public String toString() {
		return "Person [name="        + this.name + 
				     ", surname="     + this.surname + 
				     ", yearOfBirth=" + this.yearOfBirth 
				     + "]";
	}
	

}
