package basicJAVA;
/**
 * 
 * @author zugen
 *
 */
public class ToGradeScore {
	
	public static void toGradeScore(double Score){
		if (Score > 100d || Score < 0d) {
			System.out.println("�������");
		} else if (Score > 90d){
			System.out.println("��");
		} else if (Score > 80d){
			System.out.println("��");
		} else if (Score > 70d){
			System.out.println("��");
		} else if (Score > 60d){
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] Score = {97.0 , 67.0, 27.0, 112.0};
		for (int i = 0; i < Score.length; i++) {
			System.out.println("�ɼ�Ϊ�� " + Score[i] + "ת��Ϊ�ȼ�Ϊ ��");
			toGradeScore(Score[i]);
		}
	}
	
}
