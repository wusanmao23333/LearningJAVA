package factoryPattern;
/**
 * 
 * @author ���
 *	ClamPizza��Pizza��һ������
 */

public class ClamPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("ClamPizza材料准备");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("ClamPizza烘焙披萨");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("ClamPizza切割披萨");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("ClamPizza披萨包装");
	}
	
}
