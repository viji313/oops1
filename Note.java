package oops1;

public class Note {
	private String brand;
	private int price;
	private Pages page;
	
	public Note(String brand,int price,Pages page)
	{
		this.brand=brand;
		this.price=price;
		this.page=page;
	}
	
public void setBrand(String brand)
{
	this.brand=brand;
}
public String getBrand()

{
	return brand;
}
public void setPrice(int price)
{
	this.price=price;
}
public int getPrice()
{
	return price;
}
public void setPages(Pages page)
{
	this.page=page;
}
public Pages getPages()
{
	return page;
	
}
//public String toString()
//{
//	return "BRAND="+" "+brand+" "+"PRICE="+price+;
//}


}
