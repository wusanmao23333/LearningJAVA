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
		System.out.println("ClamPizza����׼����");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("ClamPizza�決������");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("ClamPizza�и�������");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("ClamPizza������װ��");
	}
	
}
