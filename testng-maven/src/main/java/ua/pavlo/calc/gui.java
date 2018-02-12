package ua.pavlo.calc;

import javax.swing.JFrame;
import  javax.swing.*;
import  java.awt.*;
import java.awt.event.*;


public class gui extends JFrame{

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JTextField t5;
    JTextField t1, t2, t3,t4;
    Double i, k, s,t;

    String a, b, z, y;
    eHandler handler = new eHandler();
    public gui(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("C");
        b2 = new JButton("=");
        b4 = new JButton("<");
        b3 = new JButton("7");
        b5 = new JButton("8");
        b6 = new JButton("9");
        b7 = new JButton("4");
        b8 = new JButton("5");
        b9 = new JButton("6");
        b10 = new JButton("1");
        b11 = new JButton("2");
        b12 = new JButton("3");
        b13 = new JButton("0");
        b14 = new JButton(",");
        b15 = new JButton("+");
        b16 = new JButton("-");
        b17 = new JButton("*");
        b18 = new JButton("/");
        b19 = new JButton("^");
        b20 = new JButton("%");
        l1 = new JLabel("Введіть перше число:");
        l2 = new JLabel("Введіть дію:");
        l3 = new JLabel("Введіть друге число:");
        l4 = new JLabel("");
        t1 = new JTextField(15);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t2 = new JTextField(15);
        t2.setHorizontalAlignment(JTextField.RIGHT);
        t3 = new JTextField(15);
        t3.setHorizontalAlignment(JTextField.RIGHT);
        t4 = new JTextField(15);
        t4.setHorizontalAlignment(JTextField.RIGHT);
        t5 = new JTextField(15);
        t5.setHorizontalAlignment(JTextField.RIGHT);
        add(t1);
        //add(t2);
        //add(t3);
        //add(t4);
        //add(t5);
        add(b1);
        add(b4);
        add(b3);
        add(b19);
        add(b18);
        add(b3);
        add(b5);
        add(b6);
        add(b17);
        add(b7);
        add(b8);
        add(b9);
        add(b16);
        add(b10);
        add(b11);
        add(b12);
        add(b15);
        add(b13);
        add(b14);
        add(b20);
        add(b2);

        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b10.addActionListener(handler);
        b11.addActionListener(handler);
        b12.addActionListener(handler);
        b13.addActionListener(handler);
        b14.addActionListener(handler);
        b15.addActionListener(handler);
        b16.addActionListener(handler);
        b17.addActionListener(handler);
        b18.addActionListener(handler);
        b19.addActionListener(handler);
        b20.addActionListener(handler);

    }

    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {

            if (e.getSource()==b10){
                a=t1.getText();
                t1.setText(a+"1");
            }
            if (e.getSource()==b11){
                a=t1.getText();
                t1.setText(a+"2");
            }
            if (e.getSource()==b12){
                a=t1.getText();
                t1.setText(a+"3");
            }
            if (e.getSource()==b13){
                a=t1.getText();
                t1.setText(a+"0");
            }
            if (e.getSource()==b3){
                a=t1.getText();
                t1.setText(a+"7");
            }
            if (e.getSource()==b5){
                a=t1.getText();
                t1.setText(a+"8");
            }
            if (e.getSource()==b6){
                a=t1.getText();
                t1.setText(a+"9");
            }
            if (e.getSource()==b7){
                a=t1.getText();
                t1.setText(a+"4");
            }
            if (e.getSource()==b8){
                a=t1.getText();
                t1.setText(a+"5");
            }
            if (e.getSource()==b9) {
                a=t1.getText();
                t1.setText(a+"6");
            }
            if (e.getSource()==b15)
            {
                t2.setText("+");
                t3.setText(t1.getText());
                t1.setText(null);
            }
            if (e.getSource()==b16)
            {
                t2.setText("-");
                t3.setText(t1.getText());
                t1.setText(null);
            }
            if (e.getSource()==b17)
            {
                t2.setText("*");
                t3.setText(t1.getText());
                t1.setText(null);
            }
            if (e.getSource()==b18)
            {
                t2.setText("/");
                t3.setText(t1.getText());
                t1.setText(null);
            }
            if (e.getSource()==b19)
            {
                t2.setText("^");
                t3.setText(t1.getText());
                t1.setText(null);
            }
            if (e.getSource()==b14)
            {
                t4.setText(",");
                a=t1.getText();
                t1.setText(a+".");
            }
            if (e.getSource()==b20)
            {
                t5.setText("%");
                k = Double.parseDouble(t3.getText());
                i = Double.parseDouble(t1.getText());
                s = (k/100)*i;
                a=t1.getText();
                t1.setText(s+"");
            }
            if (e.getSource()==b1){
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
                t5.setText(null);
            }
            if (e.getSource()==b4) {
                t2.setText("<");


            }
            if(e.getSource()==b2){

                k = Double.parseDouble(t3.getText());
                i = Double.parseDouble(t1.getText());

                z=t2.getText();

                if (z.equals("+")) {
                    s = k + i;
                    b = "" +s;
                    t1.setText(b);
                }else if(z.equals("-")) {
                    s = k - i;
                    b = "" +s;
                    t1.setText(b);
                }else if(z.equals("*")) {
                    s = k * i;
                    b = "" +s;
                    t1.setText(b);
                }else if(z.equals("/")) {

                    s = k / i;
                    b = "" +s;
                    t1.setText(b);
                }else if(z.equals("^")) {
                    s = Math.pow(k, i);
                    b = "" +s;
                    t1.setText(b);
                }

            }
        }

    }
}
