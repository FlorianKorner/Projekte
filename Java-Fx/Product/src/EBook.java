public class EBook extends Product {
	
		private String shortDesk;
		private boolean isChildrenBook;
	
	public String getShortDesk() {
		return this.shortDesk;
	}
	public void setShortDesk(String shortDesk) {
		if (shortDesk.equals(null)) {
			this.shortDesk = "unknown";
			System.out.println("Error 2 (the short deskription can not, not be entered");
		} else
			this.shortDesk = shortDesk;

	}
	public boolean isChildrenBook() {
		return this.isChildrenBook;
	}
	public void setChildrenBook(boolean isChildrenBook) {
		this.isChildrenBook = isChildrenBook;
	}
	public EBook(String title, double price, String shortDesk, boolean isChildrenBook) {
		super(title, price);
		this.shortDesk = shortDesk;
		this.isChildrenBook = isChildrenBook;
	}
	private String isTrueFalse() {
		if(this.isChildrenBook==false) return "IS";
		else return "IS NOT";
	}
	@Override
	public String toString() {
		return "The EBook '"+super.getTitle()+
				"' costs "+super.getPrice()+
				" EUR. This "+isTrueFalse()+
				" a children's\r\n"+
				"book. Description: "+
				this.shortDesk+".";
	}
	public void print() {
		System.out.println(toString());
	}
}
