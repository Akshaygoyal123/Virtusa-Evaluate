package maps.lake;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class rock extends JFrame
{
public rock()
{
 super("Sukhana Lake ");
 ImageIcon c1 = new ImageIcon("maps/lake/rg1.jpg");
 JLabel l1 = new JLabel(c1);

 ImageIcon c2 = new ImageIcon("maps/lake/rg2.jpg");
 JLabel l2 = new JLabel(c2);
 ImageIcon c3 = new ImageIcon("maps/lake/rg3.jpg");
 JLabel l3 = new JLabel(c3);
 ImageIcon c4 = new ImageIcon("maps/lake/rg4.jpg");
 JLabel l4 = new JLabel(c4);
 ImageIcon c5 = new ImageIcon("maps/lake/rg5.jpg");
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

