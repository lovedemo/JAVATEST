package test04;
import java.io.*;
public class test04 {
	public static void main(String[] args) {
		try {
			System.out.println("try��俪ʼִ��,��ȡ�ļ�");
			readfile("a.txt");
			System.out.println("��ȡ�ļ�����");	
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catch1���ִ��,����IOException");
			e.printStackTrace();
			System.out.println("catch1���ִ�н���");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("catch2���ִ��,����Exception");
			e.printStackTrace();
			System.out.println("catch2���ִ�н���");
		}
		finally
		{
			System.out.println("finally���ִ��");
		
		}
		System.out.println("�������ִ��");
		
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
