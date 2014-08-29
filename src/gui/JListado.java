package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import entidades.ConsumoEnergetico;
import entidades.Electrodomestico;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JCheckBox;

import logica.ControladorListado;

public class JListado extends JFrame {

	private JPanel contentPane;
	private JTextField txtImporteMenor;
	private JTextField txtImporteMayor;
	private JComboBox cmbConsumo;
	private JCheckBox chkConsumo;
	private JCheckBox chkImporte;
	private ControladorListado cl;
	private ArrayList<Electrodomestico> electrodomesticos;

	public JListado() {
		setTitle("Buscar");
		this.cl = new ControladorListado();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblListado = new JLabel("Listado");
		lblListado.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JPanel panel_2 = new JPanel();
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblListado)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnBuscar)
								.addGap(18)
								.addComponent(btnCancelar))
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 563, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblListado)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnBuscar))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblConsumo = new JLabel("Consumo");
		cmbConsumo = new JComboBox(ConsumoEnergetico.CONSUMOS);
		
		chkConsumo = new JCheckBox("");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConsumo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chkConsumo)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(56, Short.MAX_VALUE)
					.addComponent(cmbConsumo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(55))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblConsumo)
						.addComponent(chkConsumo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cmbConsumo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel = new JPanel();
		
		JLabel lblImporte = new JLabel("Importe");
		
		JLabel lblDesde = new JLabel("Min");
		
		txtImporteMenor = new JTextField();
		txtImporteMenor.setColumns(10);
		
		JLabel lblHasta = new JLabel("Max");
		
		txtImporteMayor = new JTextField();
		txtImporteMayor.setColumns(10);
		
		chkImporte = new JCheckBox("");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(lblDesde)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtImporteMenor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(60)
							.addComponent(lblHasta)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtImporteMayor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblImporte)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chkImporte)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblImporte)
						.addComponent(chkImporte))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDesde)
						.addComponent(txtImporteMenor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHasta)
						.addComponent(txtImporteMayor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
					.addGap(131))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void buscar() {
		if(this.chkConsumo.isSelected() && this.chkImporte.isSelected()) {
			try {
				double min = Double.valueOf(txtImporteMenor.getText());
				double max = Double.valueOf(txtImporteMayor.getText());
				if(min <= max) {
					this.electrodomesticos = cl.buscar(min, max, ConsumoEnergetico.CONSUMOS[this.cmbConsumo.getSelectedIndex()]);
					System.out.println("holas");
				}
				else {
					JOptionPane.showMessageDialog(null, "Min debe ser menor a Max", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Min y Max deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
			}			
		}
		
		else if(this.chkConsumo.isSelected()) {
			this.electrodomesticos = cl.buscar(ConsumoEnergetico.CONSUMOS[this.cmbConsumo.getSelectedIndex()]);
		}
		
		else if(this.chkImporte.isSelected()) {
			try {
				double min = Double.valueOf(txtImporteMenor.getText());
				double max = Double.valueOf(txtImporteMayor.getText());
				
				if(min <= max) {
					this.electrodomesticos = cl.buscar(min, max);
				}
				else {
					JOptionPane.showMessageDialog(null, "Min debe ser menor a Max", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Min y Max deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		if(electrodomesticos.isEmpty()) {

			JOptionPane.showMessageDialog(null, "No se encontraron resultados","Lo sentimos", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
	
			JListadoTabla jlt = new JListadoTabla(electrodomesticos);
			jlt.setVisible(true);
		}
	}
}
