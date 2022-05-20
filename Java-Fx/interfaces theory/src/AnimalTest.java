
public class AnimalTest {

	public static void main(String[] args) {
		 Cat         c = new Cat();
		 Dog         d = new Dog(); // Animal d = new Dog(); 
		                            // also possible (just like the abstract classes)
		 
		 System.out.println(c.getAnimalSound());
		 c.sleep();
		 System.out.println(d.getAnimalSound());
		 d.sleep();
		 System.out.println("****** NEW INTERFACE *********");
		 c.startMoving();
		 c.stopMoving();
		 d.startMoving();
		 d.stopMoving();	 	
		 

	}

}
