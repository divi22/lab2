package lab2;
import java.util.ArrayList;
import java.util.List;

public class Book extends WrittenItem {
	public Book() {
		super();
		
		
	}
	public Book(int identificationNumber,String title,int numberOfCopies,String author)
	{
		super(identificationNumber,title,numberOfCopies,author);
	}
	
	@Override 
	public String toString() {
		return super.toString();
	}
	
	@Override 
	public void print()
	{
		
	}
	
	@Override 
	public List<String> addItem()
	{
		List<String> list=new ArrayList<>();
		return list;
		
	}
	
	@Override 
	public boolean equals(Object obj) {
		return false;
	}
	

}
