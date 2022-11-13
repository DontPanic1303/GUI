package Zad21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] arg) {

        JFrame jFrame = new JFrame("Capitals");
        jFrame.setLayout(new  BorderLayout());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(400,600);


        JTextField jTextField = new JTextField();
        jFrame.add(jTextField, BorderLayout.PAGE_START);

        MyModel myModel = new MyModel();
        JList jList = new JList(myModel);
        JScrollPane jScrollPane = new JScrollPane(jList);
        jFrame.add(jScrollPane,BorderLayout.CENTER);


        jList.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JList list = (JList)e.getSource();
                        if (e.getClickCount()==2){
                            ArrayList arrayList = new ArrayList(list.getSelectedValuesList());
                            if (e.isShiftDown()||e.isControlDown()) {
                                for (int i = 0; i < arrayList.size(); i++) {
                                    for (int j = 0; j < myModel.getSize(); j++) {
                                        if (arrayList.get(i) == myModel.getElementAt(j))
                                            myModel.remove(j);
                                    }
                                }
                            } else {
                                int tmp = jList.getSelectedIndex();
                                if (tmp != -1) {
                                    myModel.remove(tmp);
                                }
                            }

                        }
                    }
                }
        );

        jList.setCellRenderer(
                new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index,
                                                                  boolean isSelected, boolean cellHasFocus) {
                        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (isSelected) {
                            setBackground(Color.YELLOW);
                            setForeground(Color.RED);
                        }
                        return c;
                    }
                }
        );

        jTextField.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        myModel.add(jTextField.getText());
                        jTextField.setText("");
                    }
                }
        );


        jFrame.setVisible(true);


        
    }

}
