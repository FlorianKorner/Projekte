
public class Dog implements Animal, Moveable {

	@Override
	public String getAnimalSound() {
		return "WauWau";
		
		
	} 

	@Override
	public void sleep() {
		// TODO             fancy way of writing "Dog"
		System.out.println(this.getClass().getName()  + 
		           " is doing zzzzz....");
		
	}

	@Override
	public void startMoving() {
		System.out.println("Dog runs.");
		
	}

	@Override
	public void stopMoving() {
		System.out.println("Dog stops.");
		
	}
}
