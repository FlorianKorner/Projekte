// Florian Körner
import java.util.Arrays;

public class ManagementJob extends PayableJob{
	public static final int MIN_HOURLY_RATE =10;
	public static final int BONUS_PER_HOUR =5;
	s
	public ManagementJob(String name, String desc, String[] skills,Location location, double hoursPerWeek) {
		super(name, desc, skills, location, hoursPerWeek);
	}
	@Override
    public double getHourlyRate() throws MinHourlyRateException {
        if (super.getPaymentPerWeek() / super.getHoursPerWeek() + BONUS_PER_HOUR >= MIN_HOURLY_RATE) {
            return super.getPaymentPerWeek() / super.getHoursPerWeek() + BONUS_PER_HOUR;
        } else {
            throw new MinHourlyRateException("Job: "+super.getName()+" is paid "+
        super.getPaymentPerWeek() / super.getHoursPerWeek() + BONUS_PER_HOUR+
        "EUR/hr. But should be min: "+MIN_HOURLY_RATE+"EUR/hr");
        }

    }
	@Override
	public String toString() {
		return   "ManagementJob: " +  getName()	+ ", " + getDesc() + 
			       ", \n location=" 		    + getLocation() + 
				   "  \n getPaymentPerWeek()="  + getPaymentPerWeek() + 
				   "  \n getSkills()="          + Arrays.toString(getSkills()) + 
				   "\n";
	}
}
