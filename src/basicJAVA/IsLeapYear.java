package basicJAVA;

import java.util.Scanner;

/**
 * 
 * @author zugen
 *
 */
public class IsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.print("��������ݣ�1990��2007���� ");
		  Scanner scan = new Scanner(System.in);
		  int read = scan.nextInt();
		  if (read % 4 == 0 && read % 100 != 0) {
			  System.out.println(read + " �����꣡");
		  } else if (read % 400 == 0) {
			  System.out.println(read + " �����꣡");
		  } else {
			  System.out.println(read + " �������꣡");
		  }
	}
	
}
