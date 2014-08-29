package gui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import entidades.Electrodomestico;

public class TableModelElectrodomestico extends AbstractTableModel {
	
	private ArrayList<Electrodomestico> electrodomesticos;
	
	public TableModelElectrodomestico(ArrayList<Electrodomestico> electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}
	
	public int getColumnCount() {
		return 2;
	}

	public int getRowCount() {
		return this.electrodomesticos.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
        Electrodomestico e = this.electrodomesticos.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = rowIndex;
                break;
            case 1:
                value = e.toString();
                break;
        }
        return value;
    } 
}
