package singletonPattern;

/**
 * 
 * @author 祖根
 *	编写一个具有public、private、protected、default访问权限的数据成员和成员函数的class。
 *	为它产生一个对象并进行观：当你尝试取用所有class成员时、会产生什么类型的编译消息
 */
public class Example {

	private int a;
	protected int b;
	public int c;
	int d;
	
	public Example(){
		this.a = 0;
		this.b = 1;
		this.c = 2;
		this.d = 3;
	}
	
	private void aTest() {
		
	}
	
	protected void bTest() {
		
	}
	
	public void cTest() {
		
	}
	
	void dTest() {
		
	}

}
