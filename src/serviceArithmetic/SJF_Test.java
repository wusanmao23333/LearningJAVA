package serviceArithmetic;
/**
 * 
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
		System.out.println("一条队列的情况：");
		System.out.println("---------------------");
		SJF sjf = new SJF("src/serviceArithmetic/input.txt");
		System.out.println("---------------------");
		System.out.println("俩条队列的情况：");
		System.out.println("---------------------");
		SJF_two sjf2 = new SJF_two("src/serviceArithmetic/input.txt");
	}

}
