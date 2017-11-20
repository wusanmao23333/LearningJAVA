package factoryPattern;

/**
 * 
 * @author ���
 *	PepperoniPizza��Pizza��һ������
 */

public class PepperoniPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza材料准备");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza烘焙披萨");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza切割披萨");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza披萨包装");
	}

}
