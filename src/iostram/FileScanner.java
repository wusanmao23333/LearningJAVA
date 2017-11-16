package iostram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class FileScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//F:\\学习
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter FilePath: ");
			String str = scan.nextLine();
			File file = new File(str);
	      	FileWriter  inFile = new FileWriter("src/Filebin.txt"); 
			scan.close();
			File[] Filelist = file.listFiles();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			
			System.out.println("该目录下对象个数：" + Filelist.length + "记录到Filebin.txt里");
			
			for (int i = 0; i < Filelist.length; i++) {
				 if (!Filelist[i].isFile()) {
					 cal.setTimeInMillis(Filelist[i].lastModified());
					 String s = df.format(cal.getTime());	
			         inFile.write("文件夹：" + Filelist[i] + "\t修改日期：" + s + "\t文件大小：" + Filelist[i].length()*1.0/1024 + "KB" + "\n");
				 } 
			}
			
			for (int i = 0; i < Filelist.length; i++) {
				 if (Filelist[i].isFile()) {
					 cal.setTimeInMillis(Filelist[i].lastModified());
					 String s = df.format(cal.getTime());
					 inFile.write("文件：" + Filelist[i] + "\t修改日期：" + s + "\t文件大小：" + Filelist[i].length()*1.0/1024 + "KB" + "\n");
				 } 
			}    
            inFile.close();
		} catch (Exception e) {
			System.out.println(e.toString()); 
		}
		try {
			FileReader fr = new FileReader("src/Filebin.txt");
			//create BufferedReader class
			BufferedReader bufr = new BufferedReader(fr);
			String s = null;
			int i = 0;
			System.out.println("Filebin.txt : ");
			while ((s = bufr.readLine()) != null) {
				i++;
				System.out.println(s);
			}
			bufr.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}