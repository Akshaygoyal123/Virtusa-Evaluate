import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class mytest
{
public static void main(String s[ ])
{
myframe f1 = new myframe("   USER AUTHENTICATION");
f1.setSize(600,200);
f1.setLocation(130,200);
f1.setVisible(true);
}
}

class myframe extends JFrame implements ActionListener
{
int f=1;
int r=1;
int s=1;
JPasswordField t1;
JTextField t2,t3;
JButton b1,b2;

myframe(String s)
{
super(s);
Container con=getContentPane();
con.setLayout(new BorderLayout());
t1 = new JPasswordField(10);
t2 = new JTextField(10);
t3 = new JTextField(10);
b1= new JButton(" OK ");
b2= new JButton(" CANCEL");
b1.addActionListener(this);
b2.addActionListener(this);
JPanel p1,p2,p3,p4;
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
p4=new JPanel();



ImageIcon c1 = new ImageIcon("login.png");
JLabel m1 = new JLabel(c1);

p1.add(m1);
con.add(m1,BorderLayout.WEST);


p2.add(new JLabel("User Name  "));
p2.add(t2);
p2.add(new JLabel("Password "));
p2.add(t1);
con.add(p2,BorderLayout.CENTER);

p4.add(b1);
p4.add(b2);

con.add(p4,BorderLayout.SOUTH);
b1.addActionListener(this);
b2.addActionListener(this);




}
  public void actionPerformed(ActionEvent ae)
        {

if(t1.getText().equals("admin") && t2.getText().equals("admin"))
{
myfrs f11 = new myfrs("Chandigarh route map");
f11.setSize(600,600);
f11.setLocation(200,100);
f11.setVisible(true);
setVisible(false);
}
else
JOptionPane.showMessageDialog(null,"Invalid user try again");
if(true)
return;


}
}



class myfr extends JFrame implements ActionListener
{
JButton b1;

myfr(String s,String m)
{
super(s);
b1 = new JButton( " O K ");
Container con=getContentPane();
con.setLayout(new BorderLayout());
con.add(new JLabel(m),BorderLayout.CENTER);
con.add(b1,BorderLayout.SOUTH);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
setVisible(false);
}

}
