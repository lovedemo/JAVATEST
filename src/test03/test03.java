package test03;
import java.util.Scanner;
class student extends people
{
	String name;
	int age;
	student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void myself()
	{
		System.out.println("My name is "+this.name+", age is "+this.age +".");
	}
	
}
class teacher extends people
{
	String name;
	int age;
	teacher(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void myself()
	{
		System.out.println("I'm a teacher");
	}
	


}
public class test03 {
	public static void main(String[] args) {
		
		String s=null;
		people p=null;
		Scanner in=new Scanner(System.in);
		System.out.println("请输入类别");
		s=in.nextLine();
		if(s.equals("student"))
			p=new student("小红",17);
		if(s.equals("teacher"))	
			p=new teacher("小红",17);
		p.myself();
		in.close();
		
	}
	

}
