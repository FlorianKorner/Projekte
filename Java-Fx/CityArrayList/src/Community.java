
public abstract class Community implements Comparable<City>{
	private String name;
	private int population;
	
	public abstract int getBudget();
	public abstract double getTemperature();
	
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
	@Override
	public String toString() {
		return (String) this.getName()+" has "+this.getPopulation()+"citizens.";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Community other = (Community) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	
	
}
