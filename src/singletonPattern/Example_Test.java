package singletonPattern;

public class Example_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Example t = new Example();
		
		try {
			/**
			 * error: Unresolved compilation problems: 
			 * 		The field Example_06.a is not visible
			 * 		The method aTest() from the type Example_06 is not visible
			 */
//			System.out.println(t.a);  
//			t.aTest();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			System.out.println(t.b);
			t.bTest();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			System.out.println(t.c);
			t.cTest();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			System.out.println(t.d);
			t.dTest();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
