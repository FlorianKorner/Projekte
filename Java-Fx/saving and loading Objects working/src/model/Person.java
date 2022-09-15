package model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 2L;
	
    private int 	id; 
	private String 	name;
    private String 	surname;
    private int		age; 


	private static int ID = 0; 

    @Override
    public String toString() {
        return "{"+ 
                   id 		+ ": " +
             "'" + name 	+ "'" +
           ", '" + surname 	+ "'" +
           ", '" + age 	    + "'" +             
                "}";
    }

    public Person(String name, String surname, int age) {
        this.name 		= name;
        this.surname 	= surname;
        this.age 	 	= age; 
        // automatic ID 
        Person.ID++; 
        this.id = ID;
    }

    // special constructor for file loader
    public Person(int Id, String name, String surname, int age) {
 
    	this.name 		= name;
        this.surname 	= surname;
        this.age 		= age; 
         this.id = Id;
        // NOTE: private static int ID will not be in line any more
    } 
    
    // GET / SET
	public int getId() {
		return id;
	}
	public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String  getFullName() {
    	return name + " " + surname; 
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

    


    
    
    
}