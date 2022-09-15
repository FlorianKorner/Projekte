import java.util.ArrayList;
import java.util.Collections;

public class CommunityMangerTest {
	
	static City c1 = new City("Wien (Stadt)", 1900000, 100, "AAA"); // Vienna, AT
	static City c2 = new City("München (Stadt)", 12500000, 200, "aaa"); // München, DE
	static City c3 = new City("Vienna, Virginia", 15687, 3, "BBB");
	// https://en.wikipedia.org/wiki/Vienna,_Virginia
	static City c4 = new City("Paris (Stadt)", 2100000, 400, "CCC");
	// https://de.wikipedia.org/wiki/Paris
	static City c5 = new City("Paris (Aire urbaine)", 12500000, 500, "ÉÉÉ"); //
	static City c6 = new City("London (City)", 12500000, 6, "ÖÖÖ");
	// https://en.wikipedia.org/wiki/London
	static City c7 = new City("London (Metro)", 14250000, 700, "FFF"); //
	static City c8 = new City("London (City of London)", 8706, 9 , "ggg");
	// https://de.wikipedia.org/wiki/City_of_London
	// https://de.wikipedia.org/wiki/Liste_der_Marktgemeinden_in_Nieder%C3%B6sterreich
	static MarketCommunity mc1 = new MarketCommunity("Bisamberg", 3000, 1.1);
	static MarketCommunity mc2 = new MarketCommunity("Alland", 2000, 2.2);
	static MarketCommunity mc3 = new MarketCommunity("Absdorf", 4000, 2.2);
	static MarketCommunity mc4 = new MarketCommunity("Drösing", 1000, 2.2);
	
	public static void main(String[] args) {
		ArrayList<City> cities = new ArrayList<City>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		cities.add(c5);
		cities.add(c6);
		cities.add(c7);
		cities.add(c8);
		Collections.sort(cities); 
	}

}
