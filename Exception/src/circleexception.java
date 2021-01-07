import java.lang.Exception;

class myexception extends Exception{
	public myexception(String message) {
		super(message);
	}
}
class circle{
	double radius;
	double pi=3.14;
	
void setradius(int r) {
		  
	   
try{	
	   
   if(r>=0) 
	   radius=r;
	   
	   
	   else
		   throw new myexception("radius cant be null");
   }


catch(myexception  e) {
	   System.err.print(e);
   }
}
	void circlearea() {
	System.out.println("area is : "+pi*radius*radius);
	}
}
public class circleexception {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
circle c=new circle();

c.setradius(-3);
c.circlearea();
	}

}