package oops1;

public class Ink {
	private String brand;
	private int price;
	int discountper;
	int taxper;
	
	public Ink (String brand,int price,int discountper,int taxper)
	{
		this.brand=brand;
		this.price=price;
		this.discountper=discountper;
		this.taxper=taxper;
	}
	public String findNetprice(int price,int discountper,int taxper)
	{
		int netPrice=price+(price*taxper/100)-(price*discountper/100);
		return "Netprice"+" "+netPrice;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
		
	}
	public String getBrand()
	{
		return brand;
	}
	}


