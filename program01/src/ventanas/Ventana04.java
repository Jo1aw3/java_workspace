package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana04 extends JFrame implements ActionListener, WindowsListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtConsulta;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private JTextField txtEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana04 frame = new Ventana04();
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
	public Ventana04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel01 = new JPanel();
		contentPane.add(panel01, BorderLayout.CENTER);
		panel01.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(34, 82, 49, 14);
		panel01.add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(34, 121, 49, 14);
		panel01.add(lblEmail);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(34, 159, 49, 14);
		panel01.add(lblEdad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(110, 79, 96, 20);
		panel01.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(110, 118, 96, 20);
		panel01.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(110, 156, 96, 20);
		panel01.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblInfo = new JLabel("Consulta de mas Información");
		lblInfo.setBounds(34, 30, 151, 14);
		panel01.add(lblInfo);
		
		JLabel lblEstado = new JLabel(". . .");
		lblEstado.setBounds(34, 205, 49, 14);
		panel01.add(lblEstado);
		
		JPanel panel02 = new JPanel();
		contentPane.add(panel02, BorderLayout.EAST);
		panel02.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblConsulta = new JLabel("Escribe tu consulta");
		lblConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		panel02.add(lblConsulta);
		
		txtConsulta = new JTextField();
		panel02.add(txtConsulta);
		txtConsulta.setColumns(20);
		
		JButton btnEnviar = new JButton("Enviar");
		contentPane.add(btnEnviar, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(this,(String)"Prueba de Cuadros de Diálogo","Cuadro de Diálogo Mensaje",JOptionPane.INFORMATION_MESSAGE,null);
	}

}
