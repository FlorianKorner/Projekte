public class DownloadGame extends Product{
	
	private boolean isFSK16;
	private String company;
	private String genre;
	
	public DownloadGame(String title, double price, boolean isFSK16, String company, String genre) {
		super(title, price);
		this.isFSK16 = isFSK16;
		setCompany(company);
		setGenre(genre);
	}
	
	public boolean getIsFSK16() {
		return isFSK16;
	}
	public void setFSK16(boolean isFSK16) {
		this.isFSK16 = isFSK16;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		if (company.equals(null)) {
			this.company = "unknown";
			System.out.println("Error 2 (Companyname can not, not be entered");
		} else this.company = company;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		if (genre.equals(null)) {
			this.genre = "other";
			System.out.println("Error 3 (Genre can not, not be entered");
		}else if(genre.equals("Action")||
				genre.equals("Adventure")||
				genre.equals("Platform")||
				genre.equals("Fighting")||
				genre.equals("other")) {
			 this.genre = genre;
		}
		else this.genre = "other";
	}
	public double getPrice() {
		if(this.getIsFSK16()==true)return super.getPrice()*1.2;
	else return super.getPrice();
	
	}
	public String trueFalse() {
		if(this.isFSK16==true)return "IS";
		else return "IS NOT";
	}
	@Override
	public String toString() {
		return "The Game \""+super.getTitle()+
				"\" costs "+super.getPrice()+
				" EUR and "+trueFalse()+
				" a FSK 16 Game.";
	}
	public void print() {
		System.out.println(this.toString());
	}
	
	
}