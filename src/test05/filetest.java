package test05;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class filetest {
	public static void main(String[] args)
	{
		String filename="abc.txt";
		fileinfo(filename);	
		
	}
	public static void fileinfo(String filename)
	{
		File f=new File(filename);
		if(f.exists())
		{
			if(f.isFile())
			{
				System.out.println("�ļ��ľ���·��Ϊ"+f.getAbsolutePath());
				Long time=f.lastModified();
			    SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");   
				System.out.println("�ļ����һ���޸�ʱ��Ϊ"+sdf.format(new Date(time)));
				System.out.println("�ļ��Ĵ�СΪ"+f.length()+"KB");
			}
			else
				System.out.println(filename+"����һ���ļ�");	
		}
		else
		{
			System.out.println(filename+"������");
		}			
	}
}
