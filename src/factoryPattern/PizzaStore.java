package factoryPattern;
/**
 * 
 * @author ���
 *	������������type�������������������һ��Pizzaʵ��(ʵ����Ҫ����һ��������ʵ��)
 */
public class PizzaStore {
	
	public void orderPizza(String type) {
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		simplePizzaFactory.createPizza(type).prepare();
		simplePizzaFactory.createPizza(type).bake();
		simplePizzaFactory.createPizza(type).cut();
		simplePizzaFactory.createPizza(type).box();
	}
	
}
