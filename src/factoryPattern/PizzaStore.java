package factoryPattern;
/**
 * 
 * @author 祖根
 *	根据披萨类型type完成披萨制作，并返回一个Pizza实例(实际上要返回一个其子类实例)
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
