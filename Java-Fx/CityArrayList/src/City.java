//import java.util.ArrayList;
public class City extends Community{
	private int budget;
	private String mayor="";
	
	
	public City(String name, int population, int budget, String mayor) {
		super(name, population);
		setBudget(budget);
		setMayor(mayor);
	}
	
	public void print(){
		System.out.print("-");
		System.out.print(this.getName());
		System.out.print(": ");
		System.out.print(this.getTemperature());
		System.out.println("°C");
	}
	
	
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
	public int getBudget() {
		return this.budget;
	}

	@Override
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getTemperature() {
		return -1000;
	}
}