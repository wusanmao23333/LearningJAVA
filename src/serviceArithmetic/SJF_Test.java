package serviceArithmetic;
/**
 * SJF����main����
 * author by zugen
 * data: 2017/11/1
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SJF_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		System.out.println("һ�����е�������£�");
		System.out.println("---------------------");
		SJF sjf = new SJF("FileList.txt");
		System.out.println("---------------------");
		System.out.println("�������е�������£�");
		System.out.println("---------------------");
		SJF_two sjf2 = new SJF_two("FileList.txt");
	}

}
