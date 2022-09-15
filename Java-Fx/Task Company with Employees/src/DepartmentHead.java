
public class DepartmentHead extends Employee{
	
	public DepartmentHead(String name, String socSecurityNr, float salary, int headCount) {
		super(name, socSecurityNr, salary);
		setHeadCount(headCount);
	}
	private static float LEAD_EXTRA=100.00f;
	private int headCount;
	public int getHeadCount() {
		return headCount;
	}
	public void setHeadCount(int headCount) {
		if(headCount>=1)this.headCount = headCount;
		else {
			this.headCount=1;
			System.out.println("Error 5 headcount must be bigger than 0");
	}
	
	}
	@Override
	public float calcSalery() {
		return (float)(1500.0+(this.headCount*DepartmentHead.LEAD_EXTRA));
	}
	@Override
	public String toString() {
		return super.toString()+", "+super.getName()+" leads a team of "+this.getHeadCount()+" people";
	}
	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
}
