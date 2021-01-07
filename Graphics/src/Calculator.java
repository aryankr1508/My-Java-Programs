import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
Button b1, b2, b3, b4, b5;
TextField t1, t2, t3;
Label l1, l2, l3;
Calculator()
{
setVisible(true);
setSize(500, 500);
setBackground(Color.PINK);
b1=new Button("Add");
b2=new Button("Subtract");
b3=new Button("Multiply");
b4=new Button("Divide");
b5=new Button("Close");
l1=new Label("Enter 1st Number");
l2=new Label("Enter 2nd Number");
l3=new Label("Result");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
setLayout(new FlowLayout());
add(l1); 
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText());
int z=x+y; t3.setText(""+z);}
if(ae.getSource()==b2)
{int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText());
int z=x-y; t3.setText(""+z);}
if(ae.getSource()==b3)
{int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText());
int z=x*y; t3.setText(""+z);}
if(ae.getSource()==b4)
{int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText());
int z=x/y; t3.setText(""+z);}
if(ae.getSource()==b5)
{dispose();}


}

public static void main(String args[])
  {
Calculator obj=new Calculator();

 }


}