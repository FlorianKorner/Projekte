import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		test0A();
		System.out.println();
		test0B();
		System.out.println();
		test0C();
		System.out.println();
		test1A();
		System.out.println();
		test1B();
		
	}
	public static void test0A() {
		ArrayList<String> CityName =new ArrayList<String>();
		CityName.add("Eisenstadt");
		CityName.add("Wien");
		CityName.add("Graz");
		CityName.add("Krems");
		CityName.add("Linz");
		CityName.add("Steyr");
		System.out.println("All city names:");
		System.out.println("=================");
		//Person p : persons
		for(String c : CityName) {
			System.out.print("-");
			System.out.println(c);
		}
	}
	public static void test0B() {
		ArrayList<String> CityName =new ArrayList<String>();
		CityName.add("Eisenstadt");
		CityName.add("Wien");
		CityName.add("Graz");
		CityName.add("Krems");
		CityName.add("Linz");
		CityName.add("Steyr");
			
		ArrayList<Integer> Citytemperatures =new ArrayList<Integer>();
		Citytemperatures.add(7);
		Citytemperatures.add(10);
		Citytemperatures.add(8);
		Citytemperatures.add(4);
		Citytemperatures.add(13);
		Citytemperatures.add(-3);
		
		System.out.println("All city names and max. temperatures today:");
		System.out.println("============================================");
		//Person p : persons
		System.out.print("-");
		System.out.print(CityName.get(0));
		System.out.print("		");
		System.out.print(Citytemperatures.get(0));
		System.out.println(" Celsius");
		for(int i=1;i<6;i++) {
			System.out.print("-");
			System.out.print(CityName.get(i));
			System.out.print("			");
			System.out.print(Citytemperatures.get(i));
			System.out.println(" Celsius");
		}
	} 
	
	public static void test0C() {
		CityForTestmethods_Part1 eisenstadt =new CityForTestmethods_Part1("Eisenstadt",7);
		CityForTestmethods_Part1 wien =new CityForTestmethods_Part1("Wien",10);
		CityForTestmethods_Part1 graz =new CityForTestmethods_Part1("Graz",8);
		CityForTestmethods_Part1 krems=new CityForTestmethods_Part1("Krems",4);
		CityForTestmethods_Part1 linz =new CityForTestmethods_Part1("Linz",13);
		CityForTestmethods_Part1 steyr=new CityForTestmethods_Part1("Steyr",-3);
		ArrayList<CityForTestmethods_Part1> CityForTestmethods_Part1s =new ArrayList<CityForTestmethods_Part1>();
		CityForTestmethods_Part1s.add(eisenstadt);
		CityForTestmethods_Part1s.add(wien);
		CityForTestmethods_Part1s.add(graz);
		CityForTestmethods_Part1s.add(krems);
		CityForTestmethods_Part1s.add(linz);
		CityForTestmethods_Part1s.add(steyr);
		System.out.println("All city names and max. temperatures today (object ArrayList):");
		System.out.println("================================================================");
		for(CityForTestmethods_Part1 c : CityForTestmethods_Part1s) {
			c.print();
		}
	}
		public static void test1A() {
			ArrayList<String> CityName =new ArrayList<String>();
			CityName.add("Eisenstadt");
			CityName.add("Wien");
			CityName.add("Graz");
			CityName.add("Krems");
			CityName.add("Linz");
			CityName.add("Steyr");
			
			System.out.println("All city names not ordered:");
			System.out.println("===========================");
			
			for(String c : CityName) {
				System.out.print("-");
				System.out.println(c);
			}
			System.out.println();
			Collections.sort(CityName);
			System.out.println("All city names ordered:");
			System.out.println("===========================");
			
			for(String c : CityName) {
				System.out.print("-");
				System.out.println(c);
			}
			}
		public static void test1B() {
			
			ArrayList<String> Cities1 =new ArrayList<String>();
			Cities1.add("Wien");
			Cities1.add("Eisenstadt");
			Cities1.add("Wiener_Neustadt");
			Cities1.add("Graz");
			Cities1.add("Bregenz");
			Cities1.add("St_Pölten");
			
			ArrayList<String> Cities2 =new ArrayList<String>();
			Cities2.add("Mödling");
			Cities2.add("Mürzzuschlag");
			Cities1.addAll(Cities2);
			
			System.out.println("All city names merged:");
			System.out.println("===========================");
			
			for(String c : Cities1) {
				System.out.print("-");
				System.out.println(c);
			}
			System.out.println(Cities1.indexOf("Mödling"));
			Cities1.remove(3);
			Cities1.remove(Cities1.indexOf("Mödling"));
			ArrayList<String> CitiesToDelete = new ArrayList<String>();
			CitiesToDelete.add("Eisenstadt");
			CitiesToDelete.add("Wiener Neustadt");
			CitiesToDelete.add("Mödling");
			System.out.println("All cities to delete:");
			System.out.println("===========================");
			
			for(String c : CitiesToDelete) {
				System.out.print("-");
				System.out.println(c);
			}
		}
		
	
	}

