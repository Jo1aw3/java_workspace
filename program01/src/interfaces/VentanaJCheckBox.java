package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VentanaJCheckBox extends JFrame implements ChangeListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label;
	private JCheckBox chk_negrita;
	private JCheckBox chk_cursiva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJCheckBox frame = new VentanaJCheckBox();
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
	public VentanaJCheckBox() {
		setTitle("VentanaJCheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		label = new JLabel("texto de prueba");
		label.setFont(new Font("Noto Sans", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		
		chk_negrita = new JCheckBox("Negrita");
		contentPane.add(chk_negrita, BorderLayout.WEST);
		chk_negrita.addChangeListener(this);
		
		chk_cursiva = new JCheckBox("Cursiva");
		contentPane.add(chk_cursiva, BorderLayout.EAST);
		chk_cursiva.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		Font nuevaFuente = this.label.getFont();
		int formato = 0;
		
		// actualizo la fuente
		if (this.chk_cursiva.isSelected()){
			
		// si hay que ponerla en cursiva
		formato = formato + Font.ITALIC;
		}
		if (this.chk_negrita.isSelected()){
			
		// si hay que ponerla en negrita
		formato = formato + Font.BOLD;
		}
		
		// actualizo el formato de la fuente
		this.label.setFont(new Font(nuevaFuente.getFamily(), formato, nuevaFuente.getSize()));
		
		
	}


}
