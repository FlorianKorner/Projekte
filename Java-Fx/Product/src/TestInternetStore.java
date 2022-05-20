public class TestInternetStore{

	public static void main(String[] args) {
		Product p1 =new Product("Apple juice",1.34 );
		p1.print();
		System.out.println("");
		EBook eBook=new EBook(
				"Harry Potter und der Stein der Weisen",
				9.99,
				"It is a story of Harry Potter, who on his "+
				" eleventh birthday learns about\r\n his" + 
				"magical origins and from then on is a student of the British Wizard" + 
				"Boarding School Hogwarts",true);
		eBook.print();
		System.out.println("");
		EBook eBook1=new EBook("Harry Potter und der Stein der Weisen",
				9.99,
				"It is a story of Harry Potter, who on his "+
				" eleventh birthday learns about\r\n his" + 
				"magical origins and from then on is a student of the British Wizard" + 
				"Boarding School Hogwarts",false);
		eBook1.print();
		System.out.println("");
		DownloadGame dg=new DownloadGame("Metro Exodus", 50.0, true, "Epic Games Store", "other");
		DownloadGame dg1=new DownloadGame("Metro Exodus", 50.0, false, "Epic Games Store", "other");
		
		dg.print();
		System.out.println("");
		dg1.print();
		System.out.println("");
		Book book=new Book("Harry Potter und der Stein der Weisen", 9.99, 1);
		Book book1=new Book("In the tree house collection", 9.99, 10);
		book.print();
		System.out.println("");
		book1.print();
		System.out.println("");
		ProductCatalogue ProductCatalouge=new ProductCatalogue(5);
		ProductCatalouge.add(p1);
		System.out.println("");
		ProductCatalouge.add(book1);
		System.out.println("");
		ProductCatalouge.print();
		System.out.println("");
		ProductCatalouge.getCheapestProduct();
		
	}
}
