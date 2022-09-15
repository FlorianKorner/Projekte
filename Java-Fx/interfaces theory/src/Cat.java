

public class Cat implements Animal, Moveable {

	@Override
	public String getAnimalSound() {
		return "Miau";
			
	}

	@Override
	public void sleep() {
		//                fancy way of writing "Cat"
		System.out.println(this.getClass().getName()  + 
				           " is doing zzzzz....");
		
	}

	@Override
	public void startMoving() {
		System.out.println("Cat jumps.");
		
	}

	@Override
	public void stopMoving() {
		System.out.println("Cat stops.");
		
	}

}
