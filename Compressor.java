package oops1;

public class Compressor {
	private String brand;
	private int price;
public void setBrand(String brand)
{
	this.brand= brand;
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
public String toString()
{
	return "BRAND="+brand+" "+"PRICE="+price;
}
}
