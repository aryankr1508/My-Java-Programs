
class Animal{
		
}  
	
class Dog extends Animal{						 //Dog inherits Animal  
	  public void print() {
			System.out.println("Hello");
			
		}
	  static void method(Animal a) { 
			   if(a instanceof Dog){  
	       		Dog d=(Dog)a;                                     //downcasting  statement
	       		System.out.println("ok downcasting performed");  
          	}  
	}
}
public class Instance {
	public static void main(String args[]){  
			Dog d1=new Dog(); 
			Animal a1 = new Animal();

			//Syntax: objectname instanceof classname
			System.out.println(d1 instanceof Dog);     	//true  
			System.out.println(d1 instanceof Animal); 	//true
			System.out.println(a1 instanceof Dog);  	//? false 
			Dog d2=null;  
			System.out.println(d2 instanceof Dog);		//? false
			
			//Dog d3 = new Animal(); // compilation error
			//Dog d4 = (Dog) new Animal(); //Class compilation error
	    	 
			Animal a = new Dog(); 			// created Animal object for downcasting.
			//Dog.method(a);                   //calling method from subclass with the base class object using downcasting.
			 System.out.println(a instanceof Dog);           // ?
			((Dog)a).print(); // can you please fix this.............
		 }  
}
	



//((Dog) a).print(); // can you please fix this.............