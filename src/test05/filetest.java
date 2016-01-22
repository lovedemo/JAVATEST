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
				System.out.println("文件的绝对路径为"+f.getAbsolutePath());
				Long time=f.lastModified();
			    SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");   
				System.out.println("文件最后一次修改时间为"+sdf.format(new Date(time)));
				System.out.println("文件的大小为"+f.length()+"KB");
			}
			else
				System.out.println(filename+"不是一个文件");	
		}
		else
		{
			System.out.println(filename+"不存在");
		}			
	}
}
