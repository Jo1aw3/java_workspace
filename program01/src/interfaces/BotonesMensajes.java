package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BotonesMensajes extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField text;
	private JPanel panel;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajes frame = new BotonesMensajes();
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
	public BotonesMensajes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		text = new JTextField();
		text.setToolTipText("tu nombre?");
		contentPane.add(text, BorderLayout.NORTH);
		text.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton b1 = new JButton("hola");
		panel.add(b1);
		
		JButton b2 = new JButton("kaixo");
		panel.add(b2);
		
		JButton b3 = new JButton("adios");
		panel.add(b3);
		
		JButton b4 = new JButton("agur");
		panel.add(b4);
		
		JLabel lblNewLabel = new JLabel("No hay Mensaje");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
	}

}
