package multithreading;

public class ChocolateBoiler_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChocolateBoiler c = ChocolateBoiler.getChocolateBoiler();
		
		Thread tA = new Thread(c);
		Thread tB = new Thread(c);
		Thread tC = new Thread(c);
		Thread tD = new Thread(c);
		
		tA.start();
		tB.start();
		tC.start();
		tD.start();
		
	}

}
