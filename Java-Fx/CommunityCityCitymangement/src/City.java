//import java.util.ArrayList;
public class City extends Community implements CityFunctions{
	private String name="";
	private int temperature=0;
	private int budget;
	private String mayor="";
	
	
	public City(String name, int population, String name2, int temperature, int budget, String mayor) {
		super(name, population);
		setName(name2);
		setTemperature(temperature);
		setBudget(budget);
		setMayor(mayor);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null||name.length()<=0) {
			this.name="Unknown";
		System.out.println("Error 1 invalid name was inputted");
		}else {
			this.name = name;
		}
	}
	public int getTemperature() {
		return this.temperature;
	}
	public void setTemperature(int temperature) {
		if(temperature<60&&temperature>-90)this.temperature=temperature;
		else { this.temperature=0;
		System.out.println("Error 2 temperature has to be between +60° and -90°");
		}
	}
	public void print(){
		System.out.print("-");
		System.out.print(this.getName());
		System.out.print("		");
		System.out.print(this.getTemperature());
		System.out.println("°C");
	}
	@Override
	public int getBudget() {
		return this.budget;
	}
	@Override
	public void setBudget(int budget) {
		if(budget<0)this.budget=10000;
		else this.budget=budget;
	}

	public String getMayor() {
		return this.mayor;
	}
	
	public void setMayor(String mayor) {
		if(mayor==null||mayor.length()<0
			||mayor.length()==0) {
			System.out.println("Error 1 ");
		}else this.mayor=mayor;
	}
	@Override
	public double budgetPerCapita() {
		return this.budget/super.getPopulation();
	}
	
}
