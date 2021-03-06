package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.CardLayout;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

import entidades.Color;
import entidades.ConsumoEnergetico;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logica.ControladorAlta;
import java.awt.Dialog.ModalExclusionType;

public class JAltaElectrodomesticos extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrecioBase;
	private JTextField txtPeso;
	private JTextField txtResolucion;
	private JTextField txtCarga;
	private JRadioButton rdbtnTelevisor;
	private JRadioButton rdbtnLavarropas;
	private JPanel pnlDatosEspecificos;
	private JComboBox<String> cmbColor;
	private JComboBox<String> cmbConsumo;
	private JCheckBox chkTDT;
	private JTextPane txtDescripcion;
	private ControladorAlta ca;

	public JAltaElectrodomesticos() {
		setResizable(false);
		ca = new ControladorAlta();
		
		setTitle("Alta Electrodomestico");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 611, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel pnlTipoElectrodomestico = new JPanel();
		
		JPanel pnlDatosGenerales = new JPanel();
		
		pnlDatosEspecificos = new JPanel();
		
		
		//Boton Aceptar
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(altaElectrodomestico()){
					dispose();
				}
			}
		});
		
		
		//Boton Cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();			
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(pnlDatosGenerales, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(pnlDatosEspecificos, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnAceptar)
									.addGap(18)
									.addComponent(btnCancelar)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(24))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(pnlTipoElectrodomestico, GroupLayout.PREFERRED_SIZE, 572, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(17, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(pnlTipoElectrodomestico, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlDatosEspecificos, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
						.addComponent(pnlDatosGenerales, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptar))
					.addContainerGap())
		);
		pnlDatosEspecificos.setLayout(new CardLayout(0, 0));
		
		JPanel pnlTelevisor = new JPanel();
		pnlDatosEspecificos.add(pnlTelevisor, "pnl_televisor");
		
		JLabel lblNewLabel_6 = new JLabel("Resolucion");
		
		JLabel lblNewLabel_7 = new JLabel("TDT");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtResolucion = new JTextField();
		txtResolucion.setColumns(10);
		
		chkTDT = new JCheckBox("");
		GroupLayout gl_pnlTelevisor = new GroupLayout(pnlTelevisor);
		gl_pnlTelevisor.setHorizontalGroup(
			gl_pnlTelevisor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTelevisor.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_pnlTelevisor.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_7))
					.addGap(18)
					.addGroup(gl_pnlTelevisor.createParallelGroup(Alignment.LEADING)
						.addComponent(txtResolucion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chkTDT))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		gl_pnlTelevisor.setVerticalGroup(
			gl_pnlTelevisor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTelevisor.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_pnlTelevisor.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtResolucion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6))
					.addGap(27)
					.addGroup(gl_pnlTelevisor.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7)
						.addComponent(chkTDT))
					.addContainerGap(168, Short.MAX_VALUE))
		);
		pnlTelevisor.setLayout(gl_pnlTelevisor);
		
		JPanel pnlLavarropas = new JPanel();
		pnlDatosEspecificos.add(pnlLavarropas, "pnl_lavarropas");
		
		JLabel lblCarga = new JLabel("Carga");
		
		txtCarga = new JTextField();
		txtCarga.setColumns(10);
		GroupLayout gl_pnlLavarropas = new GroupLayout(pnlLavarropas);
		gl_pnlLavarropas.setHorizontalGroup(
			gl_pnlLavarropas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLavarropas.createSequentialGroup()
					.addGap(38)
					.addComponent(lblCarga)
					.addGap(18)
					.addComponent(txtCarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		gl_pnlLavarropas.setVerticalGroup(
			gl_pnlLavarropas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLavarropas.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_pnlLavarropas.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCarga)
						.addComponent(txtCarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(223, Short.MAX_VALUE))
		);
		pnlLavarropas.setLayout(gl_pnlLavarropas);
		
		JLabel lblNewLabel_1 = new JLabel("Precio Base");
		
		JLabel lblNewLabel_2 = new JLabel("Peso");
		
		JLabel lblNewLabel_3 = new JLabel("Color");
		
		JLabel lblNewLabel_4 = new JLabel("Consumo");
		
		JLabel lblNewLabel_5 = new JLabel("Descripcion");
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		
		cmbColor = new JComboBox<String>(Color.COLORES);
		
		cmbConsumo = new JComboBox<String>(ConsumoEnergetico.CONSUMOS);
		//Seleccioma por defecto la "F"
		cmbConsumo.setSelectedIndex(5);
		
		txtDescripcion = new JTextPane();
		GroupLayout gl_pnlDatosGenerales = new GroupLayout(pnlDatosGenerales);
		gl_pnlDatosGenerales.setHorizontalGroup(
			gl_pnlDatosGenerales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosGenerales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosGenerales.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addGap(18)
							.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosGenerales.createSequentialGroup()
							.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1))
							.addGap(18)
							.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.LEADING)
								.addComponent(cmbColor, 0, 158, Short.MAX_VALUE)
								.addComponent(txtPeso, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addComponent(txtPrecioBase, 158, 158, 158)
								.addComponent(cmbConsumo, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_pnlDatosGenerales.setVerticalGroup(
			gl_pnlDatosGenerales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosGenerales.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPrecioBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(26)
					.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(27)
					.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(26)
					.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbConsumo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(27)
					.addGroup(gl_pnlDatosGenerales.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5)
						.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		pnlDatosGenerales.setLayout(gl_pnlDatosGenerales);
		
		ButtonGroup bg = new ButtonGroup();
		
		
		//Elegir televisor
		rdbtnTelevisor = new JRadioButton("Televisor");
		rdbtnTelevisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarPanel("televisor");
			}
		});
		rdbtnTelevisor.setSelected(true);
		
		
		//Elegir lavarropas
		rdbtnLavarropas = new JRadioButton("Lavarropas");
		rdbtnLavarropas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPanel("lavarropas");
			}
		});
		
		bg.add(rdbtnLavarropas);
		bg.add(rdbtnTelevisor);
		
		GroupLayout gl_pnlTipoElectrodomestico = new GroupLayout(pnlTipoElectrodomestico);
		gl_pnlTipoElectrodomestico.setHorizontalGroup(
			gl_pnlTipoElectrodomestico.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTipoElectrodomestico.createSequentialGroup()
					.addGap(94)
					.addComponent(rdbtnTelevisor)
					.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
					.addComponent(rdbtnLavarropas)
					.addGap(116))
		);
		gl_pnlTipoElectrodomestico.setVerticalGroup(
			gl_pnlTipoElectrodomestico.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlTipoElectrodomestico.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_pnlTipoElectrodomestico.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnTelevisor)
						.addComponent(rdbtnLavarropas))
					.addContainerGap())
		);
		pnlTipoElectrodomestico.setLayout(gl_pnlTipoElectrodomestico);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void mostrarPanel(String tipo) {
		CardLayout cl = (CardLayout) pnlDatosEspecificos.getLayout();
		if(tipo.equals("televisor")) {
			cl.show(pnlDatosEspecificos, "pnl_televisor");
		}
		else if(tipo.equals("lavarropas")) {
			cl.show(pnlDatosEspecificos, "pnl_lavarropas");
		}
	}
	
	private boolean altaElectrodomestico() {
		
		try {
			double precioBase = Double.valueOf(txtPrecioBase.getText());
			double peso = Double.valueOf(txtPeso.getText());
		
			String descripcion = txtDescripcion.getText();
			String color = Color.COLORES[cmbColor.getSelectedIndex()];
			String consumo = ConsumoEnergetico.CONSUMOS[cmbConsumo.getSelectedIndex()];
			
			//descripcion vacia
			if(descripcion.equals("")) {
				JOptionPane.showMessageDialog(null, "Descripcion vacia", "Error", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			
			//numeros negativos
			if(precioBase < 0 || peso < 0) {
				JOptionPane.showMessageDialog(null, "No ingrese numeros negativos", "Error", JOptionPane.ERROR_MESSAGE);
				return false;
			}			
			
			if(rdbtnLavarropas.isSelected()) {
				double carga = Double.valueOf(txtCarga.getText());
						
				//numeros negativos
				if(carga < 0) {
					JOptionPane.showMessageDialog(null, "No ingrese numeros negativos", "Error", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				
				ca.altaElectrodomestico(precioBase, peso, descripcion, color, consumo, carga);
				JOptionPane.showMessageDialog(null, "Se ha cargado el electrodomestico", "Carga exitosa", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(rdbtnTelevisor.isSelected()) {
				double resolucion = Double.valueOf(txtResolucion.getText());
				boolean tdt = chkTDT.isSelected();
				
				//numeros negativos
				if(resolucion < 0) {
					JOptionPane.showMessageDialog(null, "No ingrese numeros negativos", "Error", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				
				ca.altaElectrodomestico(precioBase, peso, descripcion, color, consumo, resolucion, tdt);
				JOptionPane.showMessageDialog(null, "Se ha cargado el electrodomestico", "Carga exitosa", JOptionPane.INFORMATION_MESSAGE);
			}
		
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Verificar campos numericos", "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}		
	}
}


