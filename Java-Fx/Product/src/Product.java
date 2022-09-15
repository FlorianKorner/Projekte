
public class Product {
	private String title;
	private double price;
	public String getTitle() {
		return title;
	}
	public Product(String title, double price) {
		
		setTitle(title);
		setPrice(price);
	}
	public void setTitle(String title) {
		if (title.equals(null)) {
			this.title = "unknown";
			System.out.println("Error 1 (Title can not, not be entered");
		} else this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<=0.0) {
			this.price=0.0;
		}else this.price = price;
	}
@Override
	public String toString() {
		return "\""+this.title+"\" costs "+this.price+" EUR"; 
	}
public void print() {
	System.out.println(toString());
}
}
