package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;

import logica.ControladorBajaModificacion;

public class JBajaModificacion extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ControladorBajaModificacion cbm;
	private JRadioButton rdbtnTelevisor;
	private JRadioButton rdbtnLavarropas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBajaModificacion frame = new JBajaModificacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JBajaModificacion() {
		cbm = new ControladorBajaModificacion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBajaModificacin = new JLabel("Baja / Modificaci\u00F3n");
		lblBajaModificacin.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel = new JPanel();
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnAceptar = new JButton("Modificar");
		
		JPanel panel_1 = new JPanel();
		
		JButton btnEliminar = new JButton("Eliminar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBajaModificacin))
					.addContainerGap(21, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(287, Short.MAX_VALUE)
					.addComponent(btnEliminar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAceptar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCancelar)
					.addGap(30))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBajaModificacin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptar)
						.addComponent(btnEliminar))
					.addContainerGap())
		);
		
		TableModel dataModel = new AbstractTableModel() {
			
			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getRowCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		table = new JTable(dataModel);
				
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		ButtonGroup bg = new ButtonGroup();
		
		rdbtnTelevisor = new JRadioButton("Televisor");
		rdbtnTelevisor.setSelected(true);
		rdbtnTelevisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//table.set
			}
		});
		
		
		rdbtnLavarropas = new JRadioButton("Lavarropas");
		rdbtnLavarropas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//table.getModel().getRowCount(cbm.getCantidadElectrodomesticos("l"));
			}
		});
		
		bg.add(rdbtnLavarropas);
		bg.add(rdbtnTelevisor);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(122)
					.addComponent(rdbtnTelevisor)
					.addGap(103)
					.addComponent(rdbtnLavarropas)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnLavarropas)
						.addComponent(rdbtnTelevisor))
					.addContainerGap(9, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
