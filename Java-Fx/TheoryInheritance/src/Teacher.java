
public class Teacher extends Person {

	private int payGrade; // 1,2,3

	public Teacher(String name, String surname, int yearOfBirth, 
			       int payGrade) {
		// in der Regel:
		// 1) zuerst den Super-Konstruktor aufrufen!!!
		super(name, surname, yearOfBirth);
		// 2) danach, lokale Klassen-Variablen initialisieren
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
