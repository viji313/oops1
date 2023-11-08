package oops1;

public class Address {
	private int street;
	private String area;
	private String district;
	
	public Address(int street,String area,String district)
	{
		this.street=street;
		this.area=area;
		this.district=district;
	}
	
	public void setStreet(int street)
	{
		this.street=street;
	}
	public int getStreet()
	{
		return street;
	}
	public void setArea(String area)
	{
		this.area=area;
	}
	public String getArea()
	{
		return area;
	}
	public void setDistrict(String district)
	{
		this.district=district;
	}
	public String getDistrict()
	{
		return district;
		
	}

}
