package lab2;

public class MediaItem extends Item{
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public MediaItem() {
		
	}
	private MediaItem(int runtime) {
		super();
		this.runtime=runtime;
	}
	public MediaItem(int identificationNumber,String title,int numberOfCopies,int  runtime)
	{
		super(identificationNumber,title,numberOfCopies);
		this.runtime=runtime;
	}
	public String toString() {
		return super.toString()+""+runtime;
	}

}
