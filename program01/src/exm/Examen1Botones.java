package exm;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Examen1Botones extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JPanel panel;
	private JButton btnPrimo;
	private JButton btnParImpar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Botones frame = new Examen1Botones();
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
	public Examen1Botones() {
		setTitle("Bienvenido Joshua");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		txtNumero = new JTextField();
		contentPane.add(txtNumero, BorderLayout.NORTH);
		txtNumero.setColumns(10);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnPrimo = new JButton("Es Primo");
		panel.add(btnPrimo);
		
		btnParImpar = new JButton("Par o Impar");
		panel.add(btnParImpar);
		
		JLabel lblEstado = new JLabel(". . .");
		contentPane.add(lblEstado, BorderLayout.SOUTH);
		
		txtNumero.addActionListener(this);
		btnPrimo.addActionListener(this);
		btnParImpar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

	}

}
