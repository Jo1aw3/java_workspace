package interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JRadioButton_Err0rJavax extends JFrame implements ActionListener, ChangeListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox chk_negrita;
	private JCheckBox chk_cursiva;
	private JPanel panel_radio;
	private JLabel label_txt;
	private JRadioButton_Err0rJavax radio_negro;
	private JRadioButton_Err0rJavax radio_rojo;
	private JRadioButton_Err0rJavax radio_azul;
	private ButtonGroup btgColores;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton_Err0rJavax frame = new JRadioButton_Err0rJavax();
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
	public JRadioButton_Err0rJavax() {
		setTitle("JRadioButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_chk = new JPanel();
		contentPane.add(panel_chk, BorderLayout.NORTH);
		
		chk_negrita = new JCheckBox("Negrita");
		panel_chk.add(chk_negrita);
		chk_negrita.addChangeListener(this);
		
		chk_cursiva = new JCheckBox("Cursiva");
		panel_chk.add(chk_cursiva);
		chk_cursiva.addChangeListener(this);
		
		panel_radio = new JPanel();
		contentPane.add(panel_radio, BorderLayout.SOUTH);
		
		javax.swing.JRadioButton radio_negro = new javax.swing.JRadioButton("Negro");
		radio_negro.setForeground(new Color(0, 0, 0));
		panel_radio.add(radio_negro);
		radio_negro.addActionListener(this);
		
		javax.swing.JRadioButton radio_rojo = new javax.swing.JRadioButton("Rojo");
		radio_rojo.setForeground(new Color(255, 0, 0));
		panel_radio.add(radio_rojo);
		radio_rojo.addActionListener(this);
		
		javax.swing.JRadioButton radio_azul = new javax.swing.JRadioButton("Azul");
		radio_azul.setForeground(new Color(0, 128, 255));
		panel_radio.add(radio_azul);
		radio_azul.addActionListener(this);
		
		btgColores = new ButtonGroup();
		btgColores.add(radio_negro);
		btgColores.add(radio_rojo);
		btgColores.add(radio_azul);
		
		label_txt = new JLabel("texto de prueba");
		label_txt.setFont(new Font("Noto Sans", Font.PLAIN, 20));
		label_txt.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_txt, BorderLayout.CENTER);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		Font nuevaFuente = this.label_txt.getFont();
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
		this.label_txt.setFont(new Font(nuevaFuente.getFamily(), formato, nuevaFuente.getSize()));
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		// compruebo que JRadioButton se ha pulsado
		Object o = ae.getSource();
		
		if (o == this.radio_negro){
			// si se ha pulsado negro
			this.label_txt.setForeground(Color.BLACK);
		}
		else if (o == this.radio_rojo){
			// si se ha pulsado rojo
			this.label_txt.setForeground(Color.RED);
		}
		else if (o == this.radio_azul){
			// si se ha pulsado azul
			this.label_txt.setForeground(Color.BLUE);
		}
		
		
	}

}
