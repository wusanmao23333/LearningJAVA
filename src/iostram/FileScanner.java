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
		//F:\\ѧϰ
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
			
			System.out.println("��Ŀ¼�¶��������" + Filelist.length + "��¼��Filebin.txt��");
			
			for (int i = 0; i < Filelist.length; i++) {
				 if (!Filelist[i].isFile()) {
					 cal.setTimeInMillis(Filelist[i].lastModified());
					 String s = df.format(cal.getTime());	
			         inFile.write("�ļ��У�" + Filelist[i] + "\t�޸����ڣ�" + s + "\t�ļ���С��" + Filelist[i].length()*1.0/1024 + "KB" + "\n");
				 } 
			}
			
			for (int i = 0; i < Filelist.length; i++) {
				 if (Filelist[i].isFile()) {
					 cal.setTimeInMillis(Filelist[i].lastModified());
					 String s = df.format(cal.getTime());
					 inFile.write("�ļ���" + Filelist[i] + "\t�޸����ڣ�" + s + "\t�ļ���С��" + Filelist[i].length()*1.0/1024 + "KB" + "\n");
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