@FunctionalInterface
//with abstract method
interface MyInterface2 {
	//A method with single parameter
    int incrementByFive(int a);
}

//driver or main class.
public class Lambda3 {

   public static void main(String args[]) {
        // lambda expression with single parameter num
	   
	   MyInterface2 f = (num) -> num+5;  // lambda expression.
    	
        System.out.println(f.incrementByFive(25));
        System.out.println(f.incrementByFive(35));
        System.out.println(f.incrementByFive(55));
    }
}
