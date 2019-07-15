package lab2;

public class Video extends MediaItem{
	private String director;
	private String genre;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private int year;
	
	public Video() {
		
	}
	public Video(String director,String genre,int year) {
		this.director=director;
		this.genre=genre;
		this.year=year;
		
	}
	public Video(int identificationNumber, String title, int numberOfCopies, int runtime,String director,String genre,int year)
	{
		super(identificationNumber,title,numberOfCopies,runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
	}
	public String toString() {
		return super.toString()+""+director+""+genre+""+year;
	}
	
}
