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
		System.out.println("PepperoniPizza����׼����");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza�決������");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza�и�������");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza������װ��");
	}

}
