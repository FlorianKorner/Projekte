// @author MW
public class Drink extends AllergyInfoItem {
	public static final double MWST = 0.1;
	public static final int MAX_BASIC_PRICE = 2000; 
	public Drink(String name, String description, int basicPrice, String[] allergyInfo) {
		super(name, description, basicPrice, allergyInfo);
	}

	@Override
	public int getfullPrice() {
		return (int) (getBasicPrice() + getBasicPrice() * Drink.MWST);
	}

	public void checkBasicPrice() throws DrinkCostsTooMuchException
	{
		if(!(getBasicPrice() < MAX_BASIC_PRICE))
		{
			throw new DrinkCostsTooMuchException("Getränk kostet mehr als: " + MAX_BASIC_PRICE);
		}
	}
	allergyList[i]-Werte 	Bedeutung
	"A" 					Gluten
	"C" 					Eier
	"D" 					Fisch
	"G" 					Milcherzeugnisse
	
}
