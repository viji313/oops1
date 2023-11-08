package oops1;

public class UseNote {
	public static void main(String[]args)
	{
		Pages p= new Pages(160,5);
		//p.setNoofpages(160);
		//p.setThickness(5);
		
		
		Note n1= new Note("classmate",60,p);
		n1.setBrand("classmate");
		n1.setPrice(60);
		n1.setPages(p);
		n1.setBrand("class");
		System.out.println("BRAND="+" "+n1.getBrand()+ "PRICE="+" "+n1.getPrice()+ "PAGES="+" "+n1.getPages().getNoOfpages()+" "+n1.getPages().getThickness());
		
	}

}
