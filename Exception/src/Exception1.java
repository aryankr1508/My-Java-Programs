import javax.swing.*;
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		
	
		String s1 = JOptionPane.showInputDialog("Enter the 1st value:");
		a = Double.parseDouble(s1);
		
		String s2 = JOptionPane.showInputDialog("Enter the 1st value:");
		b = Double.parseDouble(s2);
		
		double c = a / b;
		JOptionPane.showMessageDialog(null, "The Quotent of 2 values entered = "+c);
		
		{
		//double c = a/b;
		//exception handling
		}
		System.out.println("Output = "+ c);
		
		System.out.println("Hello");

	}

}
