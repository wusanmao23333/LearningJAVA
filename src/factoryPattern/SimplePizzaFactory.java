package factoryPattern;

import java.util.Random;

/**
 * 
 * @author 祖根
 *	SimplePizzaFactory是一个披萨对象生成“工厂”，根据不同的type生成不同的Pizza实例
 */

public class SimplePizzaFactory {
	
	//生成具体的Pizza实例
	public Pizza createPizza(String type) {
		switch(type) {
		case "cheese":
			CheesePizza chp = new CheesePizza();
			return chp;
		case "pepperoni":
			PepperoniPizza pep = new PepperoniPizza();
			return pep;
		case "clam":
			ClamPizza clp = new ClamPizza();
			return clp;
		default :
			System.out.println("输入有误！");
			return null;
		}
	}
	
}
