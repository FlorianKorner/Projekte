
public class TestPersonPupilTeacher {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Pupil pA = new Pupil("John", "Doe"       , 2005, "2DHIF");
		Pupil pB = new Pupil("Max",  "Mustermann", 2006, "2EHIF");
		
		System.out.println(pA); // calling Pupil.toString()
		System.out.println(pB);
		
		Teacher tX = new Teacher("Peter", "Parker", 1995, 1);
		System.out.println(tX); // calling Teacher.toString()
		
		// Polymorphie / polymorphy: 
		// I can save a Teacher or Student objects` reference 
		// in a Person-variable
		// and THEN call the appropriate method of a  Person reference
		System.out.println("** die Polymorphie (eng. polymorphy) *******");
		Person p1 = new Teacher("Lex", "Luthor", 1980, 1);
		Person p2 = new Pupil("Clark",  "Kent", 2005, "2AHIF");

		System.out.println(p1); // calling Teacher.toString()
		System.out.println(p2); // calling Pupil.toString()
		
		
		
	}

}
