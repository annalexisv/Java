import java.awt.*;
import java.awt.event.*;

class Test extends Frame implements ActionListener
{ TextField t1;
  TextField t2;
  Button b1;
  Button b2;
  Button b3;
  Label l1;
  Label l2;
  Panel p;
  Frame f;
Test()
{ f = new Frame("Palindrome");
  p = new Panel();
  l1 = new Label("Enter a number");
  t1 = new TextField(20);
  l2 = new Label("Reversed no.");
  t2 = new TextField(20);
  b1 = new Button ("Reverse");
  b2 = new Button ("Exit");
  b3 = new Button ("Clear");
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

Test obj = new Test();
}
}
