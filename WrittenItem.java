package lab2;

import java.util.List;
import java.util.ArrayList;

public abstract class WrittenItem extends Item {
	private String author;
	public WrittenItem() {
		
	}
	public WrittenItem(String author)
	{
		super();
		this.author=author;
	}
	public WrittenItem(int identificationNumber,String title,int numberOfCopies,String author)
	{
		super(identificationNumber,title,numberOfCopies);
		this.author=author;
	}
	
	
	public String getAuthor() {
		return author;
		
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
		
	}
	
	@Override
	public void CheckOut(int indentificationNumber)
	{

}
	@Override
	public void CheckIn(int identificationnNumber)
	{
		
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
	public boolean equals(Object obj)
	{
		return false;
	}
	
}