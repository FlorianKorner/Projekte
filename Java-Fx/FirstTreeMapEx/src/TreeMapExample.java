import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample {

	// source: https://www.tutorialspoint.com/java/java_treemap_class.htm
	/**
	 * The TreeMap class implements the Map interface by using a tree. A TreeMap
	 * provides an efficient means of: 1) storing key/value pairs 2) and allows
	 * rapid retrieval.
	 * 
	 * You should note that, unlike a hash map, a tree map guarantees that its
	 * elements will be sorted in an ascending key order.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("example 1");
		treeMapExample1();
		System.out.println("example 2");
		treeMapExample2();
		System.out.println("example 3");
		treeMapExample3();
		System.out.println("example 4");
		treeMapExample4();
	}

	public static void treeMapExample1() {
		// Create a hash map
		TreeMap<String, Double> tm = new TreeMap<>();

		// Put elements to the map
		tm.put("Zara", new Double(434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

		// Get a set of the entries
		Set<Entry<String, Double>> set = tm.entrySet();

		// Get an iterator
		Iterator<Entry<String, Double>> i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		System.out.println();

		// Deposit 1000 into Zara's account
		double balance = ((Double) tm.get("Zara")).doubleValue();
		tm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + tm.get("Zara"));
	}

	/////////////////////////////////////////////////////////////////////////
	// Custom Comparator
	/////////////////////////////////////////////////////////////////////////	
	public static class DescStringComparator  implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {

			return  (-1) * o1.compareTo(o2);
		}		
	}

	public static class  StringComparator2  implements Comparator<String> {
		
		int compFaktor; 	
		StringComparator2(boolean asc) {
			compFaktor = (asc) ? 1: -1;   //www.tutorialspoint.com/Java-Ternary-Operator-Examples
		}
		@Override
		public int compare(String o1, String o2) {
			return  compFaktor * o1.compareTo(o2);
		}		
	}
	
	public static void treeMapExample2() {
		// Create a hash map
		TreeMap<String, Double> tm = new TreeMap<>(new DescStringComparator());
		// TreeMap<String, Double> tm = new TreeMap<>(StringComparator2(true));
		
		// Put elements to the map
		tm.put("Zara", new Double(434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

		// Get a set of the entries
		Set<Entry<String, Double>> set = tm.entrySet();

		// Get an iterator
		Iterator<Entry<String, Double>> i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		System.out.println();

		// Deposit 1000 into Zara's account
		double balance = ((Double) tm.get("Zara")).doubleValue();
		tm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + tm.get("Zara"));
	}
	
	/////////////////////////////////////////////////////////////////////////
	// Custom Comparator / Custom Object
	/////////////////////////////////////////////////////////////////////////	

	public static class  PersonNameComparator  implements Comparator<Person> {
		
		int compFaktor; 	
		PersonNameComparator(boolean asc) {
			compFaktor = (asc) ? 1: -1;   
		}
		@Override
		public int compare(Person o1, Person o2) {
			return  compFaktor * o1.getName().compareTo(o2.getName());
		}		
	}

	public static class  PersonYearComparator  implements Comparator<Person> {
		
		int compFaktor; 	
		PersonYearComparator(boolean asc) {
			compFaktor = (asc) ? 1: -1;   
		}
		@Override
		public int compare(Person o1, Person o2) {
			return  compFaktor * (o1.getYearBirth() - o2.getYearBirth());
		}		
	}

	public static void treeMapExample3() {
		// Create a hash map
		//TreeMap<Person, Double> tm = new TreeMap<>(new PersonNameComparator(false));
		TreeMap<Person, Double> tm = new TreeMap<>(new PersonYearComparator(true));
		
		// Put elements to the map
		tm.put(new Person("Zara", 	2000), 	new Double(434.34));
		tm.put(new Person("Mahnaz", 2010), 	new Double(123.22));
		tm.put(new Person("Ayan", 	2001), 	new Double(1378.00));
		tm.put(new Person("Daisy", 	1990), 	new Double(99.22));
		tm.put(new Person("Qadir", 	2005), 	new Double(-19.08));

		// Get a set of the entries
		Set<Entry<Person, Double>> set = tm.entrySet();
		
		// tm.descendingKeySet(); 
		
		// Get an iterator
		Iterator<Entry<Person, Double>> i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry<Person, Double> me = (Map.Entry<Person, Double>) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		System.out.println();

		// PROBLEM: 
		// Deposit 1000 into Zara's account
		// double balance = ((Double) tm.get("Zara")).doubleValue();
		// tm.put("Zara", new Double(balance + 1000));
		// System.out.println("Zara's new balance: " + tm.get("Zara"));
	}
	
	
	public static void treeMapExample4() {
		// Create a hash map
		//TreeMap<Person, Double> tm = new TreeMap<>(new PersonNameComparator(false));
		TreeMap<Person, Double> tm = new TreeMap<>(new PersonYearComparator(true));
		
		
		HashMap<Integer, Person> persons= new HashMap<>();
		persons.put(1, new Person("Zara", 	2000));
		persons.put(2, new Person("Mahnaz", 2010));
		persons.put(3, new Person("Ayan", 	2001));
		persons.put(4, new Person("Daisy", 	1990));
		persons.put(5, new Person("Qadir", 	2005));
		
		// Put elements to the map
		tm.put(persons.get(1), 	new Double(434.34));
		tm.put(persons.get(2), 	new Double(123.22));
		tm.put(persons.get(3), 	new Double(1378.00));
		tm.put(persons.get(4), 	new Double(99.22));
		tm.put(persons.get(5), 	new Double(-19.08));

		// Get a set of the entries
		Set<Entry<Person, Double>> set = tm.entrySet();
		
		// tm.descendingKeySet(); 
		
		// Get an iterator
		Iterator<Entry<Person, Double>> i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry<Person, Double> me = (Map.Entry<Person, Double>) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		System.out.println();

		// PROBLEM: 
		// Deposit 1000 into Zara's account
		Person zara = persons.get(1);
		// zara = new Person("Zara", 	2000);
		double balance = ((Double) tm.get(zara)).doubleValue();
		tm.put(zara, new Double(balance + 1000));
		System.out.println("Zara's new balance: " + tm.get(zara));
	}
}
