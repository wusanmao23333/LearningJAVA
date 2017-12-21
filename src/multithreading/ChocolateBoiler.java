package multithreading;

/**
 * 
 * @author Administrator
 * 单例模式进行改造，使其支持多线程，并且是线程安全的。
 */
public class ChocolateBoiler implements Runnable {

	private static ChocolateBoiler cBoiler;
	
    private static boolean empty;
   
    private static boolean boiled;
	
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
    		System.out.println("向锅炉填满巧克力和牛奶的混合物！");
    		empty = false;
    	} else {
    		System.out.println("锅炉已经满了！");
    	}
    } 
    
    public void boil() {
    	if (boiled == false) {
    		System.out.println("将炉内煮沸！");
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
    		System.out.println("未煮沸或者水未填满导致排出失败！");
    	}
    }

    public synchronized void doit() {
    	if (cBoiler != null) {
    		try {
        		cBoiler.fill();
        		cBoiler.boil();
        		cBoiler.drain();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
    	}
    }
    
	@Override
	public void run() {
		doit();
	}

}
