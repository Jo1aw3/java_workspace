package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOptionPaneShowInputDialog extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	private JButton btn;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneShowInputDialog frame = new JOptionPaneShowInputDialog();
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
	public JOptionPaneShowInputDialog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		label = new JLabel("Anonimo");
		panel.add(label);
		
		btn = new JButton("Entrar");
		contentPane.add(btn, BorderLayout.SOUTH);
		btn.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String respuesta = (String)JOptionPane.showInputDialog(this,(String)"Introduzca su Nombre: ","Cuadro de Diálogo de Introducción de Datos",JOptionPane.QUESTION_MESSAGE,null, null, "Sin Nombre");
		if ( respuesta == null) {
		label.setText("como que te vas");
		}
		else if (respuesta.equals("")){
			label.setText("To Mal");
		}
		else {
			label.setText(respuesta);
		}
		
	}

}
