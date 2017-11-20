package serviceArithmetic;
/**
 * 
 * author by zugen
 * data: 2017/11/1
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FCFS_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		System.out.println("一条队列的情况：");
		System.out.println("---------------------");
		FCFS fcfs = new FCFS("FileList.txt");
		System.out.println("---------------------");
		System.out.println("俩条队列的情况：");
		System.out.println("---------------------");
		FCFS_two fcfs2 = new FCFS_two("FileList.txt");
	}

}
