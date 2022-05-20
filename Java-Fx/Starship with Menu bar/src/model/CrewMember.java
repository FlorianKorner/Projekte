package model;


public class CrewMember extends Person {

	private String job; 		// for now,  a String
	private String race; 		// for now,  a String
	private String image;		// relative path to image
	private String link; 		// to char description 
	private String youtube; 	// optional youtube link
	private int uID;
	private static int counter = 0;
	
	public CrewMember(String name, String surname, 
			String job, String race, String image, String link, String youtube) {
		super(name, surname);
		setJob(job); 
		setRace(race);
		setImage(image);
		setLink(link);
		setYoutube(youtube);
		uID = CrewMember.counter;
		CrewMember.counter++;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	@Override
	public String toString() {
		return getName() + " " + getSurname() +  ", " + job;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((race == null) ? 0 : race.hashCode());
		result = prime * result + uID;
		result = prime * result + ((youtube == null) ? 0 : youtube.hashCode());
		return result;
	}




	public int getUID() {
		return uID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrewMember other = (CrewMember) obj;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (race == null) {
			if (other.race != null)
				return false;
		} else if (!race.equals(other.race))
			return false;
		if (uID != other.uID)
			return false;
		if (youtube == null) {
			if (other.youtube != null)
				return false;
		} else if (!youtube.equals(other.youtube))
			return false;
		return true;
	}






	
	
}
