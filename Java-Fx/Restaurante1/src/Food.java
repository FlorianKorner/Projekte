// @author MW
public class Food extends AllergyInfoItem {

	public static final double MWST = 0.2;
	
	public Food(String name, String description, int basicPrice, String[] allergyInfo) {
		super(name, description, basicPrice, allergyInfo);
	}

	@Override
	public int getfullPrice() {
		return (int) (getBasicPrice() + Food.MWST*getBasicPrice());
	}

}
