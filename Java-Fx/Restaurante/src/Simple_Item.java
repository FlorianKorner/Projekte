/**
 * @author Florian Körner
 */
public class Simple_Item extends Item{

	public Simple_Item(String name, String description, int basicPrice) {
		super(name, description, basicPrice);
	}

	@Override
	public int getfullPrice() {
		return super.getBasicPrice();
	}
	@Override
	public String toString() {
		return "SimpleItem : "
		+getName() + "  "+  
		getDescription() + ", "+ 
		getfullPrice() + "Cents";
	}
	
}
