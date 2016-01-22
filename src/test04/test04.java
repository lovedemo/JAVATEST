package test04;
import java.io.*;
public class test04 {
	public static void main(String[] args) {
		try {
			System.out.println("try语句开始执行,读取文件");
			readfile("a.txt");
			System.out.println("读取文件结束");	
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catch1语句执行,捕获到IOException");
			e.printStackTrace();
			System.out.println("catch1语句执行结束");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("catch2语句执行,捕获到Exception");
			e.printStackTrace();
			System.out.println("catch2语句执行结束");
		}
		finally
		{
			System.out.println("finally语句执行");
		
		}
		System.out.println("程序继续执行");
		
	}
	public static void readfile(String s)throws IOException
	{
		String buf;
		BufferedReader in=new BufferedReader(new FileReader(s)) ;
		while((buf=in.readLine())!=null)
		{
			System.out.println(buf);
			
		}
		in.close();
		
		
	}


}
