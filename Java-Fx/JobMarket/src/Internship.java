// Florian Körner
import java.util.Arrays;

public class Internship extends Job{
	private String postCode;
	public Internship(String name, String desc, String[] skills, double hoursPerWeek, String postcode ) {
		super(name, desc, skills, hoursPerWeek);
		setPostCode(postcode);
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		if(postCode==null||postCode.length()<=0) {
			this.postCode="Unknown";
		System.out.println("Error 1 invalid name was inputted");
		}else {
			this.postCode = postCode;
		}
	}
	public String toString() {
		return "Praktikum [postCode=" + this.postCode + 
				       ", getName()=" + getName() + 
				       ", getDesc()=" + getDesc() + 
				       ", getSkills()=" + Arrays.toString(getSkills()) 
				       + "]\n";
}
}
