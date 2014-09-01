
package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class JMenu extends JFrame {

	private JPanel contentPane;	

	public JMenu() {
		setTitle("Menú");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblJuaniElectrodomenticos = new JLabel("Juani Electrodomésticos");
		lblJuaniElectrodomenticos.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuaniElectrodomenticos.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
		
		JPanel panel = new JPanel();
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
							.addComponent(lblJuaniElectrodomenticos, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnSalir)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblJuaniElectrodomenticos, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(btnSalir)
					.addContainerGap())
		);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{130, 302, 130, 0};
		gbl_panel.rowHeights = new int[]{80, 80, 80, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		
		//Boton Listado
		JButton btnListadoElectrodomestico = new JButton("Listado Electrodomésticos");
		btnListadoElectrodomestico.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_btnListadoElectrodomestico = new GridBagConstraints();
		gbc_btnListadoElectrodomestico.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListadoElectrodomestico.insets = new Insets(0, 0, 5, 5);
		gbc_btnListadoElectrodomestico.gridx = 1;
		gbc_btnListadoElectrodomestico.gridy = 0;
		panel.add(btnListadoElectrodomestico, gbc_btnListadoElectrodomestico);
		btnListadoElectrodomestico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JListado jl= new JListado();
				jl.setVisible(true);
			}
		});
		
		
		//Boton Baja / Modificacion
		JButton btnBajaModificacion = new JButton("Baja / Modificación");
		btnBajaModificacion.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_btnBajaModificacion = new GridBagConstraints();
		gbc_btnBajaModificacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBajaModificacion.insets = new Insets(0, 0, 5, 5);
		gbc_btnBajaModificacion.gridx = 1;
		gbc_btnBajaModificacion.gridy = 1;
		panel.add(btnBajaModificacion, gbc_btnBajaModificacion);
		btnBajaModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JBajaModificacion jbm= new JBajaModificacion();
				jbm.setVisible(true);
			}
		});
		
		
		//Boton Alta
		JButton btnAltaElectrodomestico = new JButton("Alta Electrodomésticos");
		btnAltaElectrodomestico.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_btnAltaElectrodomestico = new GridBagConstraints();
		gbc_btnAltaElectrodomestico.insets = new Insets(0, 0, 0, 5);
		gbc_btnAltaElectrodomestico.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAltaElectrodomestico.gridx = 1;
		gbc_btnAltaElectrodomestico.gridy = 2;
		panel.add(btnAltaElectrodomestico, gbc_btnAltaElectrodomestico);
		btnAltaElectrodomestico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAltaElectrodomesticos jae= new JAltaElectrodomesticos();
				jae.setVisible(true);
			}
		});
		contentPane.setLayout(gl_contentPane);
	}
}
