public class Person {
	
	private String name;  
	private    int yearBirth;

	
	public Person(String name, int yearBirth) {
		super();
		this.name = name;
		this.yearBirth = yearBirth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearBirth() {
		return yearBirth;
	}
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	@Override
	public String toString() {
		return "Person [" + getName() + ", " + getYearBirth() + "]";
	}

	/////////////////////////////////////////////////////////////
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + yearBirth;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (yearBirth != other.yearBirth)
			return false;
		return true;
	}
	
	
}
