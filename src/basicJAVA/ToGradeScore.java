package basicJAVA;
/**
 * 
 * @author zugen
 *
 */
public class ToGradeScore {
	
	public static void toGradeScore(double Score){
		if (Score > 100d || Score < 0d) {
			System.out.println("输入错误");
		} else if (Score > 90d){
			System.out.println("优");
		} else if (Score > 80d){
			System.out.println("良");
		} else if (Score > 70d){
			System.out.println("中");
		} else if (Score > 60d){
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] Score = {97.0 , 67.0, 27.0, 112.0};
		for (int i = 0; i < Score.length; i++) {
			System.out.println("成绩为： " + Score[i] + "转化为等级为：");
			toGradeScore(Score[i]);
		}
	}
	
}
