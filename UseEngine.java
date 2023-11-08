package oops1;

public class UseEngine {
	public static void main(String[]args)
	{
		Engines e1= new Engines("xyz",12000,"gyt");
		Cars c1= new Cars("BMW",100000,"suv",e1);
		System.out.println(c1);
		
	}

	
}
