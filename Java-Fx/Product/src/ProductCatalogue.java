import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductCatalogue extends Product {

    private int maxNumbers;
    private Product catalogue[];
    private int number;

    public ProductCatalogue(int maxNumbers) {
    	if(maxNumbers > 1) {
            this.maxNumbers = maxNumbers;
            this.catalogue = new Product[maxNumbers];
        }
    }
    public Product add(Product p1) {
        for(int i = 0; i < catalogue.length; i++) {
            if(p1 != null && catalogue[i] == null) {
                catalogue[i] = p1;
                number++;
                return p1;
            }
        }
        return null;
    }
    public Product del(String title) {
        for(int i = 0; i < catalogue.length; i++) {
            if(title == catalogue[i].getTitle() && catalogue[i] != null) {
                catalogue[i] = null;
                Product temp = catalogue[i];
                number--;
                return temp;
            }
        }
        return null;
    }
    public Product getCheapestProduct() {
        Product cheapest = new Product();
        for(int i = 0; i < catalogue.length; i++) {
            if(catalogue[i] != null && catalogue[i].getPrice() < cheapest.getPrice()) {
                cheapest = catalogue[i];
            }
        }
        return cheapest;
    }
    @Override
    public void print() {
       // System.out.println("The array has " + number + " elements. List: " + Arrays.toString(catalogue)); -- Prints with null objects
        System.out.println("The array has " + number + " elements.");
        for(int i = 0; i < catalogue.length; i++) {
            if(catalogue[i] != null) {
                catalogue[i].print();
            }
        }
    }

}
