import java.util.ArrayList;

/**
 * @author 	Florian Körner  
 * @version 2020-11-05	
 * comment/uncomment Strg+Shift+7
 */
public class JobMarketTest {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.1:Praktikum");

		Internship p1 = new Internship("Prakt1", "write some promotion material", new String[] { "Word", "Excel" }, // skills
				10.0, // hours per week
				"A-1001"); // post code
		Internship p2 = new Internship("Prakt2", "do some java programming", new String[] { "Java" }, 11, "A-1002");
		System.out.println(p1);
		System.out.println(p2);

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.2: IT Jobs");

		ITJob it1 = new ITJob("ITJob1", "Database Programming", // name & desc
				new String[] { "Java", "SQL" },                 // skills
				40,                                             // hours per week
				new Location("Kleine-Gasse 1", "A-1001"),       // Location(address, postCode)
				700.0);                                         // payment (Double autoboxing)
 
		ITJob it2 = new ITJob("ITJob2", "Web Programming",      // name & desc
				new String[] { "JavaScript", "HTML", "CSS" },   // skills
				20,                                             // hours per week
				new Location("Linke-Gasse 2", "A-1002"),        // Location(address, postCode)
				500.0);                                         // payment (Double autoboxing)

		ITJob it3 = new ITJob("ITJob3", "Field Support",           // name & desc
				new String[] { "FÃ¼hrerschein", "C++", "SIMATIC" }, // skills
				10,                                                // hours per week
				new Location("Linke-Gasse 3", "A-1002"),           // Location(address, postCode)
				500.0);                                            // payment (Double autoboxing)

		System.out.println(it1);
		System.out.println(it2);
		System.out.println(it3);

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.3: IT Jobs");

		ManagementJob m1 = new ManagementJob("Manager1", "Abteilungsleiter1", // name & desc
				new String[] { "MS-Office", "ITIL" }, // skills
				20, // hours per week
				new Location("Groesse-Gasse 1", "A-1003"), // Location(address, postCode)
				700.0); // payment (Double autoboxing)

		ManagementJob m2 = new ManagementJob("Manager2", "CEE Teamleiter", // name & desc
				new String[] { "Verkaufserfahrung CEE", "Java" }, // skills
				20, // hours per week
				new Location("Linke-Gasse 2", "A-1002"), // Location(address, postCode)
				500.0); // payment (Double autoboxing)

		System.out.println(m1);
		System.out.println(m2);

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.4: JobMarket");
		JobMarket jm = new JobMarket();
		jm.addJob(p1);
		jm.addJob(p2);
		jm.addJob(it1);
		jm.addJob(it2);
		jm.addJob(it3);
		jm.addJob(m1);
		jm.addJob(m2);
		jm.listAllJobs();

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.4: getHourlyRate");

		try {
			Double it1P = it1.getHourlyRate();

			Double it2P = it2.getHourlyRate();
			Double it3P = it3.getHourlyRate();
			Double m1P = m1.getHourlyRate();
			Double m2P = m2.getHourlyRate();

			System.out.println("it1=" + it1P + " > " + ITJob.MIN_HOURLY_RATE + " EUR/h");
			System.out.println("m11=" + m1P + " > " + ManagementJob.MIN_HOURLY_RATE + " EUR/h");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.5: getHourlyRate: check exceptions");
		// Job with "bad" hourly rate and/or hours per week
		ITJob itX = new ITJob("ITX Job", "Database Programming", // name + desc
				new String[] { "Java", "SQL" }, // skills
				40, // hours per week
				new Location("Kleine-Gasse 1", "A-1001"), // Location(address, postCode)
				100.0); // payment (Double autoboxing)
		ManagementJob mY = new ManagementJob("Manager Y", "underpaid Teamleiter", // name + desc
				new String[] { "Verkaufserfahrung CEE" }, // skills
				80, // hours per week
				new Location("Linke-Gasse 2", "A-1002"), // Location(address, postCode)
				100.0); // payment (Double autoboxing)

		try {

			// jobs with error, remove comments to test MinHourlyRateException
			// Double itXP = itX.getHourlyRate();
			// Double mYP = mY.getHourlyRate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.6: getJobsWithPostCode(\"A-1002\")");
		ArrayList <Job> postCodeJobs = jm.getJobsWithPostCode("A-1002");
		for (Job j : postCodeJobs) {
			System.out.println(j);
		}

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.7: listITJobs()");
		jm.listItJobs();
		
		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.8: listAllJobsWithSkill(Java)");
		jm.listAllJobsWithSkill("Java");
		

		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.9: findBestHourlyRateJob() ");
		PayableJob bestPaid = jm.findBestHourlyRateJob();
		System.out.println("bestPaid=" + bestPaid);
		
		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nTEST-1.10: getJobsWithWeeklyPayment > 600");
		ArrayList <PayableJob> weekPaid600 = jm.getJobsWithWeeklyPayment(600);
		for (PayableJob pj : weekPaid600) {
			System.out.println(pj);
		}
		
		
	}

}
