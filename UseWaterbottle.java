package oops1;

public class UseWaterbottle {
	public static void main(String[]args)
	{
		Waterbottle w = new Waterbottle("linon",150,"blue",true);
		Waterbottle w1= new Waterbottle("teras",500,"green",false);
		Waterbottle w2= new Waterbottle("minions",400,"pink",false);
		
		
		Waterbottle water[]={w,w1,w2};
		int count=0;
		int total=0;
	    
		for(int i=0;i<water.length;i++)
		{
			total= total+water[i].getPrice();
			
			
			
			if(water[i].getIsplastic()==true)
			{
				count++;
		
	  System.out.println(water[i].getBrand()+" "+water[i].getPrice());
			}
			
		}
		System.out.println(count);
		System.out.println(total);
		
		{
			
		}
				
				
		
		
		
	}

}
