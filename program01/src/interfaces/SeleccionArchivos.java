package interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;

public class SeleccionArchivos extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label_texto;
	private JPanel panel_boton;
	private JButton btn_archivo;
	private JButton btn_color;
	private JButton btn_fuente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionArchivos frame = new SeleccionArchivos();
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
	public SeleccionArchivos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		label_texto = new JLabel("No se ha pulsado un botón");
		label_texto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_texto, BorderLayout.NORTH);
		
		panel_boton = new JPanel();
		contentPane.add(panel_boton, BorderLayout.SOUTH);
		
		btn_archivo = new JButton("Archivo");
		panel_boton.add(btn_archivo);
		
		btn_color = new JButton("Color");
		panel_boton.add(btn_color);
		
		btn_fuente = new JButton("Fuente");
		panel_boton.add(btn_fuente);
		
		btn_archivo.addActionListener(this);
		btn_color.addActionListener(this);
		btn_fuente.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		
		
			// si ha pulsado archivo
		if (o == btn_archivo) {
			JFileChooser fileChooser = new JFileChooser();
			int opcion = fileChooser.showOpenDialog(this);
			if (opcion == JFileChooser.APPROVE_OPTION){
				// si ha pulsado Aceptar
				label_texto.setText("Ha elegido el archivo "+fileChooser.getSelectedFile());
				}
				else if (opcion == JFileChooser.CANCEL_OPTION){
				// si ha pulsado Cancelar
				label_texto.setText("Ha pulsado Cancelar");
				}
				else if (opcion == JFileChooser.ERROR_OPTION){
				// si ha producido un Error
				label_texto.setText("Se ha producido un Error.");
				}
		}
	}	

}
