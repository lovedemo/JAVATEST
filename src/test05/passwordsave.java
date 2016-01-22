package test05;
import java.io.*;
import java.util.Scanner;


public class passwordsave {

	public static void main(String[] args) throws IOException {
		String filename="password";
		Scanner in =new Scanner(System.in);
		System.out.println("以下是之前加密的密码:");
		read(filename);
		System.out.println("请输入新的密码");
		String s=in.nextLine();
		write(filename,s);	
		in.close();	
	}
	public static void read(String filename) throws IOException
	{
		byte[] b=new byte[1024];
		int num;
		BufferedInputStream bf=new BufferedInputStream(new FileInputStream(filename));
		while((num=bf.read(b))!=-1)
			while(num>0)
			{
				b[num-1]+=1;
				num--;
			}			
		String s=new String(b);
		System.out.println(s);
		bf.close();
	}
	public static void write(String filename,String s) throws IOException
	{
		byte[] b=s.getBytes();
		for(int i=b.length-1;i>=0;i--)
			b[i]-=1;		
		BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream(filename,false));
		bf.write(b);
		bf.flush();
		bf.close();
	}
}
