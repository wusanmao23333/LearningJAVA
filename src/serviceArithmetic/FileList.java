package serviceArithmetic;
/**
 * �ļ�������
 * author by zugen
 * data: 2017/11/1
 */
import java.io.*;
import java.util.*;

public class FileList {

	public static int randomTime() {
		int[] time = {6,2,1,3,9};
		//����0-(arr.length-1)������ֵ,Ҳ�����������
		int index=(int)(Math.random()*time.length);
		return time[index];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����120������
		int[][] content = new int[120][3];
		for (int i = 0; i < content.length; i++) {
			content[i][0] = i+1;
			content[i][1] = i;
			content[i][2] = randomTime();
		}
		//�����FileList.txt��
		File file = new File("FileList.txt");
		try {
			FileWriter fw = new FileWriter(file);
			//create BufferedWriter class
			BufferedWriter bufw = new BufferedWriter(fw);
			for (int i = 0; i < content.length; i++) {
				String str = "" + content[i][0] + " " + content[i][1] + " " + content[i][2];
				bufw.write(str);
				bufw.newLine();
			}
			bufw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file);
			//create BufferedReader class
			BufferedReader bufr = new BufferedReader(fr);
			String s = null;
			int i = 0;
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
