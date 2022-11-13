package Zad16;


import Zad15.SwingApp;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.SwingPropertyChangeSupport;

public class Zadanie16 {

    public static void main(String[] args)
    {
        new Zadanie16();
    }

    public Zadanie16(){

        SwingUtilities.invokeLater(
            ()->swz16()
        );

    }

    protected void swz16(){
        JFrame jf = new JFrame();

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        JPanel jp1 = new JPanel();
        jp1.setLayout(new  BorderLayout());

        jp1.add(new JButton("Przycisk 1"),BorderLayout.PAGE_START);
        jp1.add(new JButton("P 2"),BorderLayout.LINE_START);
        jp1.add(new JButton("Większy przycisk numer 3"),BorderLayout.CENTER);
        jp1.add(new JButton("Przycisk 4"),BorderLayout.PAGE_END);
        jp1.add(new JButton("P 5"),BorderLayout.LINE_END);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout());

        jp2.add(new JButton("Przycisk 1"));
        jp2.add(new JButton("P 2"));
        jp2.add(new JButton("Większy przycisk numer 3"));
        jp2.add(new JButton("Przycisk 4"));
        jp2.add(new JButton("P 5"));

        JPanel jp3 = new JPanel();
        jp3.setLayout(new FlowLayout(FlowLayout.LEFT));

        jp3.add(new JButton("Przycisk 1"));
        jp3.add(new JButton("P 2"));
        jp3.add(new JButton("Większy przycisk numer 3"));
        jp3.add(new JButton("Przycisk 4"));
        jp3.add(new JButton("P 5"));

        JPanel jp4 = new JPanel();
        jp4.setLayout(new FlowLayout(FlowLayout.RIGHT));

        jp4.add(new JButton("Przycisk 1"));
        jp4.add(new JButton("P 2"));
        jp4.add(new JButton("Większy przycisk numer 3"));
        jp4.add(new JButton("Przycisk 4"));
        jp4.add(new JButton("P 5"));

        JPanel jp5 = new JPanel();
        jp5.setLayout(new GridLayout(1,5));

        jp5.add(new JButton("Przycisk 1"));
        jp5.add(new JButton("P 2"));
        jp5.add(new JButton("Większy przycisk numer 3"));
        jp5.add(new JButton("Przycisk 4"));
        jp5.add(new JButton("P 5"));

        JPanel jp6 = new JPanel();
        jp6.setLayout(new GridLayout(5,1));

        jp6.add(new JButton("Przycisk 1"));
        jp6.add(new JButton("P 2"));
        jp6.add(new JButton("Większy przycisk numer 3"));
        jp6.add(new JButton("Przycisk 4"));
        jp6.add(new JButton("P 5"));

        JPanel jp7 = new JPanel();
        jp7.setLayout(new GridLayout(3,2));

        jp7.add(new JButton("Przycisk 1"));
        jp7.add(new JButton("P 2"));
        jp7.add(new JButton("Większy przycisk numer 3"));
        jp7.add(new JButton("Przycisk 4"));
        jp7.add(new JButton("P 5"));

        String x = JOptionPane.showInputDialog("Podaj od A do G jaki layout chcesz");

        switch (x){
            case "A" ->  jf.add(jp1);
            case "B" ->  jf.add(jp2);
            case "C" ->  jf.add(jp3);
            case "D" ->  jf.add(jp4);
            case "E" ->  jf.add(jp5);
            case "F" ->  jf.add(jp6);
            case "G" ->  jf.add(jp7);
        }

        jf.pack();

        jf.setVisible(true);


    }

}
