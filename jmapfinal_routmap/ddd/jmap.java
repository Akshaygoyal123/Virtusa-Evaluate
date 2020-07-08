import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.Applet;
import javax.swing.*;
class jmap extends JFrame implements ActionListener,MouseListener
{
int sys=0;
int i=0;
int j=0;
int fl=0;
int x=0,y=0;
int x1=0,y1=0;
	String s="";
	Choice c1,c2;
Button b1,b2,b6,b8;
boolean f=false;
int p1=0,p2=0;
	jmap(String s1)
	{
         super(s1);
b1=new Button("Show the path");
b2=new Button("Close");
b6 = new Button("Refresh");
c1 = new Choice();
c2= new Choice();
int i;
for(i=1;i<=56;i++)
{
c1.add("Sector -"+i);
c2.add("Sector -"+i);
}


setLayout(new BorderLayout());
Panel p1 = new Panel();
 b8 = new Button("View Sector");
p1.add(b8);
p1.add(new Label("Select Route"));
p1.add(c1);
p1.add(new Label("  TO   "));
p1.add(c2);
p1.add(b1);
p1.add(b2);
p1.add(b6);
b2.addActionListener(this);
b1.addActionListener(this);
b6.addActionListener(this);
b8.addActionListener(this);
add(p1,BorderLayout.NORTH);

s="hello";
Font f1 = new Font("Arial",Font.BOLD,16);
setFont(f1);
setBackground(Color.green);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
setVisible(false);
}});
addMouseListener(this);	
}

public void mouseClicked(MouseEvent ae)
{
int x = ae.getX();
int y = ae.getY();
if( (x>=420 && x<=520) && (y>=80 && y<=100)) 
{maps.lake.rock t = new maps.lake.rock();
t.setSize(800,600);
t.setVisible(true);
}
if( (x>=320 && x<=420) && (y>=110 && y<=130)) 
{maps.rockgarden.rock t = new maps.rockgarden.rock();
t.setSize(600,400);
t.setVisible(true);
}
}
public void mousePressed(MouseEvent ae)
{
}
public void mouseEntered(MouseEvent ae)
{
}
public void mouseExited(MouseEvent ae)
{
}
public void mouseReleased(MouseEvent ae)
{
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b8)
{
String s1 = c1.getSelectedItem();
int n = s1.indexOf("-");
s1 = s1.substring(n+1,s1.length());
//javax.swing.JOptionPane.showMessageDialog(null,s1);    

int k = Integer.parseInt(s1);

//javax.swing.JOptionPane.showMessageDialog(null,k+"");    
if(k==17)
{
 maps.c17.rock t = new maps.c17.rock();
t.setSize(800,600);
t.setVisible(true);
}
if(k==22)
{
 maps.c22.rock t = new maps.c22.rock();
t.setSize(700,400);
t.setVisible(true);
}
if(k==35)
{
 maps.c35.rock t = new maps.c35.rock();
t.setSize(800,600);
t.setVisible(true);
}
return;
}


if(ae.getSource()==b2)
{
setVisible(false);
System.exit(0);
}


if(ae.getSource()==b6)
{
setVisible(false);
jmap p1 = new jmap("CHANDIGARH ROUT MAP");
p1.setSize(800,900);
p1.show();

}

f=true;
String s1,s2;
s1 = c1.getSelectedItem();
s2= c2.getSelectedItem();
System.out.println(s1+"  "+s2);
int n = s1.indexOf("-");

s1=s1.substring(n+1,s1.length());
System.out.println(s1);
n = s2.indexOf("-");
s2=s2.substring(n+1,s2.length());
p1=Integer.parseInt(s1);
p2=Integer.parseInt(s2);
repaint();
}

public void update(Graphics g) 
{
 paint(g);
}

public void paint(Graphics g)

