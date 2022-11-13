package Zad20;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class MyDataModel extends AbstractListModel<String> {

    LocalDate dzis = LocalDate.now();;
    Locale lokalizacja = new Locale("PL");

    @Override
    public int getSize() {
        return dzis.lengthOfMonth();
    }

    @Override
    public String getElementAt(int index) {
        LocalDate dzien = LocalDate.of(dzis.getYear(), dzis.getMonth(), index+1);
        return index+1+" - "+dzien.getDayOfWeek().getDisplayName(TextStyle.FULL,lokalizacja);
    }




}
