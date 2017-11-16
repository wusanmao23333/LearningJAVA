package basicJAVA;
/**
 * 
 * @author zugen
 *
 */
public class PrintNarcNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i*i*i + j*j*j + k*k*k == i*100 + j*10 + k) {
						c = i*100 + j*10 + k;
						System.out.println(i*100 + j*10 + k);
					}
				}
			}
		}
	}
	
}
