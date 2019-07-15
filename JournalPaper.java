package lab2;

public class JournalPaper extends WrittenItem{
	private String yearPublished;

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public JournalPaper() {
		super();
	}
	
	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author,String yearPublished)
	{
		super(identificationNumber,title,numberOfCopies,author);
		this.yearPublished=yearPublished;
	}
	public JournalPaper(String yearPublished) {
		super();
		this.yearPublished=yearPublished;
	}
	public String toString() {
		return super.getAuthor()+""+yearPublished;
	}
	

}
