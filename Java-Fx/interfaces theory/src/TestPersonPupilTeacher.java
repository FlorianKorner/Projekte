
public class TestPersonPupilTeacher {

	public static void main(String[] args) {
		
		System.out.println("20200929 - abstract, interface, constant");
		System.out.println("========================================");
		
		// abstract classes do not allow  
		// creation of objects !!!
		Person pX = new Person("John", "Lennon", 1940);
		
		// Pupil
		Pupil   pA = new Pupil("John",    "Doe",    2005, "2DHIF");
		System.out.println(pA); 		
/*		System.out.println("pA experience (year) =" + 
		                    pA.getYearsOfProgrammingExperience()); 
		System.out.println("pA experience (months) =" +
		           pA.getMonthsOfProgrammingExperience());		
*/		// 
		Teacher tX = new Teacher("Peter", "Parker", 1995, 1);
		System.out.println(tX); 
/*		System.out.println("tX experience (year) =" +
				           tX.getYearsOfProgrammingExperience());
		System.out.println("tX experience (months) =" +
		           			tX.getMonthsOfProgrammingExperience());
*/
		
	
	}

}
