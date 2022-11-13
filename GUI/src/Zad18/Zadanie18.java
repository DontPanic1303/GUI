package Zad18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie18 {



    public static void main(String[] args)
    {
        new Zadanie18();
    }

    public Zadanie18(){
        SwingUtilities.invokeLater(
                () ->swz18()
        );
    }

    protected void swz18(){

        JFrame jf = new JFrame("Single swing app");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton jb1 = new JButton("FR");
        JButton jb2 = new JButton("FG");
        JButton jb3 = new JButton("FB");

        jb1.setBackground(Color.RED);
        jb2.setBackground(Color.GREEN);
        jb3.setBackground(Color.BLUE);

        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout(FlowLayout.RIGHT));

        jp2.add(new JButton("A"));
        jp2.add(new JButton("B"));
        jp2.add(new JButton("C"));

        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(1,2));
        jp3.add(jp);
        jp3.add(jp2);

        jf.setLayout(new BorderLayout());
        jf.add(jp3,BorderLayout.PAGE_START);



        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jf.add(jScrollPane);


        jb1.addActionListener(
                (e) -> {
                    jTextArea.setForeground(Color.RED);
                }
        );

        jb2.addActionListener(
                (e) -> {
                    jTextArea.setForeground(Color.GREEN);
                }
        );


        jb3.addActionListener(
                (e) -> {
                    jTextArea.setForeground(Color.BLUE);
                }
        );


        JPanel jp4 = new JPanel();
        jp4.setLayout(new GridLayout(3,3));
        JPanel jp7 = new JPanel();

        jp7.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp7.add(new JButton("1"));
        jp7.add(new JButton("2"));
        jp7.add(new JButton("3"));

        jp4.add(jp7);

        JPanel jp8 = new JPanel();
        jp8.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp8.add(new JButton("4"));
        jp8.add(new JButton("5"));
        jp8.add(new JButton("6"));

        jp4.add(jp8);

        JPanel jp9 = new JPanel();
        jp9.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp9.add(new JButton("7"));
        jp9.add(new JButton("8"));
        jp9.add(new JButton("9"));

        jp4.add(jp9);

        JPanel jp5 = new JPanel();
        jp5.setLayout(new GridLayout(3,1));

        JTextField jTextField1 = new JTextField();
        JTextField jTextField2 = new JTextField();
        JTextField jTextField3 = new JTextField();

        jTextField1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jTextArea.setText(jTextArea.getText()+"\n"+jTextField1.getText());
                        jTextField1.setText("");
                    }
                }
        );

        jTextField2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jTextArea.setText(jTextArea.getText()+"\n"+jTextField2.getText());
                        jTextField2.setText("");
                    }
                }
        );

        jTextField3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jTextArea.setText(jTextArea.getText()+"\n"+jTextField3.getText());
                        jTextField3.setText("");
                    }
                }
        );

        jp5.add(jTextField1);
        jp5.add(jTextField2);
        jp5.add(jTextField3);

        JPanel jp6 = new JPanel();
        jp6.setLayout(new GridLayout(1,2));
        jp6.add(jp4);
        jp6.add(jp5);

        jf.add(jp6,BorderLayout.PAGE_END);

        jf.pack();

        jf.setVisible(true);


    }


}
