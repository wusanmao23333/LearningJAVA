package factoryPattern;
/**
 * 
 * @author ���
 *	CheesePizza��Pizza��һ������
 */
public class CheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza材料准备");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza烘焙披萨");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza切割披萨");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza披萨包装");
	}

}
