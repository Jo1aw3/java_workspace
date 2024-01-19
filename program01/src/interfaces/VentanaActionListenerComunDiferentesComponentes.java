package interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaActionListenerComunDiferentesComponentes extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaActionListenerComunDiferentesComponentes dialog = new VentanaActionListenerComunDiferentesComponentes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaActionListenerComunDiferentesComponentes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton b01 = new JButton("1");
		panel.add(b01);
		
		JButton b02 = new JButton("2");
		panel.add(b02);
		
		JButton b03 = new JButton("3");
		panel.add(b03);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("escoje numero");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(lblNewLabel);
	}

}
