import java.util.Arrays;
import java.util.stream.Stream;
class Employee{
	int id;
	String name;
	double  salary;
	Employee(int a,String b,double c){
		id=a;
		name=b;
		salary=c;
		
	}
	public void showData() {
		System.out.println("ID:"+id);
		System.out.println("name:"+name);
		System.out.println("Salary"+salary);
		System.out.println();
	}
}
public class EmployeeStream {
	public static void main(String[] args) {
		Employee[] employee= {new Employee(1000,"Aryan",1000000),new Employee(2000,"Aryan Kumar",222783), new Employee(938724,"Naman",39004)};
		
		Stream<Employee> enpstream=Arrays.stream(employee);
		enpstream.forEach(p->p.showData());
	}

}
