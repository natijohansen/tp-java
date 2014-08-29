package gui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import entidades.Electrodomestico;

public class TableModelElectrodomestico extends AbstractTableModel {
	
	private ArrayList<Electrodomestico> electrodomesticos;
	
	private String[] headers = {"Descripción"};
	
	public TableModelElectrodomestico(ArrayList<Electrodomestico> electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}
	
	public int getColumnCount() {
		return 1;
	}

	public int getRowCount() {
		return this.electrodomesticos.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
        Electrodomestico e = this.electrodomesticos.get(rowIndex);
           
        return e.toString();
    }
	
	public String getColumnName(int col) {
		return this.headers[col];
	}
	
}
