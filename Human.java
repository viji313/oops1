package oops1;

public class Human {
	String name;
	int age;
	String gender;
	Address address;
	public Human(String name, int age,String gender,Address address)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAddress(Address address)
	{
		this.address= address; 
	}
	public Address getAddress()
	{
		return address;
		}
	}


