package ua.pavlo.calc;

import javax.swing.JFrame;



public class Size {
    public static void main(String args[]) {
    gui r = new gui("Calculator");
    r.setVisible(true);
    r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    r.setSize(200, 230);
    r.setResizable(false);
    r.setLocationRelativeTo(null);
}
}