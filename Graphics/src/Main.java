import java.awt.*;
import java.awt.event.*;
public class Main extends Frame implements ActionListener
{
    Button b1,b2,b3,b4;
    TextField t1;
    Main()
    {
        setVisible(true);
        setSize(200, 200);
        b1=new Button("RED");
        b2=new Button("GREEN");
        b3=new Button("BLUE");
        b4=new Button("Close");
        t1=new TextField(20);
        setBackground(Color.YELLOW);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1){setBackground(Color.RED);}
        if(ae.getSource()==b2){setBackground(Color.GREEN);}
        if(ae.getSource()==b3){setBackground(Color.BLUE);}
        if(ae.getSource()==b4){dispose();}
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main obj=new Main();
	}
}