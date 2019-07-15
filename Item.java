package lab2;
import java.util.List;
import java.util.ArrayList;

public abstract class Item {
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	
public Item() {
		
	}
	

public Item(int identificationNumber,String title,int numberOfCopies) {
	super();
	this.identificationNumber=identificationNumber;
	this.title=title;
	this.numberOfCopies=numberOfCopies;
}

	
	int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
	
	@Override
	public String toString()
	{
		return title+""+identificationNumber+""+numberOfCopies;
	}
	
	public void CheckOut(int identificationNumber) {
		
	}
	
    public void CheckIn(int identificationNumber) {
		
	}
    public void print() {
    	
    }
    public List<String> addItem()
	{
		List<String> list=new ArrayList<>();
		return list;
	}
	
	@Override 
	public boolean equals(Object obj)
	{
		return false;
	}
	
}



