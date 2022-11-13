package Zad17;

import java.awt.*;
import javax.swing.*;

public class Zadanie17 {

    private Color[] colors = {Color.GRAY,Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.RED};
    private int i = 1;

    public static void main(String[] args)
    {
        new Zadanie17();
    }

    public Zadanie17(){
        SwingUtilities.invokeLater(
                () ->swz17()
        );
    }

    protected void swz17(){

        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        JButton jb = new JButton("Zmieniacz kolorow!");
        jb.setBackground(colors[0]);

        jb.addActionListener(
                (e) -> {
                    jb.setBackground(colors[i++]);
                    if (i>=colors.length)
                        i=0;
                }
        );

        jp.add(jb);
        jf.add(jp);

        jf.pack();

        jf.setVisible(true);


    }

}
