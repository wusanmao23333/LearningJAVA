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
		  System.out.print("请输入年份（1990到2007）： ");
		  Scanner scan = new Scanner(System.in);
		  int read = scan.nextInt();
		  if (read % 4 == 0 && read % 100 != 0) {
			  System.out.println(read + " 是闰年！");
		  } else if (read % 400 == 0) {
			  System.out.println(read + " 是闰年！");
		  } else {
			  System.out.println(read + " 不是闰年！");
		  }
	}
	
}
