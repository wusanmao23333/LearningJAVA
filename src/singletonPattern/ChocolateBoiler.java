package singletonPattern;

/**
 * 
 * @author ���
 * ����ģʽ
 */

public class ChocolateBoiler {

	private static ChocolateBoiler cBoiler;
	
	//�жϹ�¯�Ƿ�Ϊ��
    private static boolean empty;
    //�жϹ�¯�Ƿ������
    private static boolean boiled;
	//���췽��
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
    		System.out.println("���¯�����ɿ�����ţ�̻���");
    		empty = false;
    	} else {
    		System.out.println("��¯�Ѿ����ˣ�");
    	}
    } 
    
    public void boil() {
    	if (boiled == false) {
    		System.out.println("����¯��У�");
    		boiled = true;
    	} else {
    		System.out.println("��¯�Ѿ�����ˣ�");
    	}
    }
    
    public void drain() {
    	if (empty == false && boiled == true) {
    		System.out.println("�ų���е��ɿ�����ţ�̣�");
    		empty = true;
    		boiled = false;
    	} else {
    		System.out.println("δ��л���δ���������ų�ʧ�ܣ�");
    	}
    }

}
