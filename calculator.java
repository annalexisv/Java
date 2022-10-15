import java.awt.event.*;
import java.io.*;
import java.awt.*;
class calculator extends Frame implements ActionListener {
    // create a frame
    static Frame f;
 
    // create a textfield
    static TextField l;
 
    // store operator and operands
    String s0, s1, s2;
 
    // default constructor
    calculator()
    {
        s0 = s1 = s2 = "";
    }
 
    // main function
    public static void main(String args[])
    {
        // create a frame
        f = new Frame("calculator");
 
 
        // create a object of class
        calculator c = new calculator();
 
        // create a textfield
        l = new TextField(20);
 
        // set the textfield to non editable
        l.setEditable(false);
 
        // create number buttons and some operators
        Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
 
        // create number buttons
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
 
        // equals button
        beq1 = new Button("=");
 
        // create operator buttons
        ba = new Button("+");
        bs = new Button("-");
        bd = new Button("/");
        bm = new Button("*");
        beq = new Button("C");
 
        // create . button
        be = new Button(".");
 
        // create a panel
        Panel p = new Panel();
 
        // add action listeners
        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);
 
        // add elements to panel
        p.add(l);
       
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
p.add(b0);
        p.add(ba);
p.add(bs);
p.add(bm);
        p.add(bd);
        p.add(be);
        p.add(beq1);
        p.add(beq);
 
        // set Background of panel
        p.setBackground(Color.gray);
 
        // add panel to frame
        f.add(p);
 
        f.setSize(200, 220);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            // set the value of text
            l.setText(s0 + s1 + s2 + "=" +te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = s;
 
                // make the operand blank
                s2 = "";
            }
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
    }
}


