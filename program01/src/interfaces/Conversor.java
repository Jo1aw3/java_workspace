package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Conversor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textField;
	private JTextField txt_f;
	private JTextField txtKelvin;
	private JTextField txt_c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_norte = new JPanel();
		panel.add(panel_norte, BorderLayout.NORTH);
		
		JLabel lblGradosC = new JLabel("Grados Cº  ");
		panel_norte.add(lblGradosC);
		
		txt_c = new JTextField();
		txt_c.setHorizontalAlignment(SwingConstants.CENTER);
		panel_norte.add(txt_c);
		txt_c.setColumns(25);
		
		JButton bt_clean = new JButton("Clean");
		panel_norte.add(bt_clean);
		
		JPanel panel_centro = new JPanel();
		panel.add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton bt_f = new JButton("Convert to F");
		panel_centro.add(bt_f);
		
		JButton bt_k = new JButton("Convert to K");
		panel_centro.add(bt_k);
		
		JPanel panel_f = new JPanel();
		panel_centro.add(panel_f);
		panel_f.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txt_f = new JTextField();
		txt_f.setToolTipText("introduce temperatura fahrenheit...");
		txt_f.setHorizontalAlignment(SwingConstants.LEFT);
		panel_f.add(txt_f);
		txt_f.setColumns(15);
		
		JPanel panel_k = new JPanel();
		panel_centro.add(panel_k);
		panel_k.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtKelvin = new JTextField();
		txtKelvin.setToolTipText("introduce temperatura kelvin...");
		txtKelvin.setHorizontalAlignment(SwingConstants.LEFT);
		panel_k.add(txtKelvin);
		txtKelvin.setColumns(15);
		
		JPanel panel_sur = new JPanel();
		panel.add(panel_sur, BorderLayout.SOUTH);
		panel_sur.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		panel_sur.add(textField);
		textField.setColumns(10);
	}

}
