
public class Teacher extends Person {

	private int payGrade; // 1,2,3
	private static int MONTHS_OF_HOLIDAY=2;
	
	public Teacher(String name, String surname, int yearOfBirth, 
			       int payGrade) {
		super(name, surname, yearOfBirth);
		this.setPayGrade(payGrade);
		
	}

	public int getPayGrade() {
		return payGrade;
	}
	public void setPayGrade(int payGrade) {
		this.payGrade = payGrade;
	}
	
	@Override
	public String toString() {
		return "Teacher [" + 
	               "payGrade="         + payGrade         + ", "
				+  "super.toString()=" + super.toString() + 
				"]";
	}

	@Override
	public int getYearsOfProgrammingExperience() {
		//this jear minus jears of studdying  minus jear of birth
		return 2020-20- this.getYearOfBirth();
	}

	@Override
	public int getMonthsOfProgrammingExperience() {
		// TODO Auto-generated method stub
		return this.getYearsOfProgrammingExperience()*
				(Person.MONTHS_IN_YEAR-Teacher.MONTHS_OF_HOLIDAY);
	}
	
}
