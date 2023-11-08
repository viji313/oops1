package oops1;

public class UseCar {
	public static void main(String[]args)
	{
	Engine e= new Engine();
	e.brand="v8";
	e.cc=1500;
	Car c= new Car();
	c.brand="BMW";
	c.price=180000;
	c.color="Black";
	c.mileage=10;
	c.engine=e;
	System.out.println(c.brand+" "+c.price+" "+c.color+" "+c.mileage+" "+c.engine.brand+" "+c.engine.cc);
	
	}
}
