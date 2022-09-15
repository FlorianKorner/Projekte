
// @author Florian Körner
import java.util.ArrayList;

public class Restaurant {
	private String name;
	private ArrayList<Item> items;

	public Restaurant(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "no name";
		}
	}

	public void addItem(Item i) {
		if (i != null)
			items.add(i);
	}

	public void printRestaurantIndo() {
		System.out.println(name);
		for (Item i : items) {
			System.out.println(i.toString()); // toString from SimpleItem
		}
	}

	public boolean hasItem(String itemName) {
		for (Item i : items) {
			if (i.getName().equals(itemName))
				return true;
		}
		return false;
	}

	public Item cheapestItem() {
		int cheapestItem = Integer.MAX_VALUE;
		int cheapestItemIndex = 0;
		int counter = 0;
		for (Item i : items) {
			if (i.getfullPrice() < cheapestItem) {
				cheapestItemIndex = counter;
			}
			counter++;
		}
		return items.get(cheapestItemIndex);
	}

	public Food getMostExpensiveFood()
	{
		int mExpItem = -1;
		int mExpItemIndex = -1;
		int counter = 0;
		for(Item i : items)
		{	
			if(i instanceof Food && i.getfullPrice() > mExpItem)
			{
				mExpItemIndex = counter;					
			}
			counter++;
		}
			
		if(mExpItemIndex > -1)
		{
			return (Food) items.get(mExpItemIndex);
		}
		else
		{
			return null;
		}
	}

	public ArrayList<Drink> getDrinksBelow(int maxDrinkPrice)
	{
		ArrayList<Drink> drinks = new ArrayList<Drink>();
		for(Item i : items)
		{
			if(i instanceof Drink && i.getfullPrice() < maxDrinkPrice)
			{
				drinks.add((Drink) i);
			}
		}
		return drinks;
	}
}
