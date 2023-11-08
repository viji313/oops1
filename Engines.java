package oops1;

public class Engines {

		private String brand;
		private int price;
		private String engineDisplacement;
		
		public Engines (String brand,int price,String engineDisplacement)
		{
			this.brand=brand;
			this.price=price;
			this.engineDisplacement=engineDisplacement;
			
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
		public String getPrice()
		{
			return brand;
		}
		public void setEngine(String engineDisplacement)
		{
			this.engineDisplacement=engineDisplacement;
		}
		public String getEngine()
		{
			return engineDisplacement;
		}
		public String toString()
		{
			return "Brand:"+" "+brand+" "+"Price:"+price+" "+"Engine Displacement:"+ engineDisplacement;
		}
		

	}



