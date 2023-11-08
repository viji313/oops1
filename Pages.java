package oops1;

public class Pages {
	private int noOfPages;
	private int thickness;
	public Pages(int noOfPages,int thickness)
	{
		this.noOfPages=noOfPages;
		this.thickness=thickness;
		
	}
	
	public void setNoofpages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	public int getNoOfpages()
	{
		return noOfPages;
		
	}
	public void setThickness(int thickness)
	{
		this.thickness=thickness;
		
	}
	public int getThickness()
	{
		return thickness;
	}


}
