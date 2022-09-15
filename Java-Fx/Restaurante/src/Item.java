//Florian Körner
public abstract class Item {
	private String name;
	private String description;
	private int basicPrice;
	
	
	
	public Item(String name, String description, int basicPrice) {
		this.name = name;
		this.description = description;
		this.basicPrice = basicPrice;
	}

	public abstract int getFullPrice();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(int basicPrice) {
		this.basicPrice = basicPrice;
	}
	
	
}