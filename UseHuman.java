package oops1;

public class UseHuman {
	public static void main(String[]args)
	{
		Address ad= new Address(5,"T-nagar","coimbatore" );
		Human h=new Human("dhiya",25,"female",ad);
		System.out.println("NAME="+h.getName()+"AGE="+h.getAge()+"GENDER="+h.getGender()+h.getAddress().getStreet()+h.getAddress().getArea());
		
	}

}
