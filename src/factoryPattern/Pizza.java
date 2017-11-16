package factoryPattern;
/**
 * 
 * @author 祖根
 *	Pizza是个抽象类
 */
public abstract class Pizza {

	//准备材料
	public abstract void prepare();
	//烘焙披萨
	public abstract void bake();
	//切割披萨
	public abstract void cut();
	//披萨装包
	public abstract void box();
	
}
