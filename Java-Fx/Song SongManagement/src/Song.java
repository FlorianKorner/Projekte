/*This Programm can only work when opperating a Windows System (checks if the file begins with "C:\\"
*/
public class Song {
	String title;
	String artist;
	String file;
	long duration;

	public Song() {
		setTitle("unknown");
		setArtist("unknown");
		setFile("C:\\Desktop");
		setDuration(RandomBetween100And500());
	}

	public Song(String title, String artist, String file, long duration) {
		setTitle(title);
		setArtist(artist);
		setFile(file);
		setDuration(duration);
	}

	public Song(String title, String artist) {
		setTitle(title);
		setArtist(artist);
		setFile("C:\\Desktop");
		setDuration(RandomBetween100And500());
	}

	public String getTitle() {
		System.out.println(this.title);
		return title;
	}

	public void setTitle(String title) {
		if (title.equals(null)) {
			this.title = "unknown";
			System.out.println("Error 1 (title can not, not be entered");
		} else
			this.title = title;
	}

	public String getArtist() {
		System.out.println(this.artist);
		return artist;
	}

	public void setArtist(String artist) {
		if (artist.equals(null)) {
			this.artist = "unknown";
			System.out.println("Error 2 (Artist can not, not be entered");
		} else
			this.artist = artist;
	}

	public String getFile() {
		System.out.println(this.file);
		return this.file;
	}

	public void setFile(String fileName) {
		if (fileName.equals(null) || (fileName.charAt(1) == ':' && fileName.charAt(0) == 'C'
				&& fileName.charAt(2) == '\\' && fileName.charAt(3) == '\\')) {
			this.file = "fileName";
			System.out.println("Error 3 (fileName can not, not be entered");
		} else
			this.file = fileName;

	}

	public long getDuration() {
		System.out.println(this.duration);
		return duration;
	}

	public int RandomBetween100And500() {
		return (int) (Math.random() * 400 + 100);

	}

	public void setDuration(long duration) {
		if (duration == 0) {
			this.duration = RandomBetween100And500();
			System.out.println("Error 4 (duration can not, not be entered");
		} else
			this.duration = duration;
	}

	public double durationInMin() {
		double d;
		d = (double) duration / 60;
		return d;
	}

	public String toString() {
		// Hallo test teset"
		String[] splitted = this.artist.split(" ");
		String surname = splitted[splitted.length - 1];
		String firstName= splitted[0];
		return "Song title= " + "\"" + title + "\"" + ", artist= " 
				+ "\"" 	+ firstName+ surname.toUpperCase() 
				+ "\"" + ", file= " + "\"" + file+ "\"" + ", duration= " 
				+ "\"" + duration + "\"" + "s/" + durationInMin() + "min";
	}
	
	public void print() {
		System.out.println(toString());
	}
}
