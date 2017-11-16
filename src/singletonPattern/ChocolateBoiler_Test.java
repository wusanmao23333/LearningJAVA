package singletonPattern;

/**
 * 
 * @author 祖根
 *	单例模式测试
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
