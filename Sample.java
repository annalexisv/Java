import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
class Sample extends JFrame implements ActionListener
{ JTextField t1;
  JTextField t2;
  JButton b1;
  JButton b2;
  JButton b3;
  JLabel l1;
  JLabel l2;
  JPanel p;
  JFrame f;
Sample()
{ f = new JFrame("Palindrome");
  p = new JPanel();
  l1 = new JLabel("Enter a number");
  t1 = new JTextField(20);
  l2 = new JLabel("Reversed no.");
  t2 = new JTextField(20);
  b1 = new JButton ("Reverse");
  b2 = new JButton ("Exit");
  b3 = new JButton ("Clear");
  p.add(l1);
  p.add(t1);
  p.add(b1);
  p.add(l2);
  p.add(t2);
  p.add(b2);
  p.add(b3);
  f.add(p);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  f.setSize(400,400);
  f.setLayout(new FlowLayout());
  f.setVisible(true);

}

public boolean isPalindrome(int n)

{ boolean flag;int rev=0; int cpy=n;
  while (cpy>0)
     {
       int d = cpy%10;
       rev=rev*10+d;
       cpy/=10;  
     }
  if(rev==n)
    flag=true;
  else
    flag=false;
 return flag;
}

public void actionPerformed(ActionEvent ae)
{
int i = Integer.parseInt(t1.getText());
t1.setText(String.valueOf(i));
if(ae.getSource()==b1)
{ 
  if (isPalindrome(i))
    {
     t2.setText(String.valueOf(i));
    }
   
} 

if(ae.getSource()==b2)
{
 System.exit(0);
}
if(ae.getSource()==b3)
{
    t1.setText(null);
      t2.setText(null);
}

}

public static void main (String args[])
{

Sample obj = new Sample();
}
}
