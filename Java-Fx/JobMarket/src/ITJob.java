// Florian Körner
import java.util.Arrays;

public class ITJob extends PayableJob{
	public static final int MIN_HOURLY_RATE =5;
	
	public ITJob(String name, String desc, String[] skills, double hoursPerWeek, Location location, double paymentPerWeek) {
		super(name, desc, skills, location, hoursPerWeek,paymentPerWeek);
	}
	@Override
    public double getHourlyRate() throws MinHourlyRateException {
        if (super.getPaymentPerWeek() / super.getHoursPerWeek() >= MIN_HOURLY_RATE) {
            return super.getPaymentPerWeek() / super.getHoursPerWeek();
        } else {
            throw new MinHourlyRateException("Job: "+super.getName()+" is paid "+
                    super.getPaymentPerWeek() / super.getHoursPerWeek()+
                    "EUR/hr. But should be min: "+MIN_HOURLY_RATE+"EUR/hr");
        }

    }
	public String toString() {
		return "ITJob: " + getName() + ", " + getDesc() + ", \n location=" + getLocation() + ", \n getPaymentPerWeek()="
				+ getPaymentPerWeek() + ", \n getSkills()=" + Arrays.toString(getSkills()) + "\n";
	}
}
