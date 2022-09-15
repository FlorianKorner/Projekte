
public abstract class Community{
	private String name;
	private int population;
	public Community(String name, int population) {
		this.name = name;
		this.population = population;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		if(population>0)this.population = population;
		else this.population=1000000;
	}
	
}
