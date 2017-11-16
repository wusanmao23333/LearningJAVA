package singletonPattern;

/**
 * 
 * @author 祖根
 * 单例模式
 */

public class ChocolateBoiler {

	private static ChocolateBoiler cBoiler;
	
	//判断锅炉是否为空
    private static boolean empty;
    //判断锅炉是否已煮沸
    private static boolean boiled;
	//构造方法
    private ChocolateBoiler() {
    	this.empty = true;
    	this.boiled = false;
    }
    
    public static ChocolateBoiler getChocolateBoiler() {
    	if (cBoiler == null) {
    		cBoiler = new ChocolateBoiler();
    	} 
    	return cBoiler;
    }
    
    public void fill() {
    	if (empty == true) {
    		System.out.println("向锅炉填满巧克力和牛奶混合物！");
    		empty = false;
    	} else {
    		System.out.println("锅炉已经满了！");
    	}
    } 
    
    public void boil() {
    	if (boiled == false) {
    		System.out.println("将锅炉煮沸！");
    		boiled = true;
    	} else {
    		System.out.println("锅炉已经煮沸了！");
    	}
    }
    
    public void drain() {
    	if (empty == false && boiled == true) {
    		System.out.println("排出煮沸的巧克力和牛奶！");
    		empty = true;
    		boiled = false;
    	} else {
    		System.out.println("未煮沸或者未填满导致排出失败！");
    	}
    }

}
