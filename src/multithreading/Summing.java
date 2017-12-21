package multithreading;

public class Summing implements Runnable {
	
	private static int sum = 0;
	private int start;
	private int end;
	
	public Summing(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int sum() {
		int result = 0;
		
		for (int i = this.start; i <= this.end; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static void printSum() {
		System.out.println("Sum: \t" + Summing.sum);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("result: \t" + this.sum());
		Summing.sum += this.sum();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread a = new Thread(new Summing(1, 25));
		a.start();
		a.join();
		Thread b = new Thread(new Summing(26, 50));
		b.start();
		b.join();
		Thread c = new Thread(new Summing(51, 75));
		c.start();
		c.join();
		Thread d = new Thread(new Summing(76, 100));
		d.start();
		d.join();
		Summing.printSum();
	}
	
}
