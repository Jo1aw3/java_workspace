package interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaActionListenerComun extends JFrame implements ActionListener{…}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nombre01;
	private JPasswordField contra01;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaActionListenerComun dialog = new VentanaActionListenerComun();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaActionListenerComun() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JButton boton00 = new JButton("Aceptar");
			boton00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			getContentPane().add(boton00, BorderLayout.SOUTH);
		}
		
		JPanel panel01 = new JPanel();
		getContentPane().add(panel01, BorderLayout.NORTH);
		
		nombre01 = new JTextField();
		nombre01.setToolTipText("cual es tu nombre?");
		panel01.add(nombre01);
		nombre01.setColumns(10);
		
		JLabel texto01 = new JLabel("nombre");
		panel01.add(texto01);
		
		JPanel panel02 = new JPanel();
		getContentPane().add(panel02, BorderLayout.CENTER);
		
		contra01 = new JPasswordField();
		contra01.setColumns(8);
		panel02.add(contra01);
		
		JLabel texto02 = new JLabel("contraseña");
		panel02.add(texto02);
	}

}
