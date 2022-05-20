import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Example code with ArrayList class & List interface
 * 
 * @author PUZ
 * @version 2020-10-12
 */
public class ArrayListTest {

	public static void main(String[] args) {
		test1();
/*		test2();
		test2a();
		test3();
		test3b();
		test3c();
		test4b();
*/
	}

	/**
	 * String as ArrayList-Elemente (without "propper" datatype definition)
	 */
	public static void test1() {

		System.out.println("\n>>>>>> test1: Strings in ArrayList");

		ArrayList colors = new ArrayList();

		colors.add("red");
		colors.add("blue");
//		colors.add(135796);
		colors.add("yellow");
		colors.add("orange");
		colors.add("green");

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}

	}

	/**
	 * ArrayList as List & data type is specified
	 */
	public static void test2() {

		System.out.println("\n>>>>>> test2: ArrayList as List & data type is specified");

		List<String> colors = new ArrayList<String>();

		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("orange");
		colors.add("green");

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i).charAt(1));
		}

	}

	public static void test2a() {

		System.out.println("\n>>>>>> test2a: same, but with class Person");

		List<Person> persons = new ArrayList<Person>();

		Person p1 = new Person("Alice", 2001);
		persons.add(p1);
		persons.add(new Person("Bob", 2002));
		persons.add(new Person("Charlie", 2003));
		persons.add(new Person("David", 2004));
		persons.add(new Person("Emilia", 2005));

		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).getName());
		}

	}

	public static void test2b() {

		System.out.println("\n>>>>>> test2b: Alternative: for-each Loop  / local var");

		List<Person> persons = new ArrayList<Person>();

		Person p1 = new Person("Alice", 2001);
		persons.add(p1);
		persons.add(new Person("Bob", 2002));
		persons.add(new Person("Charlie", 2003));
		persons.add(new Person("David", 2004));
		persons.add(new Person("Emilia", 2005));

		for (Person p : persons) {
			// "p" exists ONLY inside the for-each-loop
			System.out.println(p.getName());
		}

	}

	public static void test3() {

		System.out.println("\n>>>>>> test3: more ArrayList & List methods");

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Alice", 2001));
		persons.add(new Person("Bob", 2002));
		persons.add(new Person("Charlie", 2003));
		persons.add(1, new Person("David", 2004)); // index <= size()
		persons.add(new Person("Emilia", 2005));

		for (Person p : persons) {
			System.out.println(p);
		}

//		System.out.println(">>>>>> test3: for-each mit Logik");
//		for (Person p : persons) {
//			if (p.getName().length() > 5) {
//				System.out.println(p);
//			}
//		}
		
		
		

	}

	/**
	 *  small problems with "contains"
	 */
	public static void test3b() {
		System.out.println("\n>>>>>> test3b: contains 'not logical' ????");

		ArrayList<Person> persons = new ArrayList<Person>();
		
		Person p1 = new Person("Alice", 2001);
		Person p2 = new Person("Bob", 2002);
		Person p3 = new Person("Charlie", 2003);
		Person p4 = new Person("David", 2004); 
		Person p5 = new Person("Emilia", 2005);
		
		Person pX = new Person("Charlie", 2003);
		
		persons.add(p1); persons.add(p2); persons.add(p3); persons.add(p4); persons.add(p5);
		
		
		if (persons.contains(pX)) {
			System.out.println("pX found !!!");
		} else {
			System.out.println("pX NOT found:-( ");
			
		}

		if (persons.contains(p3)) {
			System.out.println("p3 found!!!");
			System.out.println("p3 indexOf() =" + persons.indexOf(p3));
		} else {
			System.out.println("p3 NOT found :-( ");
			
		}		
		
	}
	
	/**
	 *  more examples under: https://www.javatpoint.com/how-to-sort-arraylist-in-java 
	 */	
	public static void test3c() {

		System.out.println("\n>>>>>> test3c: Collections.sort()");

		List<String> names = new ArrayList<String>();

		names.add("Charlie");
		names.add("Emilia");
		names.add("Bob");
		names.add("David");  
		names.add("Alice");
		
		System.out.println("\n>before sorting:");
		for (String n : names) {
			System.out.println(n);
		}
		
		Collections.sort(names);
		System.out.println("\n>After sorting:");
		for (String n : names) {
			System.out.println(n);
		}
		

	}

	/**
	 * source: https://www.geeksforgeeks.org/list-interface-java-examples/
	 */
	public static void test4b() {

		System.out.println("\n>>>>>> test4: a List<smth> needs  Objects <=> no int & double");
		// Creating a list
		List<Integer> l1 = new ArrayList<Integer>();

		// Integer myInt = new Integer(102); since Java 9 depricated
		Integer myInt = 1;

		// Adds 1 at 0 index
		l1.add(0, 1);

		// Adds 2 at 1 index
		l1.add(1, 2);
		System.out.println(l1);

		// Creating another list
		List<Integer> l2 = new ArrayList<Integer>();

		l2.add(1);
		l2.add(2);
		l2.add(3);

		// Will add list l2 from 1 index
		l1.addAll(1, l2);
		System.out.println(l1);

		// Removes element from index 1
		l1.remove(1);
		System.out.println(l1);

		// Prints element at index 3
		System.out.println(l1.get(3));

		// Replace 0th element with 5
		l1.set(0, 5);
		System.out.println(l1);
	}

}
