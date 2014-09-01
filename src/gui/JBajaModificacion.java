package gui;

import java.awt.Dialog.ModalExclusionType;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTable;

import logica.ControladorBajaModificacion;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JBajaModificacion extends JFrame {

	private JPanel contentPane;
	private ControladorBajaModificacion cbm;
	private JTable table;

	public JBajaModificacion() {
		setResizable(false);
		cbm = new ControladorBajaModificacion();
		
		setTitle("Baja / Modificación Electrodomésticos");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 687, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//Boton Cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		
		//Boton Modificar
		JButton btnAceptar = new JButton("Modificar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarElectrodomestico();
			}
		});
		
		
		//Boton Eliminar
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarElectrodomestico();
			}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(btnEliminar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAceptar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCancelar)
					.addGap(30))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptar)
						.addComponent(btnEliminar))
					.addContainerGap())
		);
		
		
		//Tabla
		TableModel dataModel = new TableModelElectrodomestico(cbm.getElectrodomesticos());
		
		table = new JTable(dataModel);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.setViewportView(table);
		scrollPane.setColumnHeaderView(table.getTableHeader());
				
		contentPane.setLayout(gl_contentPane);
	}		
	
	private void eliminarElectrodomestico() {
		if(this.table.getSelectedRow() ==-1) {
			JOptionPane.showMessageDialog(null, "Seleccione un electrodoméstico", "Error", JOptionPane.ERROR_MESSAGE);	
		}
		else {
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminarlo?", "Eliminar", JOptionPane.WARNING_MESSAGE);
		
			if(respuesta == 0) {
				cbm.borrarElectrodomestico(this.table.getSelectedRow());
				((TableModelElectrodomestico) this.table.getModel()).fireTableDataChanged();
			}
		}
	}
	
	private void modificarElectrodomestico() {
		if(this.table.getSelectedRow() ==-1) {
			JOptionPane.showMessageDialog(null, "Seleccione un electrodoméstico", "Error", JOptionPane.ERROR_MESSAGE);	
		}
		else {
			int indexTabla = this.table.getSelectedRow();
			
			JModificacion jm = new JModificacion(cbm.getElectrodomestico(indexTabla), this.cbm);
			jm.setVisible(true);
			
			((TableModelElectrodomestico) this.table.getModel()).fireTableDataChanged();
		}
	}
}

