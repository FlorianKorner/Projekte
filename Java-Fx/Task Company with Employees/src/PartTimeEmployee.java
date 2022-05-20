public class PartTimeEmployee extends Employee{
	private float MIN_PARTTIME_HOURS=10.0f;
	private float MAX_PARTTIME_HOURS=30.0f;
	private float weeklyHours;

	public PartTimeEmployee(String name, String socSecurityNr, float weeklyHours) {
		super(name, socSecurityNr, weeklyHours);
		setWeeklyHours(weeklyHours);
	}
	
	public float getWeeklyHours() {
		return weeklyHours;
	}
	public void setWeeklyHours(float weeklyHours) {
		if(weeklyHours<=MAX_PARTTIME_HOURS&&weeklyHours>=MIN_PARTTIME_HOURS)
		this.weeklyHours = weeklyHours;
		else {
			this.weeklyHours=20;
			System.out.println("Error 4 input has to be between 10 and 30");
		}
	}
	@Override
	public float calcSalery() {
		return (float) (1500.00*(this.weeklyHours/Employee.STD_WEEKLY_HOURS));
	}
	
	@Override
	public String toString() {
		return super.toString()+", the part time worker "+super.getName()+" works for "+this.getWeeklyHours()+" hours";
	}
	@Override
	public void print() {
		System.out.println(this.toString());
	}
}
