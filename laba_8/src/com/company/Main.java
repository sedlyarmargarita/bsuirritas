package com.company;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Main {
    public static void main(String[] args) {
        Panel numbers = new Panel("area of the country ");
        numbers.setVisible(true);
        numbers.setResizable(false);
        numbers.setLocationRelativeTo(null);
    }
}
class Panel extends JFrame {
    File file = new File("C://laba_8.txt");
    JRadioButton button1, button2, button3, button4, button5;
    JTextField text1;
    ButtonGroup bg;

    public Panel(String str) {
        super(str);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);

        button1 = new JRadioButton("Belarus");
        button2 = new JRadioButton("Ukraine ");
        button3 = new JRadioButton("Russia");
        button4 = new JRadioButton("Lithuania");
        button5 = new JRadioButton("Germany");
        text1 = new JTextField();
        bg = new ButtonGroup();
        bg.add(button1);
        bg.add(button2);
        bg.add(button3);
        bg.add(button4);
        bg.add(button5);

        setLayout(null);
        button1.setSize(100, 50);
        button1.setLocation(50, 20);
        button2.setSize(100, 50);
        button2.setLocation(200, 20);
        button3.setSize(100, 50);
        button3.setLocation(50, 20);
        button4.setSize(100, 50);
        button4.setLocation(200, 20);
        button5.setSize(100, 50);
        button5.setLocation(50, 20);
        text1.setSize(200, 50);
        text1.setLocation(50, 80);
        add(text1);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);

        button1.addActionListener(new ButtonActionListener());
        button2.addActionListener(new ButtonActionListener());
        button3.addActionListener(new ButtonActionListener());
        button4.addActionListener(new ButtonActionListener());
        button5.addActionListener(new ButtonActionListener());
    }

    public void setVisible(boolean b) {
    }

    public class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                try (FileWriter out = new FileWriter(file, true)) {
                    if (e.getSource() == button1)
                        text1.setText("207 595");
                    if (e.getSource() == button2)
                        text1.setText("603 628");
                    if (e.getSource() == button1)
                        text1.setText("17 100 000");
                    if (e.getSource() == button1)
                        text1.setText("65 300");
                    if (e.getSource() == button1)
                        text1.setText("357 386");
                } catch (IOException e1) {
                    throw new RuntimeException(e1);
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
