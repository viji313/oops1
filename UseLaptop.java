package oops1;

public class UseLaptop {
	public static void main(String[]args)
	{
		HardDisk h= new HardDisk();
		h.brand="xyz";
		h.storage=256;
		Laptop l= new Laptop();
		l.brand="lenova";
		l.price=19000;
		l.color="black";
		l.harddisk= h;
		//System.out.println(l.brand+" "+l.price+" "+l.color+" "+l.harddisk.brand+" "+l.harddisk.storage);
		System.out.println(l);
	}

}
