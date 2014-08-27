package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Electrodomestico;
import entidades.Lavarropas;
import entidades.Television;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class JModificacion extends JFrame {

	private JPanel contentPane;
	private Electrodomestico electrodomestico;
	private JTextField txtPrecioBase;
	private JTextField txtPeso;
	private JComboBox cmbColor;
	private JComboBox cmbConsumo;
	private JTextPane txtDescripcion;
	private JCheckBox chkTDT;
	private JTextField txtResolucion;
	private JTextField txtCarga;

	
	public JModificacion(Electrodomestico e) {
		
		this.electrodomestico = e;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblModificacin = new JLabel("Modificaci\u00F3n");
		lblModificacin.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel = new JPanel();
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnAceptar = new JButton("Aceptar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblModificacin)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnAceptar)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnCancelar))
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(149, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblModificacin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptar))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("Precio Base");
		
		JLabel lblPeso = new JLabel("Peso");
		
		JLabel lblNewLabel_1 = new JLabel("Color");
		
		JLabel lblConsumo = new JLabel("Consumo");
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		
		cmbColor = new JComboBox();
		
		cmbConsumo = new JComboBox();
		
		txtDescripcion = new JTextPane();
		
		JLabel lblTdt = new JLabel("TDT");
		
		chkTDT = new JCheckBox("");
		
		JLabel lblResolucion = new JLabel("Resolucion");
		
		txtResolucion = new JTextField();
		txtResolucion.setColumns(10);
		
		JLabel lblCarga = new JLabel("Carga");
		
		txtCarga = new JTextField();
		txtCarga.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblDescripcin)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblPeso)
								.addComponent(lblNewLabel_1)
								.addComponent(lblConsumo))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(cmbConsumo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtPrecioBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cmbColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(68)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblTdt)
												.addGroup(gl_panel.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblCarga)))
											.addGap(40))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblResolucion)
											.addGap(18)))
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(chkTDT)
										.addComponent(txtResolucion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtPrecioBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCarga)
						.addComponent(txtCarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPeso)
								.addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblResolucion)
								.addComponent(txtResolucion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(cmbColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConsumo)
								.addComponent(cmbConsumo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDescripcin)
								.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(chkTDT)
								.addComponent(lblTdt))))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		if(this.electrodomestico instanceof Television){
			
			lblCarga.setVisible(false);
			this.txtCarga.setVisible(false);
		}
		
		else if(this.electrodomestico instanceof Lavarropas){
			
			lblResolucion.setVisible(false);
			lblTdt.setVisible(false);
			this.chkTDT.setVisible(false);
			this.txtResolucion.setVisible(false);
			
		}
	}
}
