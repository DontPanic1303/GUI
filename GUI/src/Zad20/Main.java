package Zad20;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {

        MyDataModel myDataModel = new MyDataModel();
        JList mylisy = new JList(myDataModel);
        mylisy.setSelectedIndex(myDataModel.dzis.getDayOfMonth()-1);

        JFrame jFrame = new JFrame(myDataModel.dzis.getMonthValue()+"."+myDataModel.dzis.getYear());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300,400);


        JScrollPane jScrollPane = new JScrollPane(mylisy);
        jFrame.add(jScrollPane);


        jFrame.setVisible(true);

    }

}
