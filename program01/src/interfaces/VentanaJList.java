package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class VentanaJList extends JFrame implements ListSelectionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTexto;
	private JList<String> lstGrupos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJList frame = new VentanaJList();
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
	public VentanaJList() {
		setTitle("JList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTexto = new JLabel("no se ha seleccionado ningun grupo");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Noto Sans", Font.PLAIN, 15));
		contentPane.add(lblTexto, BorderLayout.NORTH);
		
		lstGrupos = new JList<String>();
		contentPane.add(lstGrupos, BorderLayout.CENTER);
		String[] opciones = { "1AS3", "2AS3", "1DW3", "2DW3" };
		lstGrupos = new JList<String>(opciones);
		lstGrupos.addListSelectionListener(this);
		contentPane.add(lstGrupos, BorderLayout.WEST);
	}

	@Override
	public void valueChanged(ListSelectionEvent lse) {
		// TODO Auto-generated method stub
		// cambio el valor de la etiqueta
		
		String seleccion = (String) this.lstGrupos.getSelectedValue();
		this.lblTexto.setText(seleccion);
	}

}
