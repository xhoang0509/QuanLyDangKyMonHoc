/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author XuanHoang
 */
public class TableNhomMon extends AbstractTableModel {

    private String Name[] = {"Mã môn", "Tên môn"};

    private Class classess[] = {String.class, String.class};

    ArrayList<NhomMon> dsNhomMon = new ArrayList<NhomMon>();

    public TableNhomMon(ArrayList<NhomMon> nhomMon) {
        dsNhomMon = nhomMon;
    }

    @Override
    public int getRowCount() {
        return dsNhomMon.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

    public Class getColumnClass(int columnIndex) {
        return classess[columnIndex];
    }

    public String getColumnName(int column) {
        return Name[column];
    }
}
