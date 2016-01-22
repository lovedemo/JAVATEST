package test03;

public class people {
	String name;
	int age;
	people(){};
	people(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void myself()
	{
		System.out.println("My name is "+this.name+", age is "+this.age +".");
		
	}
	
	

}
