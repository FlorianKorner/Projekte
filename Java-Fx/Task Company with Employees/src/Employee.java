
public class Employee extends Worker implements Qualifications{
	private float  salary;
	private String qualifications="";

	public Employee(String name, String socSecurityNr, float salary) {
		super(name, socSecurityNr);
		this.salary = salary;
	}

	@Override
	public float calcSalery() {
		return this.salary;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	public void print() {
		System.out.println(this.toString());
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		if(salary<=0) {
			this.salary=0;
			System.out.println("Error 3 only salarys of more than 0 are allowed");
		}else this.salary=salary;
	}

	@Override
	public void attendedTraining(String qualification) {
		this.qualifications+=" "+qualification;
	}
	@Override
	public String allQualifications() {
		return this.qualifications;
	}
	@Override
	public boolean qualifiedFor(String qualifications) {
		if(this.qualifications.contains(qualifications)) {
			return true;
		}else {
			return false;
		}
	}
	
}
