package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana01 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPassword;
	private JLabel lblNombre;
	private	JLabel lblPassword;
	private JLabel lblEstado;
	private JButton btnEntrar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana01 frame = new Ventana01();
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
	public Ventana01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(98, 55, 67, 14);
		contentPane.add(lblNombre);
		
		lblPassword = new JLabel("Contraseña");
		lblPassword.setBounds(98, 105, 67, 14);
		contentPane.add(lblPassword);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(224, 52, 96, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.addActionListener(this);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(224, 102, 96, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		txtPassword.addActionListener(this);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(224, 143, 89, 23);
		contentPane.add(btnEntrar);
		btnEntrar.addActionListener(this);
		
		lblEstado = new JLabel(". . .");
		lblEstado.setBounds(35, 238, 49, 14);
		contentPane.add(lblEstado);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		txtNombre.getText();
		txtPassword.getText();
		
		if txtPassword(txtNombre); {
		
		}
		
	}
}
