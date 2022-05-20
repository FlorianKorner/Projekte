import java.util.Comparator;

/**
 * 
 */

/**
 * @author Florian
 *
 */
public class MyComparator implements Comparator<Community> {
	private boolean asc;
	
	public MyComparator(boolean asc) {
		this.asc = asc;
	}

	@Override
	public int compare(Community o1, Community o2) {
		// TODO Auto-generated method stub
		 if (asc){
	            if (o1.getPopulation()<o2.getPopulation()) return -1;
	            if (o1.getPopulation()>o2.getPopulation()) return 1;
	        }
	        else{
	            if (o1.getPopulation()>o2.getPopulation()) return -1;
	            if (o1.getPopulation()<o2.getPopulation()) return 1;
	           
	        }
		 return 0;
	}

}
