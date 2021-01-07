
interface Animal1 {
	void sound(); // no implementation / the methods don't have bodies // by default interface methods are abstract and public
	void speed(); 
	//interface cannot contain constructor
}
interface FastAnimal1{
	void run();
}
class Tiger1 implements Animal1, FastAnimal1 {

	public void sound () {
		System.out.println("Roar");             //it is compulsory to override all the methods.
	}
	public void speed() 
	{
		System.out.println("Speed is High");
	}
	public void run() {
		System.out.println("It is Fast running animal");
	}
}
//Driver class
class Interface3 {
	public static void main(String[] args) {
		Tiger1 t1 = new Tiger1();
		t1.speed();
		t1.run();
		// Animal a = new Animal(); //not valid	
	}
}
