
public class BadNumberException extends Exception {

	/**
	 *  Java needs this variable for all classes that implement/extends Serializable
	 *  BONUS: 
	 *  https://javabeginners.de/Ein-_und_Ausgabe/Was_ist_eine_SerialVersionUID.php 
	 *  https://www.geeksforgeeks.org/serialversionuid-in-java/ 
	 */
	private static final long serialVersionUID = 1L;

	public BadNumberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println("new Bad Number Exception was created ... ");
		// we can do a lot of fancy work, this time just: 
		//super.printStackTrace();
		System.out.println("... but we can continue with catch:");		
	}



}
