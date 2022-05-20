// Florian Körner
public class SimpleItem extends Item {

	public SimpleItem(String name, String description, int basicPrice) {
		super(name, description, basicPrice);
	}

	@Override
	public int getfullPrice() {
		return getBasicPrice();
	}

	@Override
	public String toString() {
		return "SimpleItem: " + getName() + " " +  getDescription() + ", " 
				+ getfullPrice() + "Cents";
	}

}
