
public class MarketCommunity extends Community{
	private double temperature;
	
	public MarketCommunity(String name, int population, double temperature) {
		super(name, population);
		this.temperature = temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getBudget() {
		return -1;
	}
	@Override
	public double getTemperature() {
		return this.temperature;
	}
}