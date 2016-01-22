package test05;
import java.io.*;
import java.util.Scanner;
public class fileread 
{
	public static void main(String[] args) throws IOException
	{
		String filename="收支表.txt";
		Scanner in=new Scanner(System.in);
		System.out.println("你的收支记录如下:");
		init(filename);
		String input;
		System.out.println("请输入要添加的收支记录(如2015-10-10 in 100),exit结束");
		while(!( input =in.nextLine()).equals("exit"))
		{
			System.out.println("请输入要添加的收支记录(如2015-10-10 in 100),exit结束");
			add(filename,input);	
		}
		in.close();
		
	}
	public static void init(String filename)throws IOException
	{
		
		BufferedReader bf =new BufferedReader(new FileReader(filename));
		String buf;
		while((buf=bf.readLine())!=null)
		{
			System.out.println(buf);
		}
		bf.close();
	}
	public static void add(String filename,String input) throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter(filename,true));
		bw.write(input);
		bw.flush();	
		bw.newLine();
		bw.close();
	}
	
}
