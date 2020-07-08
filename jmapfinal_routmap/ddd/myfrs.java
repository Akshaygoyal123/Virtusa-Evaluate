import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

class myfrs extends JFrame implements ActionListener
{
JButton b1,b2;

myfrs(String s)
{
super(s);
b1 = new JButton( " TRACE THE ROUTE ");
b2 = new JButton( " EXIT");

ImageIcon c1 = new ImageIcon("big_ATC.gif");
JLabel m1 = new JLabel(c1);

Container con=getContentPane();
con.setLayout(new BorderLayout());
con.add(b1,BorderLayout.NORTH);
con.add(m1,BorderLayout.CENTER);
con.add(b2,BorderLayout.SOUTH);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
jmap p1 = new jmap("CHANDIGARH ROUT MAP");
p1.setSize(800,900);

p1.show();

}
else
System.exit(0);
}
}
