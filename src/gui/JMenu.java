
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

public class JMenu extends JFrame {

	private JPanel contentPane;
	private JAltaElectrodomesticos jae;
	

	public JMenu() {
		setTitle("Men\u00FA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblJuaniElectrodomenticos = new JLabel("Juani Electrodom\u00E9sticos");
		lblJuaniElectrodomenticos.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
		
		JButton btnAltaElectrodomestico = new JButton("Alta Electrodom\u00E9sticos");
		btnAltaElectrodomestico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jae == null) {
					jae= new JAltaElectrodomesticos();
				}
				jae.setVisible(true);
			}
		});
		
		JButton btnListadoElectrodomestico = new JButton("Listado Electrodom\u00E9sticos");
		
		JButton btnBajaElectrodomestico = new JButton("Baja Electrodom\u00E9sticos");
		
		JButton btnModificarElectrodomestico = new JButton("Modificar Electrodom\u00E9stico");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(142)
					.addComponent(lblJuaniElectrodomenticos)
					.addContainerGap(171, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(168)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBajaElectrodomestico, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(btnListadoElectrodomestico, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(btnAltaElectrodomestico, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(btnModificarElectrodomestico, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
					.addGap(172))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(lblJuaniElectrodomenticos, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(btnAltaElectrodomestico, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnListadoElectrodomestico, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnBajaElectrodomestico, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnModificarElectrodomestico, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
