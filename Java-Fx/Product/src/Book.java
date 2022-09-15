public class Book extends Product{
	private double weight;

	

	public Book(String title, double price, double weight) {
		super(title, price);
		setWeight(weight);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight>0.0)this.weight=weight;
		else this.weight=1.0;
	}
	
	public double getPrice() {
		double d=  super.getPrice()+(this.weight*2);
		return d;
	}
	public String toString() {
		return "\""+super.getTitle()+"\" costs "+getPrice()+" EUR";
	}
	public void print() {
		System.out.println(toString());
	}
	
	
}
