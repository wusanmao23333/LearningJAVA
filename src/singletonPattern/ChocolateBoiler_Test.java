package singletonPattern;

/**
 * 
 * @author ���
 *	����ģʽ����
 */

public class ChocolateBoiler_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChocolateBoiler c = ChocolateBoiler.getChocolateBoiler();
		
		c.fill();
		c.boil();
		c.drain();
		c.drain();
		c.fill();
		c.fill();
		c.boil();
		c.boil();
		
	}

}
