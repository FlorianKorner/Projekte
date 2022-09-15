
public class Company {
	private String name;
	private int numberOfElements=20;
	Worker[] Worker = new Worker[numberOfElements];

	public Company(String name) {
		setName(name);
	}
	public int searchForDuplicateInteger(Worker worker) {
		int pos=0;
		for(int i=0;Worker[pos]!=worker;i++) {
			if(Worker[i].equals(worker)) {
				pos=i;
				return pos;
			}
		}
		return 0;
		
		
	}
	public boolean searchForDuplicate(Worker worker) {
		for(int i=0;i<numberOfElements;i++) {
			if(Worker[i].equals(worker)) return true;
		}
		return true;
	}

	public Worker setElement(Worker worker,int pos) {
		if(this.searchForDuplicate(worker)==false) {
		
		if(worker!=null && pos>0 && Worker[pos]==null) {
			Worker[pos]=worker;
			return Worker[pos];
		}
		else {
			System.out.println("Eror 10 either the position where you want to insert a Worker is not empty or the variable pos is 0 or smaler");
			if(pos>0)return Worker[pos];
			else return null;
			}
		}else {
			System.out.println("Eror 9 there is a duplicate of worker");
			if(pos>0)return Worker[pos];
			else return Worker[searchForDuplicateInteger(worker)];
			}
	}
	public Worker removeElement(int pos) {
		if(pos>-1) {
		Worker w=Worker[pos];
		Worker[pos]=null;
		return w;
		}
		System.out.println("Error 11 pos must be bigger than -1");
		return null;
	}
	
//	public boolean dismiss(String ssnr)
//	do not understand what the method should do
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() <= 0) {
			this.name = "Unknown";
			System.out.println("Error 8 invalid companyName was inputted");
		} else {
			this.name = name;
		}
	}
	public void printSalary(float salary) {
		if(salary>0) {
			for(int i=0;i<numberOfElements;i++) {
				if(salary==Worker[i].calcSalery())System.out.println("Salary of "+Worker[i].getName()+"is payed "+Worker[i].calcSalery());
			}
		}else {
			for(int i=0;i<numberOfElements;i++) {
				System.out.println("Salary of "+Worker[i].getName()+"is payed "+Worker[i].calcSalery());
			}
		}
	}
		public void printWorkers(boolean deptmtHeadsOnly){
			if(deptmtHeadsOnly==false) {
				for(int i=0;i<numberOfElements;i++) {
					Worker[i].printInfo();
				}
			}else {
				for(int i=0;i<numberOfElements;i++) {
					if(Worker[i] instanceof DepartmentHead)Worker[i].printInfo();
				}
				}
			}
		public Worker findWorker(String name) {
			if(name!=null&&name.length()>0) {
				for(int i=0;i<numberOfElements;i++) {
					if(Worker[i].getName().equals(name))return Worker[i];
				}
				System.out.println("Worker with name "+name+" has not been found!");
				return null;
			}else return null;
		}
}