
public class TestExceptions {

//	 https://www.liveleak.com/view?t=anRzI_1599348144

	public static void main(String[] args) {

		int a, b;
		CodeWithProblems cwp = new CodeWithProblems();
		a = 5; 
		b = 2;
		System.out.println("a/b=" + cwp.divide(a, b));
		a = 5;
		b = 0;
		System.out.println("a/b=" + cwp.divide(a, b));

		// https://www.benchresources.net/how-to-comment-and-uncomment-line-block-in-eclipse-ide/
		
//		  System.out.println("\n addressing Exceptions (basic)\n" +
//		  "---------------------------------");
//		  //////////////////////////////////////////////////// try { a = 5; b = 2;
//		  System.out.println("a/b=" + cwp.divide(a, b)); a = 5; b = 0;
//		  System.out.println("a/b=" + cwp.divide(a, b)); } catch (Exception ex) {
//		  System.out.println("Houston, we have a problem ...");
//		  System.out.println(ex.getMessage()); // from the cause
//		  System.out.println("Schould we do smth about it?"); }

		  
//		  System.out.println("\naddressing Exceptions (custom)\n" +
//		  "---------------------------------");
//		  //////////////////////////////////////////////////// try { a = 5; b = 2;
//		  System.out.println("a/b=" + cwp.divide2(a, b)); a = 5; b = 0;
//		  System.out.println("a/b=" + cwp.divide2(a, b)); } catch (Exception ex) {
//		  System.out.println("Houston, we have a problem and customized solution ...");
//		  System.out.println(ex.getMessage()); // from the cause }
//		 
	}

}
