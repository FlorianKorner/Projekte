	
public class ContractWorker extends Worker implements Qualifications{
	private float monthlyHours;
	private float hourlyWage;
	private String qualifications;
	public ContractWorker(String name, String socSecurityNr, float monthlyHours, float hourlyWage) {
		super(name, socSecurityNr);
		setMonthlyHours(monthlyHours);
		setHourlyWage(hourlyWage);
	}
	public float getMonthlyHours() {
		return monthlyHours;
	}
	public void setMonthlyHours(float monthlyHours) {
		if(monthlyHours>0) this.monthlyHours=monthlyHours;
		else {
			this.monthlyHours=50;
			System.out.println("Error 6 the input value for the onthly hours has to be higher than 0");
		}
	}
	public float getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(float hourlyWage) {
		if(hourlyWage>0) this.hourlyWage=hourlyWage;
		else {
			this.hourlyWage=50;
			System.out.println("Error 7 input a hourly wage higher than 0");
		}
	}
	@Override
	public float calcSalery() {
		return (float)(this.hourlyWage*this.monthlyHours);
	}
	@Override
	public String toString() {
		return super.toString()+", (therefor "+super.getName()+" is payed "+this.getHourlyWage()+" per hour and works for "+this.getMonthlyHours()+" per month";
	}
	public void print(){
		System.out.println(this.toString());
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
