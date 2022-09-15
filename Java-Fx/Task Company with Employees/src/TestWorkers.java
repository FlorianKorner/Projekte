
public class TestWorkers {

	public static void main(String[] args) {
		Employee employee1 = new Employee("John Doe", "12345678", 1500f);
		Employee employee2 = new Employee("Darwin Kaplan", "87654321", 1501f);
		System.out.println("Test of print (employee1):");
		employee1.print();
		System.out.println("Test of print (employee2):");
		employee2.print();
		System.out.println();
		System.out.println("Test of print (employee1):");
		PartTimeEmployee partTimeEmployee1=new PartTimeEmployee("John Doe (part time)", "12345679", 20f);
		System.out.println("There should be an Error message below:");
		PartTimeEmployee partTimeEmployee2=new PartTimeEmployee("Darwin Kaplan (part time)", "12345680",35f);
		System.out.println("Testing the printmethod of \"partTimeEmployee\":");
		partTimeEmployee1.print();
		System.out.println();
		DepartmentHead departmentHead1 =new DepartmentHead("Robert Wallenstein", "12345681", 5000f,30);
		System.out.println("There should be an Error message below:");
		DepartmentHead departmentHead2 =new DepartmentHead("Robert Wallenstein", "12345681", 5000f,0);
		departmentHead1.print();
		System.out.println();
		ContractWorker contractWorker1=new ContractWorker("Martin Rangelov", "12345682", 20f, 15f);
		System.out.println("Error 7 expected");
		contractWorker1.setHourlyWage(-1f);
		System.out.println("Error 6 expected");
		contractWorker1.setMonthlyHours(-1f);
		ContractWorker contractWorker2=new ContractWorker("Martin Rangelov", "12345682", 20f, 15f);
		contractWorker2.print();
		System.out.println();
		System.out.println("Testing the interface:");
		System.out.println("As all the interface methods are the same I only test them in one class!");
		employee1.attendedTraining("programming");
		employee1.attendedTraining("writing");
		System.out.println(employee1.allQualifications());
		System.out.print(employee1.qualifiedFor("programming"));
		
		
	}

}
