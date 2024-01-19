package exm;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Examen1Login extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JTextField txtNombre;
	private JPasswordField txtPass;
	private JLabel lblUsuario;
	private JLabel lblPass;
	private JLabel lblHola;
	private JButton btnAceptar;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Login frame = new Examen1Login();
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
	public Examen1Login() {
		setTitle("Examen de Joshua Botello");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblUsuario = new JLabel("Usuario");
		panel.add(lblUsuario);
		
		txtNombre = new JTextField();
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblPass = new JLabel("Password");
		panel.add(lblPass);
		
		txtPass = new JPasswordField();
		txtPass.setPreferredSize(new Dimension(100, 20));
		panel.add(txtPass);
		
		
		lblHola = new JLabel("Hola!");
		lblHola.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		lblHola.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHola, BorderLayout.CENTER);
		
		btnAceptar = new JButton("Aceptar");
		contentPane.add(btnAceptar, BorderLayout.SOUTH);
		
		txtNombre.addActionListener(this);
		txtPass.addActionListener(this);
		btnAceptar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		//Object o = ae.getSource();
		
		txtNombre.getText();
		String pass = new String(txtPass.getPassword());
		
		
		//int intentos = 0;
		if (txtNombre.equals("joshua") && pass.equals("botello")) {
			lblHola.setText("Esto es una prueba...");
			//while (intentos > 3) {
		//}
		}
		else {
			lblHola.setText("Intentalo de nuevo");	
		}
	}

}
