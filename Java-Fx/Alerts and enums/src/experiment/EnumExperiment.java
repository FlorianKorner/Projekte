package experiment;

import java.util.ArrayList;

/**
 * Simple Enum examples / Einfache Enum-Beispiele
 * 
 * Sources: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 * 
 * @author PUZ
 * @version 2021-02-11
 */
public class EnumExperiment {

	public static void main(String[] args) {
		Day today;

		today = Day.WEDNESDAY;
		System.out.println("today=" + today); // toString() do the magic behind the scene
											  // toString() macht die Magie im Hintergrund.
		// build logic / if-else Logik aufbauen
		if (today == Day.MONDAY) {
			System.out.println("Back to school :-(");
		} else {
			System.out.println("I fell OK");
		}

		// convert string to Enum value / String in Enum-Wert umwandeln
		Day anotherDay = Day.valueOf("SUNDAY");
		System.out.println("anotherDay =" + anotherDay);

		switch (anotherDay) {
		case MONDAY: // no need for Day.MONDAY / kein Bedarf für Day.MONDAY
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}

		// you can use Enum in an array or list as type definition
		// Enum in einem Array oder einer Liste als Typ-Definition verwenden
		ArrayList<Day> todoReminder = new ArrayList<>();
		Day d1 = Day.MONDAY;
		Day d2 = Day.WEDNESDAY;

		todoReminder.add(d1);
		todoReminder.add(d2);
		todoReminder.add(Day.SATURDAY);

		for (Day d : todoReminder) {
			System.out.printf("I need to buy milk on %s \n", d);
		}

		// More: try the Planet example here
		// Mehr: Probieren Sie das Planet-Beispiel hier aus:
		// https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

	}

}
