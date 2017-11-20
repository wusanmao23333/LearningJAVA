package factoryPattern;

import java.util.Random;

/**
 * 
 * @author ���
 *	
 */

public class SimplePizzaFactory {
	
	//���ɾ����Pizzaʵ��
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
			System.out.println("输入错误！");
			return null;
		}
	}
	
}
