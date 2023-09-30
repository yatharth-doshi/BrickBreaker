package com.stronai.BrickBreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;
    static String name;

    Main()
    {
    }

    public static void main(String[] args) {

        f = new JFrame("Breakout Ball");
        b = new JButton("Submit");
        l = new JLabel("");


        Main te = new Main();

        b.addActionListener(te);
        t = new JTextField(16);
        //t.setBounds(100,100,200,40);
        JPanel p = new JPanel();

        p.add(t);
        p.add(b);
        p.add(l);
        p.setBackground(Color.white);

        f.add(p);
        f.setSize(300, 300);

        f.show();

    }

    public void actionPerformed(ActionEvent e)
    {

        String s = e.getActionCommand();
        if (s.equals("Submit")) {

            if (t.getText().length() >= 1) {

                JFrame obj = new JFrame();
                JFrame obj2 = new JFrame();
                Gameplay gamePlay = new Gameplay();

                obj2.setBounds(10,10,600,550);
                obj2.setTitle("Instructions to Play");
//                obj2.setBackground(Color.black);

                obj2.setResizable(false);
                obj2.setVisible(true);
                obj2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                obj.setBounds(10, 10, 690, 600);
                obj.setTitle("Breakout Ball");
                obj.setResizable(false);
                obj.setVisible(true);
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                obj.add(gamePlay);
                obj.setVisible(true);

                name = t.getText();

                f.dispose();
            }
            else{
                l.setText("Please Enter your name first");
            }
        }
    }
}
