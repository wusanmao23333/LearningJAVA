package iostram;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zugen
 *
 */
public class CompareBufferSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File infile = new File("src/Filebin.txt");
		File outfile = new File("src/Filebindest.txt");
		File bufferoutfile = new File("src/BufferFilebindest.txt");
	
		try {
			long startTime = System.currentTimeMillis();  
			FileInputStream finS = new FileInputStream(infile);  
            FileOutputStream foutS = new FileOutputStream(outfile);  
            int c;  
            while ((c = finS.read()) != -1) {  
                foutS.write(c);  
            }  
            finS.close();  
            foutS.close();
            long endTime = System.currentTimeMillis();    
            System.out.println("不带缓冲字符流的运行时间： " + (endTime - startTime) + "ms");    
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("FileStreamsTest: " + e);
		}

		try {
			long startTime = System.currentTimeMillis();  //��ȡ��ʼʱ��
			FileInputStream finS = new FileInputStream(infile);  
            FileOutputStream foutS = new FileOutputStream(bufferoutfile);  
            BufferedInputStream bfinS = new BufferedInputStream(finS);
            BufferedOutputStream bfoutS = new BufferedOutputStream(foutS);
            int c;
            while ((c = bfinS.read()) != -1) {
            	bfoutS.write(c);
            }
            bfinS.close();
            bfoutS.close();
            long endTime = System.currentTimeMillis();    
            System.out.println("带缓冲字符流的运行时间： " + (endTime - startTime) + "ms");    
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("FileStreamsTest: " + e);
		}
	}

}
