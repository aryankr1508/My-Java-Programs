class constumer{
	String name="Naman Shrivastava";
	int id = 10179;
	double gpa = 8.5;
}
public class consumer{
	public static void main(String[] args) {
		constumer a=new constumer();
		System.out.println("Result is \n"+a.name+"\n"+a.id+"\n"+a.gpa);

	}
}