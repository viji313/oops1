package oops1;

public class Waterbottle {
	 String brand;
	 int price;
	 String color;
  boolean isPlastic;
	
	public Waterbottle(String brand,int price,String color,boolean isPlastic)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isPlastic=isPlastic;
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
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setPlastic(boolean isplastic)
	{
		this.isPlastic=isPlastic;
		
	}
	public boolean getIsplastic()
	{
		return isPlastic;
	}

}
