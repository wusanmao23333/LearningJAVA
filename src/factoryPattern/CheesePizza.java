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
		System.out.println("CheesePizza����׼����");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza�決������");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza�и�������");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza������װ��");
	}

}
