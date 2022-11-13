package Zad21;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class MyModel extends AbstractListModel<String> {

    ArrayList<String> arrayList = new ArrayList<String>();


    @Override
    public int getSize() {
        return arrayList.size();
    }

    @Override
    public String getElementAt(int index) {
        return arrayList.get(index);
    }

    public void add(String k){
        boolean kot = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (k.equals(arrayList.get(i)))
                kot = false;
        }
        if (kot)
        arrayList.add(k);
        Collections.sort(arrayList);
        fireContentsChanged(this,0,arrayList.size());
    }

    public void remove(int k){
        arrayList.remove(k);
        fireContentsChanged(this,0,arrayList.size());
    }



}
