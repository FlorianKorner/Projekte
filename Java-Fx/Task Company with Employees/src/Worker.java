
public abstract class Worker{
	public static float STD_WEEKLY_HOURS=38.5f;
	private String name;
	private String socSecurityNr;
	public Worker(String name, String socSecurityNr) {
		setName(name);
		setSocSecurityNr(socSecurityNr);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null||name.length()<=0) {
			this.name="Unknown";
		System.out.println("Error 1 invalid Name was inputted");
		}else {
			this.name = name;
		}
			
	}
	public String getSocSecurityNr() {
		return socSecurityNr;
	}
	public void setSocSecurityNr(String socSecurityNr) {
		if(socSecurityNr==null||socSecurityNr.length()<=0||socSecurityNr.length()>=9) {
			this.socSecurityNr="Unknown";
		System.out.println("Error 2 invalid soc number was inputted");
		}else {
			this.socSecurityNr = socSecurityNr;
		}
	}
	public abstract float calcSalery();
	@Override
	public String toString() {
		return this.name+", Sozialversicherungsnummer: "+this.getSocSecurityNr()+
				", verdient: "+this.calcSalery();
	}
	public void printInfo() {
		System.out.println(this.toString());
	}
}
