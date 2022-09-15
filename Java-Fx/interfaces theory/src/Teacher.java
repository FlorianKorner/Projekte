
public class Teacher extends Person {

	private int payGrade; // 1,2,3
	
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
	
}
