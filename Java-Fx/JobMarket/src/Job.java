/**
 * 
 * @author 	Florian Körner
 * @version 2020-11-05	
 */
public abstract class Job implements Locatable {
	
	private String 		name; 
	private String 		desc; 
	private String[] 	skills; 
	private double 		hoursPerWeek;
	
	public Job(String name, String desc, String[] skills, double hoursPerWeek) {
		setName(name);
		setDesc(desc);
		setSkills(skills);
		setHoursPerWeek(hoursPerWeek);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	} 
	
}
