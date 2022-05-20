/**
 * Addition to Person => Pupil, Teacher
 * 
 * @author PUZ
 * @version 2020-09-24-2EHIF
 *
 */
public class PersonList {
	
	private Person[] persons; 
	private int lastPersonIndex = -1;
	
	public PersonList(int maxNumPersons) {
		// TODO: check if maxNumPersons > 0, otherwise initialize to 10 (default)
		persons = new Person[maxNumPersons]; 		
	}
	
	public Person add(Person p) {
		if (p != null && p instanceof Person && 
			lastPersonIndex < persons.length -1 ) { // TODO: check: why "-1" here? 
			lastPersonIndex++; 
			persons[lastPersonIndex] = p;
			// USED FOR DEBUG
			System.out.println("added " + p.toString() +  
                    " , current last index=" +lastPersonIndex);
			return p; // or persons[lastPersonIndex], 
			          // points to same object in memory

		}
		else {
			System.out.println("Something went wrong, " + 
		                        "current last index=" +lastPersonIndex);
			return null; 
		}		
	}
	
	public void printPersons() {
		
		System.out.println("\n printPersons \n ************");
		
	    // TODO: why is the condition not  "i < persons.length" ? 
		for (int i=0; i <= lastPersonIndex; i++) {
			// TODO: why I do not need a check of type: 
			// "print the persons[i] only if not null)"
			System.out.println(persons[i]);
		}
	}	
	
	
}
