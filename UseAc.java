package oops1;

public class UseAc {
	public static void main(String[]args)
	{
		Compressor c= new Compressor();
		c.setBrand("xyz");
		c.setPrice(2000);
		Ac a= new Ac();
		a.setBrand("Hitachi");
		a.setPrice(45000);
		a.setWarranty(3);
		a.setCompressor(c);
		//System.out.println(a);
	System.out.println("BRAND="+a.getBrand()+" "+"PRICE="+a.getPrice()+" "+"WARRANTY="+a.getWarranty()+" "+a.getCompressor());
	}

}
