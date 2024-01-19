package interfaces;

import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class VentanaJTextField extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField texto01;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaJTextField dialog = new VentanaJTextField();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaJTextField() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JButton aceptar01 = new JButton("Aceptar");
			aceptar01.addActionListener(new ActionListener() {
				private AbstractButton label01;

				public void actionPerformed(ActionEvent e) {
					
					label01.setText("Bienvenido" + texto01.getText());

				}
			});
			aceptar01.setBackground(SystemColor.menu);
			aceptar01.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			getContentPane().add(aceptar01, BorderLayout.SOUTH);
		}
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		texto01 = new JTextField();
		texto01.setToolTipText("introduce tu nombre");
		texto01.setText("nombre?");			
		panel.add(texto01);
		texto01.setColumns(10);
		
		JLabel label01 = new JLabel("Anonimo");
		panel.add(label01);
	}

}
