/**
 * 
 * @author 	Florian Körner  
 * @version 2020-11-05	
 */
public class Location {

	@Override
	public String toString() {
		return address + ", "  + postCode;
	}

	private String address;		// "Mustergasse 10/20"
	private String postCode;	// "A-1050"
	
	public Location(String address, String postCode) {
		setAddress(address);
		setPostCode(postCode);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}



}
