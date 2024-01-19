package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class EjercicioFormulario extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblTitulo;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JRadioButton rbtnProfesor; 
	private JRadioButton rbtnAlumno;
	private JLabel lblIdioma;
	private JCheckBox chkEspañol;
	private JCheckBox chkEuskera;
	private JCheckBox chkIngles;
	private JButton btnEnviar;
	private ButtonGroup grupo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioFormulario frame = new EjercicioFormulario();
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
	public EjercicioFormulario() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTitulo = new JLabel("CIFP Zornotza LHII");
		lblTitulo.setFont(new Font("Noto Sans", Font.ITALIC, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(65, 64, 50, 13);
		panel.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(65, 100, 50, 13);
		panel.add(lblApellido);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(160, 61, 96, 19);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBounds(160, 97, 96, 19);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		rbtnProfesor = new JRadioButton("Profesor");
		rbtnProfesor.setBounds(280, 60, 103, 21);
		panel.add(rbtnProfesor);
		
		rbtnAlumno = new JRadioButton("Alumno");
		rbtnAlumno.setBounds(280, 96, 103, 21);
		panel.add(rbtnAlumno);
				
		lblIdioma = new JLabel("idiomas que conoces");
		lblIdioma.setBounds(160, 141, 100, 13);
		panel.add(lblIdioma);
		
		chkEspañol = new JCheckBox("Español");
		chkEspañol.setBounds(65, 162, 93, 21);
		panel.add(chkEspañol);

		chkEuskera = new JCheckBox("Esukera");
		chkEuskera.setBounds(181, 162, 93, 21);
		panel.add(chkEuskera);

		chkIngles = new JCheckBox("Ingles");
		chkIngles.setBounds(290, 162, 93, 21);
		panel.add(chkIngles);
		
		txtNombre.addActionListener(this);
		txtApellido.addActionListener(this);
		rbtnProfesor.addActionListener(this);
		rbtnAlumno.addActionListener(this);
		chkEspañol.addActionListener(this);
		chkEuskera.addActionListener(this);
		chkIngles.addActionListener(this);
		
		btnEnviar = new JButton("Enviar");
		contentPane.add(btnEnviar, BorderLayout.SOUTH);
		
		grupo = new ButtonGroup();
		grupo.add(rbtnAlumno);
		grupo.add(rbtnProfesor);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		String idioma = "";
		String persona = "";
		
		if (chkEspañol.isSelected()) {
			idioma = idioma + "Español";
		}
		if (chkEspañol.isSelected()) {
			idioma = idioma + "Euskera";
		}
		if (chkEspañol.isSelected()) {
			idioma = idioma + "Ingles";
		}
		
		if (rbtnProfesor.isSelected()); {
			persona = persona + "profesor";
		}
		if (rbtnAlumno.isSelected()); {
			persona = persona + "Alumno";
		}
		
		
	}
}
