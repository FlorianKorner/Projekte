// @author MW
public abstract class AllergyInfoItem extends Item implements AllergyInfo {
	
	private String[] allergyList;
	
	public AllergyInfoItem(String name, String description, int basicPrice, String[] allergyInfo) {
		super(name, description, basicPrice);
		this.allergyList = allergyInfo;
	}

	@Override
	public boolean containsAllergien(String allergen) {
		for(String i : allergyList)
			if(i != null && i.equals(allergen))
				return true;
		return false;
	}
	
	public String getAllergensAsString()
	{
		String allergensAsString ="";
		for(String i : this.allergyList)
		{
			if(i != null)
				allergensAsString += i;
		}
		return allergensAsString;
	}
	
	public String getBetterPrice()
	{
		if(getfullPrice() < 100)
		{
			return getfullPrice() + " Cents";
		}
		else
		{
			return (getfullPrice()/100) + " EUR " + (getfullPrice()%100) + " CENTS ";
		}
	}

	@Override
	public String toString() {
		return getName() + "\n" + "----------------" + "\n" + getDescription() + "\n" 
				+ getBetterPrice() + getAllergensAsString();
	}
}