//import java.util.ArrayList;
public abstract class AllergyInfoItem extends Item implements AllergyInfo{
	private String allergyList[] ;
	public AllergyInfoItem(String name, String description, int basicPrice, String[] allergyInfo)  {
		super(name, description, basicPrice);
		this.allergyList=allergyInfo;
		
	}
	
	@Override
	public boolean containsAllergen(String allergen) {
		if(allergyList.leght()) {
		for(String i : allergyList) {
            if(i != null && i.equals(allergen))
                return true;
		}
		}
		
        return false;
	}
	
	
}