{
if(sys==0)
{g.setColor(Color.white);
g.fillRect(0,0,800,900);
sys=1;
}
int m[][] = {
      {0,0,0,1},
      {0,0,2,3,4,5,6},
      {0,12,11,10,9,8,7,26},
      {0,14,15,16,17,18,19,27,28},
      {0,25,24,23,22,21,20,30,29},
      {0,38,37,36,35,34,33,32,31},
      {39,40,41,42,43,44,45,46,47},
      {56,55,54,53,52,51,50,49,48}
      };
int b[ ];
b=new int[20];
int l=0,k=0,n=0,r=0,s=0;

int num=5;
int xx[]={420,420,470,520,420};
int yy[]={90,130,130,100,50};
g.setColor(Color.blue);
g.fillPolygon(xx,yy,num);
g.setColor(Color.white);
g.drawString("Lake",425,100);
g.setColor(Color.black);
g.fillOval(325,65,10,10);
g.drawString("kambwala",340,75);

g.fillOval(310,120,10,10);
g.drawString("Rockgarden",320,130);

g.fillOval(550-10,150-10,10,10);
g.drawString("kishangarh",550,150);


g.fillOval(590,115,10,10);
g.drawString("IT park",600,125);

g.fillOval(640,90,10,10);
g.drawString("mansadevi",650,100);

g.fillOval(700,150,10,10);
g.drawString("Manimajra",710,160);
g.drawLine(560,240,700,150);

g.fillOval(700,300,10,10);
g.drawString("RLY Station",710,310);
g.drawLine(600,300,700,300);

g.fillOval(700,350,10,10);
g.drawString("Ambala,airport,nh21",710,360);
g.drawLine(600,360,700,350);

g.drawLine(100,280,130,280);
g.drawString("Punjab Univ",10,290);

g.drawLine(100,360,130,360);
g.drawString("Ropar Road",10,360);

g.drawString("Rose Garden sec(16) ISBT sec(17) Kisan Bhawan sec(35)",10, 640);
g.drawString("Polic head quater sec(8) Passport off sec(34) Nilam Theater sec(34)",10, 670);
g.drawString("FR Manimajra Bus Stand sec(43)",10, 700);

//g.drawString("p1="+p1+" p2= "+p2,550,530);


if(!f)
{		


x=70;
y=70;
for(i=0;i<m.length;i++)
{
x=70;
for(j=0;j<m[i].length;j++)
{
if(m[i][j]==0)
{x=x+60;
continue;
}
g.setColor(Color.cyan);
g.fillRect(x,y,50,50);
g.setColor(Color.black);
g.drawString(""+m[i][j],x+12,y+25);
g.setColor(Color.pink);
g.fillOval(x+45,y+47,15,15);
g.setColor(Color.black);
x=x+60;
try {
Thread.sleep(20);
}catch(Exception e){}

}
y=y+60;
}

}

else
 {

if(p1>p2)
{
int t=p1;
p1=p2;
p2=t;
}



if(p1<=p2)
{
for(i=0;i<m.length;i++)
{
for(j=0;j<m[i].length;j++)
{
if(m[i][j]==p1)
  {
   l=i;
   n=j;
  }

if(m[i][j]==p2)
  {
   k=i;
   r=j;
  }
}
}
}


s=0;

for(;l<k;l++)
b[s++]=m[l][n];

fl=0;
if(r>n)
{
for(;n<=r;n++)
{
b[s++]=m[l][n];
fl=2;
}
}

else
{
for(;n>=r;n--)
{
b[s++]=m[l][n];
fl=1;
}

}

n--;
String sd="";

for(i=0;i<s;i++)
sd=sd+ " " + b[i];
g.setColor(Color.black);
g.drawString("Sectors in between"+sd,70,580);


if(fl==2)
{
x=70;
y=70;
r=0;
for(i=0;i<m.length;i++)
{
x=70;
for(j=0;j<m[i].length;j++)
{
g.setColor(Color.red);
if(b[r]==0)
{
x=x+60;
continue;
}
if(m[i][j]==b[r])
{
if(b[r] == b[r+1])
r++;
g.drawOval(x,y,50,50);
if(x1>0)
g.drawLine(x1,y1,x,y);
x1=x;y1=y;
r++;
try {
Thread.sleep(50);
}catch(Exception e){}

}
x=x+60;

}
y=y+60;
}
}

if(fl==1)
{
x=70;
y=70;
r=0;
System.out.println("Entered in loop");
for(i=0;i<m.length;i++)
{
x=70;
for(j=0;j<m[i].length;j++)
{
g.setColor(Color.red);
if(m[i][j]==b[r])
{
//if(b[r] == b[r+1])
//r++;
g.drawOval(x,y,50,50);
if(x1>0)
g.drawLine(x1,y1,x,y);
x1=x;y1=y;
r++;
try {
Thread.sleep(50);
}catch(Exception e){}

}
x=x+60;

}
y=y+60;
}

x=70;
y=70;
x1=0;
y1=0;
int h=b.length-1;

for(i=b.length-1;i>0;i--)
{
if(b[i]!=0)
break;
System.out.print(b[i]);
}

h=i;

System.out.println("Entered in loop h="+h);
for(i=0;i<m.length;i++)
{
x=70;
for(j=0;j<m[i].length;j++)
{
g.setColor(Color.red);

if(m[i][j]==b[h])
{
System.out.print(b[h]+"h="+h);
//if(b[r] == b[r+1])
//r++;
g.drawOval(x,y,50,50);
if(x1>0)
g.drawLine(x1,y1,x,y);
x1=x;y1=y;
h--;
try {
Thread.sleep(50);
}catch(Exception e){}
}
x=x+60;
}
y=y+60;
}






}


}

f=false;
 }
}









