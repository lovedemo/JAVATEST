package test02;
class people{
	String name;
	int age;
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
public class testclass {
	
	public static void main(String[] args) {
		people p=new people("ะกร๗",15);
		p.myself();
	}

}
