package oops1;

public class Cars {
	private String brand;
	private int price;
	private String model;
	private Engines engine;
	
public Cars (String brand,int price,String model,Engines engine)//constructor
{
	this.brand=brand;
	this.price=price;
	this.model=model;
	this.engine=engine;
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
public void setModel(String model)
{
	this.model=model;
}
public String getModel()
{
	return model;
}
public void setEngine(Engines engine)
{
	this.engine=engine;
}
public Engines getEngine()
{
	return engine;
}
public String toString()
{
	return "Brand:"+brand+" "+"price:"+price+" "+"Model:"+model+"Engine:"+engine;
}
}
