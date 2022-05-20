// Florian Körner
public abstract class PayableJob extends Job{
	private double paymentPerWeek;
	private Location location;
	public PayableJob(String name, String desc, String[] skills,Location location, double hoursPerWeek, double paymentPerWeek) {
		super(name, desc, skills, hoursPerWeek);
		setLocation(location);
		setPaymentPerWeek(paymentPerWeek);
	}
	public double getPaymentPerWeek() {
		return this.paymentPerWeek;
	}
	public void setPaymentPerWeek(double paymentPerWeek) {
		this.paymentPerWeek=paymentPerWeek;
	}
	public String getPostCode() {
		return this.location.getPostCode();
	}
	
	
	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		if(location!=null&&location.getAddress()!=null&&
		   location.getAddress().length()>0&&
		   location.getPostCode()!=null&&
		   location.getPostCode().length()>4) {
		   this.location=location;
		}else{
			System.out.println("Error 1");
		}
	}
	public abstract double getHourlyRate() throws MinHourlyRateException;
	
}
