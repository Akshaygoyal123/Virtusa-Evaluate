import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class rock extends JFrame
{
rock()
{
 super("Rock Garden ");
 ImageIcon c1 = new ImageIcon("rg1.jpg");
 JLabel l1 = new JLabel(c1);

 ImageIcon c2 = new ImageIcon("rg2.jpg");
 JLabel l2 = new JLabel(c2);
 ImageIcon c3 = new ImageIcon("rg3.jpg");
 JLabel l3 = new JLabel(c3);
 ImageIcon c4 = new ImageIcon("rg4.jpg");
 JLabel l4 = new JLabel(c4);
 ImageIcon c5 = new ImageIcon("rg5.jpg");
 JLabel l5 = new JLabel(c5);

 getContentPane().setLayout(new FlowLayout());
 getContentPane().add(l1);


  getContentPane().add(l2);
  getContentPane().add(l3);
  getContentPane().add(l4);
   getContentPane().add(l5);
 }
 public static void main(String s[ ])
  {
   rock c1 = new rock();
   c1.setSize(300,300);
   c1.setVisible(true);
   }
 }

