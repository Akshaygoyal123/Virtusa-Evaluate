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
myfrs f11 = new myfrs("Chandigarh route map");
f11.setSize(600,600);
f11.setLocation(200,100);
f11.setVisible(true);
setVisible(false);
if(true)
return;
if(ae.getSource() == b1)
{
char a[]=t1.getPassword();
int i;
String s1="";
for(i=0;i< a.length;i++)
{
s1=s1+a[i];
}
 Connection con = null;
   Statement stmt = null;
ResultSet rs;
   try {
if(!s1.equals("admin"))
return;
int n= 1;
if(n>0)
{
if(f==1)
{

Calendar d1 = Calendar.getInstance();
int dow =d1.get(Calendar.DAY_OF_WEEK);
if(!(dow>=2 && dow<=6))
{
 if(s==1)
JOptionPane.showMessageDialog(null, "Sorry You Can Not Access at this Day");
if(s==0)
s=1;
else
s=0;
return;
}
int time = d1.get(Calendar.HOUR_OF_DAY);
if(!(time >=9 && time <=17))
{
 if(s==1)
JOptionPane.showMessageDialog(null, "Sorry You Can Not Access at this time");
if(s==0)
s=1;
else
s=0;
return;
}
myfrs f1 = new myfrs("Chandigarh route map");
f1.setSize(600,600);
f1.setLocation(200,100);
f1.setVisible(true);
setVisible(false);

f=0;
r=0;
 }   
}
if( r==1)
{
//myfr  m1 = new myfr(" INVALID USER"," I N V A L I D username of password");
//m1.setSize(230,200);
//m1.setLocation(160,250);
//m1.setVisible(true);
if(s==1)
JOptionPane.showMessageDialog(null, "I N V A L I D username or password");
if(s==0)
s=1;
else
s=0;

}
}catch(Exception e) {}
}
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
