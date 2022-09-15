
public class MarketCommunity extends Community{
	private String name;
	private int temperature;
	
	public MarketCommunity(String name, int population, String name2, int temperature) {
		super(name, population);
		name = name2;
		this.temperature = temperature;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}