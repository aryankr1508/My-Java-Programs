class reward{
	static int points=0;
	public void points(){
		System.out.println("Your Points is "+points);
	}
}
class bonus{
	public void createclass(){
		int x=5;
		reward r1=new reward();
		public void points(){
			System.out.println("Your bonus points is "+x);

		}
	};
}
public class bonuspoints{
	public static void main(String[] args) {
		bonuspoints bp=new bonuspoints();
		bp.createclass();
	}
}